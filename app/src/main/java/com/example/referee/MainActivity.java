package com.example.referee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final String actionBarColor = "#42515e";

    private Button lawsOfTheGameBtnHomePage;
    private Button theoreticalTestsBtnHomePage;
    private Button videoBtnHomePage;
    private Button stadiumAddressesBtnHomePage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(actionBarColor));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        lawsOfTheGameBtnHomePage = findViewById(R.id.lawsOfTheGameBtnHomePage);
        theoreticalTestsBtnHomePage = findViewById(R.id.theoreticalTestsBtnHomePage);
        videoBtnHomePage = findViewById(R.id.videoBtnHomePage);
        stadiumAddressesBtnHomePage = findViewById(R.id.stadiumAddressesBtnHomePage);

        lawsOfTheGameBtnHomePage.setOnClickListener(this);
        theoreticalTestsBtnHomePage.setOnClickListener(this);
        videoBtnHomePage.setOnClickListener(this);
        stadiumAddressesBtnHomePage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.lawsOfTheGameBtnHomePage:
                intent = new Intent(MainActivity.this, LawsOfTheGameActivity.class);
                startActivity(intent);
                break;

            case R.id.theoreticalTestsBtnHomePage:
                intent = new Intent(MainActivity.this, TheoreticalTestsActivity.class);
                startActivity(intent);
                break;

            case R.id.videoBtnHomePage:
                intent = new Intent(MainActivity.this, VideoReviewActivity.class);
                startActivity(intent);
                break;

            case R.id.stadiumAddressesBtnHomePage:
                intent = new Intent(MainActivity.this, StadiumAdressesActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}