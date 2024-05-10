package com.example.food_app_v_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;


import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.CameraUpdateFactory;

public class StoreOnMap extends AppCompatActivity implements OnMapReadyCallback{

    GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_on_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        myMap = googleMap;
        LatLng kottawa = new LatLng(6.8412, 79.9654);
        LatLng maharagama = new LatLng(6.8511, 79.9212);
        LatLng nugegoda = new LatLng(6.8649, 79.8997);
        LatLng dehiwala = new LatLng(6.8559, 79.8630);

        myMap.addMarker(new MarkerOptions().position(kottawa).title("Kottawa"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(kottawa));
        myMap.addMarker(new MarkerOptions().position(maharagama).title("Maharagama"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(maharagama));
        myMap.addMarker(new MarkerOptions().position(nugegoda).title("Nugegoda"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(nugegoda));
        myMap.addMarker(new MarkerOptions().position(dehiwala).title("Dehiwala"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(dehiwala));


    }
}