package com.example.yasser.testapp.util;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */



import com.example.yasser.testapp.model.User;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;


public interface PublicApiRoutes {




    @POST("/users")
    @FormUrlEncoded
    void login(@Field("session[fbtoken]") String token, Callback<User> callback);



	/*
	@GET("/products")
	void getProducts(Callback<List<Product>> callback);
	*/
}