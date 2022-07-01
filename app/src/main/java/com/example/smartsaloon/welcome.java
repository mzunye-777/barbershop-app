package com.example.smartsaloon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void WOMEN(View view) {
        Intent I = new Intent(this, WOMEN.class);
        startActivity(I);


    }

    public void CHILDREN(View view) {
        Intent I = new Intent(this, CHILDREN.class);
        startActivity(I);
    }

    public void MEN(View view) {
        Intent I = new Intent(this, MEN.class);
        startActivity(I);
    }
}