package com.example.yasser.testapp.util;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */



import com.example.yasser.testapp.model.User;

import java.util.List;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;


public interface PublicApiRoutes {





    //  login user if logged in before or sign up using data from facebook.
    @POST("/sessions/create.json")
    @FormUrlEncoded
    void login(@Field("user[token]") String token,Callback<User> callback);

    @POST("/tasks.json")
    @FormUrlEncoded
    void createTask(@Field("task[title]") String token, Callback<Response> callback);





	/*
	@GET("/products")
	void getProducts(Callback<List<Product>> callback);
	*/
}