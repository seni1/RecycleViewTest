package com.example.android.recycleviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Result> modelArrayList;
    public static final String KEY = "821e14cc-28be-4754-8198-f252cb12a1a2";

    private RecyclerView recyclerView;
    private ModelAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_list);

        recyclerView = findViewById(R.id.rv_model);
        modelArrayList = new ArrayList<>();
        adapter = new ModelAdapter(modelArrayList);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void getNews() {
        App.getApi().getData(KEY).enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {

            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
    }
}
