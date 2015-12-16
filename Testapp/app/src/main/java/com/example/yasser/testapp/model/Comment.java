package com.example.yasser.testapp.model;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */
public class Comment {
    private int id;
    private String body;

    public Comment(int id, String body) {
        this.id = id;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
