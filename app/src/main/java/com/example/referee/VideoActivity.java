package com.example.referee;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {
    private int buttonClicked;
    private int noVideos;
    private String videoCategory;

    private HashMap<String, Integer> answers;

    private VideoView video;
    private String videoPath;

    private Button nextBtn;
    private Button previousBtn;
    private Button checkAnswer;

    private RadioButton answer1;
    private RadioButton answer2;
    private RadioButton answer3;
    private RadioButton answer4;
    private RadioButton answer5;
    private RadioButton answer6;
    private RadioButton answer7;

    private RadioGroup radioGroup;

    private int currentVideo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        answer1 = findViewById(R.id.radioButton1);
        answer2 = findViewById(R.id.radioButton2);
        answer3 = findViewById(R.id.radioButton3);
        answer4 = findViewById(R.id.radioButton4);
        answer5 = findViewById(R.id.radioButton5);
        answer6 = findViewById(R.id.radioButton6);
        answer7 = findViewById(R.id.radioButton7);

        radioGroup = findViewById(R.id.radioGroupVideoActivity);

        answers = (HashMap<String, Integer>) getIntent().getSerializableExtra("answers");

        noVideos = (int) getIntent().getSerializableExtra("noVideos");
        videoCategory = (String) getIntent().getSerializableExtra("videoCategory");
        currentVideo = 1;
        buttonClicked = 0;

        video = findViewById(R.id.oneVideoView);
        previousBtn = findViewById(R.id.videoActivityBtnPrevious);
        nextBtn = findViewById(R.id.videoActivityBtnNext);
        checkAnswer = findViewById(R.id.checkAnswerVideoActivity);

        nextBtn.setOnClickListener(this);
        previousBtn.setOnClickListener(this);
        checkAnswer.setOnClickListener(this);

        startVideo(currentVideo);
    }

    private void startVideo(int currentVideo) {
        videoPath = "";
        videoPath = "android.resource://" + getPackageName() + "/raw/" + videoCategory;
        videoPath += Integer.toString(currentVideo);
        System.out.println(videoPath);
        Uri uri = Uri.parse(videoPath);
        video.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.videoActivityBtnNext:
                radioGroup.clearCheck();

                answer1.setTextColor(Color.WHITE);
                answer2.setTextColor(Color.WHITE);
                answer3.setTextColor(Color.WHITE);
                answer4.setTextColor(Color.WHITE);
                answer5.setTextColor(Color.WHITE);
                answer6.setTextColor(Color.WHITE);
                answer7.setTextColor(Color.WHITE);

                if (currentVideo == noVideos) {
                    finish();
                }

                if (currentVideo == noVideos - 1) {
                    nextBtn.setText("RETURN");
                }

                currentVideo++;

                startVideo(currentVideo);
                break;

            case R.id.videoActivityBtnPrevious:
                radioGroup.clearCheck();

                answer1.setTextColor(Color.WHITE);
                answer2.setTextColor(Color.WHITE);
                answer3.setTextColor(Color.WHITE);
                answer4.setTextColor(Color.WHITE);
                answer5.setTextColor(Color.WHITE);
                answer6.setTextColor(Color.WHITE);
                answer7.setTextColor(Color.WHITE);

                if (currentVideo == 1) {
                    finish();
                }

                currentVideo--;

                startVideo(currentVideo);
                break;

            case R.id.checkAnswerVideoActivity:
                String currvideo = videoCategory;
                currvideo += Integer.toString(currentVideo);
                System.out.println(currvideo);
                System.out.println(answers);

                int colorGreen = answers.get(currvideo);
                System.out.println(colorGreen);

                answer1.setTextColor(Color.RED);
                answer2.setTextColor(Color.RED);
                answer3.setTextColor(Color.RED);
                answer4.setTextColor(Color.RED);
                answer5.setTextColor(Color.RED);
                answer6.setTextColor(Color.RED);
                answer7.setTextColor(Color.RED);

                if (colorGreen == 1) {
                    answer1.setTextColor(Color.GREEN);
                } else if (colorGreen == 2) {
                    answer1.setTextColor(Color.GREEN);
                } else if (colorGreen == 3) {
                    answer1.setTextColor(Color.GREEN);
                } else if (colorGreen == 4) {
                    answer1.setTextColor(Color.GREEN);
                } else if (colorGreen == 5) {
                    answer1.setTextColor(Color.GREEN);
                } else if (colorGreen == 6) {
                    answer1.setTextColor(Color.GREEN);
                } else if (colorGreen == 7) {
                    answer1.setTextColor(Color.GREEN);
                }
                break;

            default:
                finish();
                break;
        }
    }
}