package com.example.yasser.testapp.util;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */
import retrofit.RequestInterceptor;

public class PrivateApiInterceptor implements RequestInterceptor {
    private String token;

    public PrivateApiInterceptor(String token) {
        this.token = token;
    }

    @Override
    public void intercept(RequestFacade request) {
        request.addHeader("Authorization", token);
    }
}