package com.example.smartsaloon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MEN extends AppCompatActivity {



        MaterialCardView master,master1,master2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_men);

            master = findViewById(R.id.master);
            master1 = findViewById(R.id.master2);
            master2 = findViewById(R.id.master3);


            master.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MEN.this,PAY.class);
                    intent.putExtra("name","uko");
                    intent.putExtra("price",5000);
                    startActivity(intent);
                }
            });

            master1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MEN.this,PAY.class);
                    intent.putExtra("name","hair kali");
                    intent.putExtra("price",250);
                    startActivity(intent);
                }
            });

            master2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MEN.this,PAY.class);
                    intent.putExtra("name","twende");
                    intent.putExtra("price",3500);
                    startActivity(intent);
                }
            });
        }
    }
