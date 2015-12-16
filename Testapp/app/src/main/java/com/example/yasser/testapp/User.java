package com.example.yasser.testapp;

/**
 * Created by Yasser on 16/12/15.
 */
public class User {
    private String user_name;
    private String img;

    public User(String user_name, String img){
        this.user_name = user_name;
        this.img=img;
    }
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_img() {
        return img;
    }

    public void setUser_img(String img) {
        this.img = img;
    }
}
