package com.example.getpostretro.Get;

import retrofit.RestAdapter;

public class Api {

    public static ApiInterface getClient(){
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("http://mobileappdatabase.in/")
                .build();

        ApiInterface api = adapter.create(ApiInterface.class);
        return api;
    }
}
