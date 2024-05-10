package com.example.food_app_v_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.CameraUpdateFactory;

public class StoreDetails extends AppCompatActivity implements OnMapReadyCallback {

    TextView txt_1;
    TextView txt_2;
    TextView txt_3;
    GoogleMap myMap;
    double lat;
    double lng;
    String L_Name;


    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_details);

        txt_1 = findViewById(R.id.txt01);
        txt_2 = findViewById(R.id.txt02);
        txt_3 = findViewById(R.id.txt03);
        txt_1.setText(getIntent().getExtras().getString("Location"));

        if(String.valueOf(getIntent().getExtras().getString("Location")).equals("Kottawa")){
            txt_2.setText("No:56 , Main Road , Kottawa");
            txt_3.setText("10AM - 10PM");
            lat = 6.8412;lng = 79.9654;
        } else if (String.valueOf(getIntent().getExtras().getString("Location")).equals("Maharagama")) {
            txt_2.setText("No:151 ,Pamunuwa Road , Maharagama");
            txt_3.setText("10AM - 10PM");
            lat = 6.8511;lng = 79.9212;
        } else if (String.valueOf(getIntent().getExtras().getString("Location")).equals("Nugegoda")) {
            txt_2.setText("No:25 , Galhena Road , Gangodawila , Nugegoda");
            txt_3.setText("10AM - 10PM");
            lat = 6.8649;lng = 79.8997;
        } else if (String.valueOf(getIntent().getExtras().getString("Location")).equals("Dehiwala")) {
            txt_2.setText("No:71/5 , Galle Road , Dehiwala ");
            txt_3.setText("10AM - 10PM");
            lat = 6.8559;lng = 79.8630;
        }else {
            txt_2.setText("Error_code0006");
            txt_3.setText("Error_code0007");;
        }



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map2);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        myMap = googleMap;
        L_Name = String.valueOf(getIntent().getExtras().getString("Location"));


        LatLng Location = new LatLng(lat, lng);

        myMap.addMarker(new MarkerOptions().position(Location).title(L_Name));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(Location));


    }
}