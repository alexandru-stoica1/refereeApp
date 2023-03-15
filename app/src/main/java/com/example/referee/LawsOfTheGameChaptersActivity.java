package com.example.referee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class LawsOfTheGameChaptersActivity extends AppCompatActivity {
    private final String actionBarColor = "#42515e";

    private String textToBeDisplayed;
    private String titleToBeDisplayed;

    TextView title;
    TextView text;

    float x1, y1, x2, y2;

    int groupPosition, childPosition;

    HashMap<Integer, Integer> mapLawToNOChapters;
    HashMap<String, List<String>> listItems;
    MainAdapter adapter;

    List<String> listGroup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_of_the_game_chapters);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(actionBarColor));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        Intent intent = getIntent();
        textToBeDisplayed = (String) intent.getSerializableExtra("textToBePassed");
        titleToBeDisplayed = (String) intent.getSerializableExtra("titleToBePassed");
        groupPosition = (int) intent.getSerializableExtra("groupPosition");
        childPosition = (int) intent.getSerializableExtra("childPosition");
        mapLawToNOChapters = (HashMap<Integer, Integer>) intent.getSerializableExtra("mapLawToNOChapters");
        listItems = (HashMap) intent.getSerializableExtra("listItems");
        listGroup = (List<String>) intent.getSerializableExtra("listGroup");

        title = findViewById(R.id.lawsOfTheGameChaptersActivityTitle);
        text = findViewById(R.id.lawsOfTheGameChaptersActivityText);

        setText(titleToBeDisplayed, textToBeDisplayed);

        //text.setMovementMethod(new ScrollingMovementMethod());
    }

    private void setText(String titleToBeDisplayed, String textToBeDisplayed) {
        String lawNumber = "law";
        lawNumber += String.valueOf(groupPosition);

        int lawId = getResources().getIdentifier(lawNumber, "string", getPackageName());

        getSupportActionBar().setTitle(lawId);

        int textId = getResources().getIdentifier(textToBeDisplayed, "string", getPackageName());

        title.setText(titleToBeDisplayed);
        text.setText(getString(textId));
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        this.onTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch (touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();

                if (Math.abs(x1 - x2) >= Math.abs(y1 - y2)) {
                    if (x1 < x2) {
                        System.out.println("RIGHT");
                        if (childPosition == 1) {
                            if (groupPosition != 1) {
                                groupPosition--;
                                childPosition = mapLawToNOChapters.get(groupPosition);
                            }
                        } else {
                            childPosition--;
                        }

                        String textDisplayed = "law_" + (groupPosition) + '_' + (childPosition);
                        String titleDisplayed = listItems.get(listGroup.get(groupPosition - 1)).get(childPosition - 1);
                        setText(titleDisplayed, textDisplayed);

                    } else {

                        if (childPosition == mapLawToNOChapters.get(groupPosition)) {
                            if (groupPosition != 17) {
                                groupPosition++;
                                childPosition = 1;
                            }
                        } else {
                            childPosition++;
                        }

                        String textDisplayed = "law_" + (groupPosition) + '_' + (childPosition);
                        String titleDisplayed = listItems.get(listGroup.get(groupPosition - 1)).get(childPosition - 1);
                        setText(titleDisplayed, textDisplayed);

                    }
                } else {
                    System.out.println("UP_DOWN");
//                    text.setMovementMethod(new ScrollingMovementMethod());
                }
                break;
        }
        return super.onTouchEvent(touchEvent);
    }
}