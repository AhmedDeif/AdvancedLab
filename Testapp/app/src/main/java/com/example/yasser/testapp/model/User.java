package com.example.yasser.testapp.model;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */
public class User {
    private long uid;
    private String name;
    private String email;
    private String country;
    private String committee;
    private String city;
    private String gender;
    private String token;


    public User(long uid, String name, String email, String country, String committee, String city, String gender, String token) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.country = country;
        this.committee = committee;
        this.city = city;
        this.gender = gender;
        this.token = token;
    }


    public long getUid() {

        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCommittee() {
        return committee;
    }

    public void setCommittee(String committee) {
        this.committee = committee;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
