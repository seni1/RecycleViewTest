package com.example.android.recycleviewtest;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    public static final String BASE_URL = "https://content.guardianapis.com/";
    private static GuardianApi api;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
        addConverterFactory(GsonConverterFactory.create()).build();

        api = retrofit.create(GuardianApi.class);

    }

    public static GuardianApi getApi() {
        return api;
    }
}
