package com.example.referee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final String actionBarColor = "#42515e";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(actionBarColor));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
    }
}