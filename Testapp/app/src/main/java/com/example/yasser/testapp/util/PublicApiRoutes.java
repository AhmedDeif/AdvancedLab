package com.example.yasser.testapp.util;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */



import com.example.yasser.testapp.model.Task;
import com.example.yasser.testapp.model.User;

import java.util.List;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.Path;


public interface PublicApiRoutes {





    //  login user if logged in before or sign up using data from facebook.
    @POST("/sessions/create.json")
    @FormUrlEncoded
    void login(@Field("user[token]") String token,Callback<User> callback);

    @POST("/tasks.json")
    @FormUrlEncoded
    void createTask(@Field("task[title]") String token, Callback<Task> callback);


    // Get a user's tasks
    @GET("/users/getAllTasks")
    @FormUrlEncoded
    void getTasks(@Field("user[id]") int id,Callback<List<Task>> callback);



    @GET("/users/getTimeline/{user_id}")
    void getTimeline(@Path("user_id") int id, Callback<List<Task>> callabck);

    @GET("/users/getFriends/{user_id}")
    void getFriends(@Path("user_id") int id, Callback<List<User>> callabck);


	/*
	@GET("/products")
	void getProducts(Callback<List<Product>> callback);
	*/
}