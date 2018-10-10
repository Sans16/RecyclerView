package com.example.ssanusi.myreview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyAdapter.adapterInterface{

    RecyclerView recyclerView;
    ArrayList<Pojo> lister;
    MyAdapter adapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView Rv = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Rv.setLayoutManager(layoutManager);
        adapters = new MyAdapter(this);
        Rv.setAdapter(adapters);
        addItems();
    }

    public void addItems(){
        lister = new ArrayList<>();
            lister.add(new Pojo("Brazil","South America",R.drawable.brazil,"Brazil is a wonderful country that all the citizens love football"));
            lister.add(new Pojo("China","Asia",R.drawable.china,"China is the land of technology"));
            lister.add(new Pojo("Russia","Europe",R.drawable.russia,"The antagonist of my dreamland"));
            lister.add(new Pojo("USA","North America",R.drawable.argentina,"The land of my dream"));
            lister.add(new Pojo("New Zealand","Oceania",R.drawable.australia,"Far Far away region"));
            lister.add(new Pojo("Nigeria","Africa",R.drawable.nigeria,"Nigeria my country, the land where politicians are the real MVP"));
            adapters.swap(lister);
    }



}
