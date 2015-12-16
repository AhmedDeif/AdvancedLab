package com.example.yasser.testapp;

import java.util.ArrayList;

/**
 * Created by Yasser on 16/12/15.
 */
public class Post {
    private String post;
    private String user_name;
    private ArrayList<String> comments;

    public Post(String post, String user_name,ArrayList<String> comments){
        this.post =post;
        this.user_name = user_name;
        this.comments=comments;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }
}
