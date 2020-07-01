package com.android.citinotion.Model;

public class User {
    private String id;
    private String username;
    private String fullname;
    private String imageurl;
    private String bio;
    private String Post;

    public User(String id, String username, String fullname, String imageurl, String bio,String Post) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.imageurl = imageurl;
        this.bio = bio;
        this.Post = Post;

    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPost(String Post){
        this.Post = Post;
    }
    public String getPost(){
        return Post;
    }
}
