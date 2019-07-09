package com.example.getpostretro.Post;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("/retrofit/register.php")
    public void registration(@Field("name") String name,
                             @Field("email") String email,
                             @Field("password") String password,
                             Callback<SignUpResponse> callback);
}
