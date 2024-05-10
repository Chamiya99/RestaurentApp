package com.example.food_app_v_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.food_app_v_3.Drinks.CappuccinoFull;
import com.example.food_app_v_3.Drinks.FaludaFull;
import com.example.food_app_v_3.Drinks.MojitoFull;
import com.example.food_app_v_3.Drinks.MoketailFull;
import com.example.food_app_v_3.Foods.BiriyaniFull;
import com.example.food_app_v_3.Foods.BurgerFull;
import com.example.food_app_v_3.Foods.ChineseFull;
import com.example.food_app_v_3.Foods.PizzaFull;

public class DrinkItemView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_item_view);


        ConstraintLayout btn0f1 = findViewById(R.id.btn_f_1);
        btn0f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DrinkItemView.this, CappuccinoFull.class));
            }
        });
        ConstraintLayout btn0f2 = findViewById(R.id.btn_f_2);
        btn0f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DrinkItemView.this, MoketailFull.class));
            }
        });
        ConstraintLayout btn0f3 = findViewById(R.id.btn_f_3);
        btn0f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DrinkItemView.this, FaludaFull.class));
            }
        });
        ConstraintLayout btn0f4 = findViewById(R.id.btn_f_4);
        btn0f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DrinkItemView.this, MojitoFull.class));
            }
        });
    }
}