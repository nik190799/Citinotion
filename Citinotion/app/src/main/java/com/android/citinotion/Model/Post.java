package com.android.citinotion.Model;

import android.widget.TextView;

public class Post {
    private String postid;
    private String postimage;
    private String description;
    private String publisher,address;

    public Post(String postid, String postimage, String description, String publisher ,String postaddress) {
        this.postid = postid;
        this.postimage = postimage;
        this.description = description;
        this.publisher = publisher;
       // this.address = postaddress;
    }

    public Post() {
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getPostimage() {
        return postimage;
    }

    public void setPostimage(String postimage) {
        this.postimage = postimage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


//    public String getAddress(){return address ;}
//    public void setAddress(String address) {
//        this.address = address;
//    }


}
