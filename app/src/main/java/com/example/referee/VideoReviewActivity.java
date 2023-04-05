package com.example.referee;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class VideoReviewActivity extends AppCompatActivity implements View.OnClickListener {
    private Button challengesBtn;
    private Button dogsoSpaBtn;
    private Button holdingBtn;
    private Button handballBtn;
    private Button illegaluseofarmsBtn;
    private Button penaltyAreaDecisionsBtn;
    private Button simulationBtn;
    private Button offsideBtn;

    private HashMap<String, Integer> answers;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_review);

        answers = new HashMap<String, Integer>();
        createAnswersData();

        challengesBtn = findViewById(R.id.VideoActivityChallenges);
        dogsoSpaBtn = findViewById(R.id.VideoActivityDogsoSpa);
        holdingBtn = findViewById(R.id.VideoActivityHolding);
        handballBtn = findViewById(R.id.VideoActivityHandball);
        illegaluseofarmsBtn = findViewById(R.id.VideoActivityIllegalUseOfArms);
        penaltyAreaDecisionsBtn = findViewById(R.id.VideoActivityPenaltyAreaDecisions);
        simulationBtn = findViewById(R.id.VideoActivitySimulation);
        offsideBtn = findViewById(R.id.VideoActivityOffside);

        challengesBtn.setOnClickListener(this);
        dogsoSpaBtn.setOnClickListener(this);
        holdingBtn.setOnClickListener(this);
        handballBtn.setOnClickListener(this);
        illegaluseofarmsBtn.setOnClickListener(this);
        penaltyAreaDecisionsBtn.setOnClickListener(this);
        offsideBtn.setOnClickListener(this);
        simulationBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        int noVideos;
        String videoCategory = "";

        switch (v.getId()) {
            case R.id.VideoActivityChallenges:
                videoCategory += "a";
                break;

            case R.id.VideoActivityDogsoSpa:
                videoCategory += "b";
                break;

            case R.id.VideoActivityHolding:
                videoCategory += "d";
                break;

            case R.id.VideoActivityHandball:
                videoCategory += "c";
                break;

            case R.id.VideoActivityIllegalUseOfArms:
                videoCategory += "e";
                break;

            case R.id.VideoActivityPenaltyAreaDecisions:
                videoCategory += "f";
                break;

            case R.id.VideoActivitySimulation:
                videoCategory += "g";
                break;

            case R.id.VideoActivityOffside:
                videoCategory += "l";
                break;

            default:
                break;
        }

        noVideos = 10;
        intent = new Intent(VideoReviewActivity.this, VideoActivity.class);
        intent.putExtra("noVideos", noVideos);
        intent.putExtra("videoCategory", videoCategory);
        intent.putExtra("answers", answers);
        startActivity(intent);
    }

    private void createAnswersData() {
        answers.put("a1", 2);
        answers.put("a2", 3);
        answers.put("a3", 3);
        answers.put("a4", 4);
        answers.put("a5", 4);
        answers.put("a6", 3);
        answers.put("a7", 3);
        answers.put("a8", 4);
        answers.put("a9", 4);
        answers.put("a10", 4);

        answers.put("b1", 4);
        answers.put("b2", 4);
        answers.put("b3", 4);
        answers.put("b4", 4);
        answers.put("b5", 3);
        answers.put("b6", 3);
        answers.put("b7", 4);
        answers.put("b8", 3);
        answers.put("b9", 4);
        answers.put("b10", 3);

        answers.put("c1", 3);
        answers.put("c2", 1);
        answers.put("c3", 1);
        answers.put("c4", 2);
        answers.put("c5", 3);
        answers.put("c6", 2);
        answers.put("c7", 3);
        answers.put("c8", 2);
        answers.put("c9", 3);
        answers.put("c10", 2);

        answers.put("d1", 1);
        answers.put("d2", 3);
        answers.put("d3", 2);
        answers.put("d4", 2);
        answers.put("d5", 1);
        answers.put("d6", 1);
        answers.put("d7", 2);
        answers.put("d8", 3);
        answers.put("d9", 3);
        answers.put("d10", 3);

        answers.put("e1", 3);
        answers.put("e2", 3);
        answers.put("e3", 3);
        answers.put("e4", 3);
        answers.put("e5", 3);
        answers.put("e6", 3);
        answers.put("e7", 3);
        answers.put("e8", 3);
        answers.put("e9", 3);
        answers.put("e10", 3);

        answers.put("f1", 1);
        answers.put("f2", 3);
        answers.put("f3", 2);
        answers.put("f4", 2);
        answers.put("f5", 3);
        answers.put("f6", 2);
        answers.put("f7", 1);
        answers.put("f8", 5);
        answers.put("f9", 6);
        answers.put("f10", 3);

        answers.put("g1", 6);
        answers.put("g2", 6);
        answers.put("g3", 6);
        answers.put("g4", 6);
        answers.put("g5", 6);
        answers.put("g6", 6);
        answers.put("g7", 6);
        answers.put("g8", 6);
        answers.put("g9", 6);
        answers.put("g10", 6);

        answers.put("l1", 1);
        answers.put("l2", 5);
        answers.put("l3", 1);
        answers.put("l4", 5);
        answers.put("l5", 1);
        answers.put("l6", 5);
        answers.put("l7", 5);
        answers.put("l8", 5);
        answers.put("l9", 5);
        answers.put("l10", 1);
    }
}