package com.example.referee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class LawsOfTheGameChaptersActivity extends AppCompatActivity {
    private final String actionBarColor = "#42515e";

    private String textToBeDisplayed;
    private String titleToBeDisplayed;
    private String stringToBeSearched;

    TextView title;
    TextView text;

    private EditText searchedText;

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

        searchedText = findViewById(R.id.searchedText);

        searchedText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String stringKey = searchedText.getText().toString().toLowerCase(Locale.ROOT);
                int textId = getResources().getIdentifier(textToBeDisplayed, "string", getPackageName());
                String stringToSearch = getString(textId);

                ArrayList<Integer> appearances = new ArrayList<>();

                for (int i = 0; i < stringToSearch.length(); i++) {
                    int keyIndex = 0;

                    while (keyIndex != stringKey.length() && stringToSearch.charAt(i) == stringKey.charAt(keyIndex)) {
                        keyIndex++;
                        i++;
                    }

                    if (keyIndex == stringKey.length()) {
                        appearances.add(i - keyIndex);
                    }
                }

                System.out.println(appearances);

                if (stringToSearch.contains(stringKey)) {
                    int intStart = stringToSearch.indexOf(stringKey);
                    int endIndex = intStart + stringKey.length();

                    Spannable spannableString = new SpannableStringBuilder(stringToSearch);

                    for (int i: appearances) {
                        spannableString.setSpan(new ForegroundColorSpan(Color.YELLOW), i, i + stringKey.length(), 0);
                    }

                    text.setText(spannableString);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        setText(titleToBeDisplayed, textToBeDisplayed);

        //text.setMovementMethod(new ScrollingMovementMethod());
    }

    private void setText(String titleToBeDisplayed, String textToBeDisplayed) {
        System.out.println(textToBeDisplayed);
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