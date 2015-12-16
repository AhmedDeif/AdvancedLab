package com.example.yasser.testapp;

/**
 * Created by Yasser on 16/12/15.
 */
public class task_item {
    private String title;
    private String img;
    private String desc;
    private String assigner;

    public task_item(String title, String img, String desc, String assigner){
        this.title = title;
        this.img=img;
        this.desc=desc;
        this.assigner=assigner;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getUser_img() {
        return img;
    }

    public void setUser_img(String img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAssigner() {
        return assigner;
    }

    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }
}
