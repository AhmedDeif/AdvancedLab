package com.example.yasser.testapp.util;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */


import com.example.yasser.testapp.model.Task;
import com.example.yasser.testapp.model.User;

import java.util.List;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.Path;

public interface PrivateApiRoutes {









    // ****************************************** Tasks ********************************************

    //  Create new task
    @POST("")
    @FormUrlEncoded
    void createTask(@Field("task[title]") String title, @Field("task[description]") String description,
                    @Field("task[status]") String status, @Field("assigner_id") int assigner_id,
                    @Field("task[assignee_id]") int assignee_id,  Callback<Task> callback);


    // Get a user's tasks
    @GET("/users/getAllTasks")
    void getTasks(Callback<Task> callback);


    // delete task
    @DELETE("")
    @FormUrlEncoded
    void deleteTask(@Field("task[id]") int id, Callback<Response> callback);

    // ****************************************** Users ********************************************





    // Get a user's profile
    @GET("/users/get_current_user")
    void getUser(Callback<User> callback);


    // Get timeline of user, tasks assigned to him and to members of same committee
    @GET("")
    void getTimeLine();





    //



	/*
	@PATCH("/products/{product_id}/buy")
	void patchProductBuy(@Path("product_id") long productId,
						 Callback<Response> callback);
	*/
    /*
    @GET("/users/get_current_user")
    void getUser( Callback<UserData> callback);

    @POST("/users/get_user")
    @FormUrlEncoded
    void getUserUsingId( @Field("user[user_id]") int post_id ,Callback<UserData> callback);

    @POST("/users/remove_friend")
    @FormUrlEncoded
    void removeFriend( @Field("user[user_id]") int post_id ,Callback<Response> callback);

    @POST("/users/accept")
    @FormUrlEncoded
    void accept( @Field("user[user_id]") int post_id ,Callback<Response> callback);

    @POST("/users/reject")
    @FormUrlEncoded
    void reject( @Field("user[user_id]") int post_id ,Callback<Response> callback);

    @POST("/users/add_friend")
    @FormUrlEncoded
    void addFriend(@Field("user[user_id]") int post_id ,Callback<Response> callback);

    @GET("/posts/get_timeline")
    void getTimeline( Callback<List<NewsFeedData>> callback);

    @POST("/posts/friends_posts")
    @FormUrlEncoded
    void getFriendsPosts( @Field("user[user_id]") int user_id ,Callback<List<NewsFeedData>> callback);

    @POST("/users/friends_of_friend")
    @FormUrlEncoded
    void getFriendsFriends( @Field("user[user_id]") int user_id ,Callback<List<UserData>> callback);

    @POST("/users/friends_search")
    @FormUrlEncoded
    void searchFriends( @Field("search[content]") String content ,Callback<List<SearchResultData>> callback);

    @POST("/users/requests_search")
    @FormUrlEncoded
    void searchRequests( @Field("search[content]") String content ,Callback<List<SearchResultData>> callback);

    @POST("/users/pending_search")
    @FormUrlEncoded
    void searchPending( @Field("search[content]") String content ,Callback<List<SearchResultData>> callback);

    @POST("/users/not_friends_search")
    @FormUrlEncoded
    void searchNotFriends( @Field("search[content]") String content ,Callback<List<SearchResultData>> callback);

    @GET("/posts/get_newsfeed")
    void getNewsFeed( Callback<List<NewsFeedData>> callback);

    @GET("/users/get_friends")
    void getFriends( Callback<List<UserData>> callback);

    @GET("/users/requests")
    void getRequests( Callback<List<UserData>> callback);

    @POST("/posts/get_related_comments")
    @FormUrlEncoded
    void getRelatedComments( @Field("post[post_id]") int post_id ,Callback<List<CommentData>> callback);

    @POST("/comments/add_comment")
    @FormUrlEncoded
    void addComment( @Field("comment[post_id]") int post_id ,@Field("comment[user_id]") int user_id,@Field("comment[content]") String content ,Callback<Response> callback);

    @POST("/posts/new_quote")
    @FormUrlEncoded
    void newQuote( @Field("post[genre]") String genre, @Field("post[user_id]") int user_id, @Field("post[timeline_id]") int timeline_id, @Field("post[book]")String book , @Field("post[author]") String author, @Field("post[content]") String content ,Callback<Response> callback);

    @POST("/posts/new_review")
    @FormUrlEncoded
    void newReview( @Field("post[genre]") String genre, @Field("post[user_id]") int user_id, @Field("post[timeline_id]") int timeline_id, @Field("post[book]")String book , @Field("post[author]") String author, @Field("post[content]") String content ,Callback<Response> callback);

    @POST("/posts/new_status")
    @FormUrlEncoded
    void newStatus( @Field("post[genre]") String genre, @Field("post[user_id]") int user_id, @Field("post[timeline_id]") int timeline_id, @Field("post[book]")String book , @Field("post[author]") String author, @Field("post[content]") String content ,Callback<Response> callback);
    */
}