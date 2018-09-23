package com.example.android.recycleviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> modelArrayList;
    private RecyclerView recyclerView;
    private ModelAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_list);

        recyclerView = findViewById(R.id.rv_model);
        modelArrayList = Model.createContactList();
        adapter = new ModelAdapter(modelArrayList);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
