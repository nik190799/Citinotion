package com.android.citinotion.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.citinotion.Adapter.PostAdapter;
import com.android.citinotion.Model.Post;
import com.android.citinotion.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MayorFragment extends Fragment{


//    private RecyclerView recyclerView;
//    private PostAdapter postAdapter;
//    private List<Post> postList;
//    ProgressBar progress_circular;
//
//    private DatabaseReference likesRef,UsersRef;
//    private FirebaseAuth mAuth;
//    private String currentuserid;
//    private List<Post> mPosts;
//    int cnt=0,cnt_users=0;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mayor, container, false);

//        mAuth = FirebaseAuth.getInstance();
//        currentuserid = mAuth.getCurrentUser().getUid();
//        UsersRef = FirebaseDatabase.getInstance().getReference().child("Users");
//        likesRef = FirebaseDatabase.getInstance().getReference().child("Likes");
//
//
//        View view = inflater.inflate(R.layout.fragment_home, container, false);
//
//        recyclerView = view.findViewById(R.id.recycler_view);
//        recyclerView.setHasFixedSize(true);
//        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
//        mLayoutManager.setReverseLayout(true);
//        mLayoutManager.setStackFromEnd(true);
//        recyclerView.setLayoutManager(mLayoutManager);
//        postList = new ArrayList<>();
//        postAdapter = new PostAdapter(getContext(), postList);
//        recyclerView.setAdapter(postAdapter);
//        progress_circular = view.findViewById(R.id.progress_circular);
//
//        final DatabaseReference Mpostref = FirebaseDatabase.getInstance().getReference().child("Posts");
//        final DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Likes");
//        Mpostref.addValueEventListener(new ValueEventListener() {
//
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
//
//                    reference.addValueEventListener(new ValueEventListener() {
//                        @Override
//                        public void onDataChange(DataSnapshot dataSnapshot) {
//                            for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
//                                cnt = (int) dataSnapshot2.getChildrenCount();
//                                if(cnt<cnt_users)
//                                {
//                                    reference.addValueEventListener(new ValueEventListener() {
//                                        @Override
//                                        public void onDataChange(DataSnapshot dataSnapshot) {
//                                            postList.clear();
//                                                Post post = dataSnapshot.getValue(Post.class);
//                                                postList.add(post);
//
//
//
//                                            postAdapter.notifyDataSetChanged();
//                                            progress_circular.setVisibility(View.GONE);
//                                        }
//
//                                        @Override
//                                        public void onCancelled(DatabaseError databaseError) {
//
//                                        }
//                                    });
//                                }
//                            }
//                        }
//
//                        @Override
//                        public void onCancelled(DatabaseError databaseError) {
//
//                        }
//                    });
//                }
//
//                }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//
//
////            @Override
////            public void onCancelled(DatabaseError databaseError) {
////
////            }
////
////            DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Likes");
////        reference.addValueEventListener(new ValueEventListener() {
////            @Override
////            public void onDataChange(DataSnapshot dataSnapshot) {
////                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
////                    cnt = (int) dataSnapshot1.getChildrenCount();
////                }
////            }
////
////            @Override
////            public void onCancelled(DatabaseError databaseError) {
////
////            }
////        });
////
////        if(cnt/cnt_users>=0.5)
////        {
////
////        }
//
//        DatabaseReference userref = FirebaseDatabase.getInstance().getReference().child("Users");
//        userref.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                cnt_users = (int)dataSnapshot.getChildrenCount();
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//
//
//        return inflater.inflate(R.layout.fragment_mayor, container, false);
//    }
//
//
//    private void readPosts(){
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Posts");
//
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                postList.clear();
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
//                    Post post = snapshot.getValue(Post.class);
//                    postList.add(post);
//
//
//                }
//
//                postAdapter.notifyDataSetChanged();
//                progress_circular.setVisibility(View.GONE);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//    }


    }
}