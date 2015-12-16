package com.example.yasser.testapp.model;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */
public class Event {
    private long id;
    private String title;
    private String description;
    private String place;
    private long creator_id;

    public Event(long id, String title, String description, String place, long creator_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.place = place;
        this.creator_id = creator_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(long creator_id) {
        this.creator_id = creator_id;
    }
}
