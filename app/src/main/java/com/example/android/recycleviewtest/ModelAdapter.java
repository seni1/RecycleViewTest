package com.example.android.recycleviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder> {

    private final ArrayList<Result> modelList;
    private final Context context;
    private ArrayList <Result> mModel;

    public ModelAdapter(Context context, ArrayList<Result> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Result result = modelList.get(position);
        holder.name.setText(result.getWebTitle());
        holder.number.setText(result.getSectionName());

        Glide.with(context).load(result.getFields().getThumbnail()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView number;
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_name);
            number = itemView.findViewById(R.id.tv_number);
            image = itemView.findViewById(R.id.image);
        }

    }

    public void setData(List<Result>list) {
        modelList.addAll(list);
        notifyDataSetChanged();
    }
}
