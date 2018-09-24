package com.example.android.recycleviewtest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GuardianApi {

    @GET("search")
    Call<News> getData(
            @Query("api-key") String key);
}
