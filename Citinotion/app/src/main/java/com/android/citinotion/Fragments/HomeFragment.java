package com.android.citinotion.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.android.citinotion.Adapter.PostAdapter;
import com.android.citinotion.Model.Post;

import com.android.citinotion.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private PostAdapter postAdapter;
    private List<Post> postList;

//    private RecyclerView recyclerView_story;
//    private StoryAdapter storyAdapter;
//    private List<Story> storyList;

    private List<String> followingList;

    ProgressBar progress_circular;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mLayoutManager.setReverseLayout(true);
        mLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(mLayoutManager);
        postList = new ArrayList<>();
        postAdapter = new PostAdapter(getContext(), postList);
        recyclerView.setAdapter(postAdapter);



        progress_circular = view.findViewById(R.id.progress_circular);

        readPosts();

        return view;
    }

//    private void checkFollowing(){
//        followingList = new ArrayList<>();
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Follow")
//                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
//                .child("following");
//
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                followingList.clear();
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
//                    followingList.add(snapshot.getKey());
//                }
//
//                readPosts();
//               // readStory();
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//    }

    private void readPosts(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Posts");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                postList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    Post post = snapshot.getValue(Post.class);
                            postList.add(post);


                }

                postAdapter.notifyDataSetChanged();
                progress_circular.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

//    private void readStory(){
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Story");
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                long timecurrent = System.currentTimeMillis();
//                storyList.clear();
//                storyList.add(new Story("", 0, 0, "",
//                        FirebaseAuth.getInstance().getCurrentUser().getUid()));
//                for (String id : followingList) {
//                    int countStory = 0;
//                    Story story = null;
//                    for (DataSnapshot snapshot : dataSnapshot.child(id).getChildren()) {
//                        story = snapshot.getValue(Story.class);
//                        if (timecurrent > story.getTimestart() && timecurrent < story.getTimeend()) {
//                            countStory++;
//                        }
//                    }
//                    if (countStory > 0){
//                        storyList.add(story);
//                    }
//                }
//
//                storyAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
    //}
}
