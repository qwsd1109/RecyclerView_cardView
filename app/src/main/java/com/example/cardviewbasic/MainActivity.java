package com.example.cardviewbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RemoteViews;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<item_data> item_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        item_data = new ArrayList<>();
        adapter=new RecyclerAdater(item_data);
        recyclerView.setAdapter(adapter);

        item_data.add(new item_data("1",R.drawable.download));
        item_data.add(new item_data("2",R.drawable.images));
        item_data.add(new item_data("3",R.drawable.images1));
        item_data.add(new item_data("4",R.drawable.images2));
        item_data.add(new item_data("5",R.drawable.qwsd));
    }
}
