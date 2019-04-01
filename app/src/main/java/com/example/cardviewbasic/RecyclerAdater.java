package com.example.cardviewbasic;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdater extends RecyclerView.Adapter<RecyclerAdater.ViewHolder> {
    private ArrayList<item_data>item_data;
    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.image);
            textView = (TextView)itemView.findViewById(R.id.title);
        }
    }

    public RecyclerAdater(ArrayList<item_data> mydata){
        item_data = mydata;
    }

    @NonNull
    @Override
    public RecyclerAdater.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(item_data.get(i).text);
        viewHolder.imageView.setImageResource(item_data.get(i).img);
    }

    @Override
    public int getItemCount() {
        return item_data.size();
    }
}
