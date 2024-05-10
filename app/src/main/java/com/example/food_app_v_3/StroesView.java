package com.example.food_app_v_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


import com.google.android.gms.maps.GoogleMap;

import java.time.Instant;


public class StroesView extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stroes_view);

        //Store Locations
        String[] SLocation = {"Kottawa","Maharagama","Nugegoda","Dehiwala"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this,R.layout.list_item,SLocation);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String S_L = listView.getAdapter().getItem(position).toString();
                Intent intent = new Intent(getApplicationContext(),StoreDetails.class);
                intent.putExtra("Location",S_L);
                startActivity(intent);
            }
        });
    }


}