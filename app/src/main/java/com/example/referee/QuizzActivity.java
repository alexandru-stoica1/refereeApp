package com.example.referee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizzActivity extends AppCompatActivity {
    private int setNumber;
    private final String actionBarColor = "#42515e";

    private TextView question1Text;
    private TextView question2Text;
    private TextView question3Text;
    private TextView question4Text;
    private TextView question5Text;
    private TextView question6Text;
    private TextView question7Text;
    private TextView question8Text;
    private TextView question9Text;
    private TextView question10Text;
    private TextView question11Text;
    private TextView question12Text;
    private TextView question13Text;
    private TextView question14Text;
    private TextView question15Text;
    private TextView question16Text;
    private TextView question17Text;
    private TextView question18Text;
    private TextView question19Text;
    private TextView question20Text;

    private RadioButton question1Answer1;
    private RadioButton question1Answer2;
    private RadioButton question1Answer3;
    private RadioButton question1Answer4;

    private RadioButton question2Answer1;
    private RadioButton question2Answer2;
    private RadioButton question2Answer3;
    private RadioButton question2Answer4;

    private RadioButton question3Answer1;
    private RadioButton question3Answer2;
    private RadioButton question3Answer3;
    private RadioButton question3Answer4;

    private RadioButton question4Answer1;
    private RadioButton question4Answer2;
    private RadioButton question4Answer3;
    private RadioButton question4Answer4;

    private RadioButton question5Answer1;
    private RadioButton question5Answer2;
    private RadioButton question5Answer3;
    private RadioButton question5Answer4;

    private RadioButton question6Answer1;
    private RadioButton question6Answer2;
    private RadioButton question6Answer3;
    private RadioButton question6Answer4;

    private RadioButton question7Answer1;
    private RadioButton question7Answer2;
    private RadioButton question7Answer3;
    private RadioButton question7Answer4;

    private RadioButton question8Answer1;
    private RadioButton question8Answer2;
    private RadioButton question8Answer3;
    private RadioButton question8Answer4;

    private RadioButton question9Answer1;
    private RadioButton question9Answer2;
    private RadioButton question9Answer3;
    private RadioButton question9Answer4;

    private RadioButton question10Answer1;
    private RadioButton question10Answer2;
    private RadioButton question10Answer3;
    private RadioButton question10Answer4;

    private RadioButton question11Answer1;
    private RadioButton question11Answer2;
    private RadioButton question11Answer3;
    private RadioButton question11Answer4;

    private RadioButton question12Answer1;
    private RadioButton question12Answer2;
    private RadioButton question12Answer3;
    private RadioButton question12Answer4;

    private RadioButton question13Answer1;
    private RadioButton question13Answer2;
    private RadioButton question13Answer3;
    private RadioButton question13Answer4;

    private RadioButton question14Answer1;
    private RadioButton question14Answer2;
    private RadioButton question14Answer3;
    private RadioButton question14Answer4;

    private RadioButton question15Answer1;
    private RadioButton question15Answer2;
    private RadioButton question15Answer3;
    private RadioButton question15Answer4;

    private RadioButton question16Answer1;
    private RadioButton question16Answer2;
    private RadioButton question16Answer3;
    private RadioButton question16Answer4;

    private RadioButton question17Answer1;
    private RadioButton question17Answer2;
    private RadioButton question17Answer3;
    private RadioButton question17Answer4;

    private RadioButton question18Answer1;
    private RadioButton question18Answer2;
    private RadioButton question18Answer3;
    private RadioButton question18Answer4;

    private RadioButton question19Answer1;
    private RadioButton question19Answer2;
    private RadioButton question19Answer3;
    private RadioButton question19Answer4;

    private RadioButton question20Answer1;
    private RadioButton question20Answer2;
    private RadioButton question20Answer3;
    private RadioButton question20Answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(actionBarColor));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        setNumber = (int) getIntent().getSerializableExtra("setNumber");

        String actionBarTitle = "";

        if (setNumber <= 6) {
            actionBarTitle += "Arbitri asistenti Liga a 3-a NR.";
            actionBarTitle += String.valueOf(setNumber);
        } else if (setNumber <= 10) {
            actionBarTitle += "Arbitri Liga a 3-a NR.";
            actionBarTitle += String.valueOf(setNumber - 6);
        } else if (setNumber <= 15) {
            actionBarTitle += "Arbitri asistenti Liga a 2-a NR.";
            actionBarTitle += String.valueOf(setNumber - 10);
        } else if (setNumber <= 19) {
            actionBarTitle += "Arbitri Liga a 2-a NR.";
            actionBarTitle += String.valueOf(setNumber - 15);
        }

        getSupportActionBar().setTitle(actionBarTitle);

        findViewByIds();
        setQuestionText(setNumber);
        setAnswersText(setNumber);

    }

    private void setAnswersText(int setNumber) {
        String question1Answer1Text = "set" + String.valueOf(setNumber) + "_1_a1";
        int question1Answer1Id = getResources().getIdentifier(question1Answer1Text, "string", getPackageName());
        question1Answer1.setText(getString(question1Answer1Id));

        String question1Answer2Text = "set" + String.valueOf(setNumber) + "_1_a2";
        int question1Answer2Id = getResources().getIdentifier(question1Answer2Text, "string", getPackageName());
        question1Answer2.setText(getString(question1Answer2Id));

        String question1Answer3Text = "set" + String.valueOf(setNumber) + "_1_a3";
        int question1Answer3Id = getResources().getIdentifier(question1Answer3Text, "string", getPackageName());
        question1Answer3.setText(getString(question1Answer3Id));

        String question1Answer4Text = "set" + String.valueOf(setNumber) + "_1_a4";
        int question1Answer4Id = getResources().getIdentifier(question1Answer4Text, "string", getPackageName());
        question1Answer4.setText(getString(question1Answer4Id));

        String question2Answer1Text = "set" + String.valueOf(setNumber) + "_2_a1";
        int question2Answer1Id = getResources().getIdentifier(question2Answer1Text, "string", getPackageName());
        question2Answer1.setText(getString(question2Answer1Id));

        String question2Answer2Text = "set" + String.valueOf(setNumber) + "_2_a2";
        int question2Answer2Id = getResources().getIdentifier(question2Answer2Text, "string", getPackageName());
        question2Answer2.setText(getString(question2Answer2Id));

        String question2Answer3Text = "set" + String.valueOf(setNumber) + "_2_a3";
        int question2Answer3Id = getResources().getIdentifier(question2Answer3Text, "string", getPackageName());
        question2Answer3.setText(getString(question2Answer3Id));

        String question2Answer4Text = "set" + String.valueOf(setNumber) + "_2_a4";
        int question2Answer4Id = getResources().getIdentifier(question2Answer4Text, "string", getPackageName());
        question2Answer4.setText(getString(question2Answer4Id));

        String question3Answer1Text = "set" + String.valueOf(setNumber) + "_3_a1";
        int question3Answer1Id = getResources().getIdentifier(question3Answer1Text, "string", getPackageName());
        question3Answer1.setText(getString(question3Answer1Id));

        String question3Answer2Text = "set" + String.valueOf(setNumber) + "_3_a2";
        int question3Answer2Id = getResources().getIdentifier(question3Answer2Text, "string", getPackageName());
        question3Answer2.setText(getString(question3Answer2Id));

        String question3Answer3Text = "set" + String.valueOf(setNumber) + "_3_a3";
        int question3Answer3Id = getResources().getIdentifier(question3Answer3Text, "string", getPackageName());
        question3Answer3.setText(getString(question3Answer3Id));

        String question3Answer4Text = "set" + String.valueOf(setNumber) + "_3_a4";
        int question3Answer4Id = getResources().getIdentifier(question3Answer4Text, "string", getPackageName());
        question3Answer4.setText(getString(question3Answer4Id));

        String question4Answer1Text = "set" + String.valueOf(setNumber) + "_4_a1";
        int question4Answer1Id = getResources().getIdentifier(question4Answer1Text, "string", getPackageName());
        question4Answer1.setText(getString(question4Answer1Id));

        String question4Answer2Text = "set" + String.valueOf(setNumber) + "_4_a2";
        int question4Answer2Id = getResources().getIdentifier(question4Answer2Text, "string", getPackageName());
        question4Answer2.setText(getString(question4Answer2Id));

        String question4Answer3Text = "set" + String.valueOf(setNumber) + "_4_a3";
        int question4Answer3Id = getResources().getIdentifier(question4Answer3Text, "string", getPackageName());
        question4Answer3.setText(getString(question4Answer3Id));

        String question4Answer4Text = "set" + String.valueOf(setNumber) + "_4_a4";
        int question4Answer4Id = getResources().getIdentifier(question4Answer4Text, "string", getPackageName());
        question4Answer4.setText(getString(question4Answer4Id));

        String question5Answer1Text = "set" + String.valueOf(setNumber) + "_5_a1";
        int question5Answer1Id = getResources().getIdentifier(question5Answer1Text, "string", getPackageName());
        question5Answer1.setText(getString(question5Answer1Id));

        String question5Answer2Text = "set" + String.valueOf(setNumber) + "_5_a2";
        int question5Answer2Id = getResources().getIdentifier(question5Answer2Text, "string", getPackageName());
        question5Answer2.setText(getString(question5Answer2Id));

        String question5Answer3Text = "set" + String.valueOf(setNumber) + "_5_a3";
        int question5Answer3Id = getResources().getIdentifier(question5Answer3Text, "string", getPackageName());
        question5Answer3.setText(getString(question5Answer3Id));

        String question5Answer4Text = "set" + String.valueOf(setNumber) + "_5_a4";
        int question5Answer4Id = getResources().getIdentifier(question5Answer4Text, "string", getPackageName());
        question5Answer4.setText(getString(question5Answer4Id));

        String question6Answer1Text = "set" + String.valueOf(setNumber) + "_6_a1";
        int question6Answer1Id = getResources().getIdentifier(question6Answer1Text, "string", getPackageName());
        question6Answer1.setText(getString(question6Answer1Id));

        String question6Answer2Text = "set" + String.valueOf(setNumber) + "_6_a2";
        int question6Answer2Id = getResources().getIdentifier(question6Answer2Text, "string", getPackageName());
        question6Answer2.setText(getString(question6Answer2Id));

        String question6Answer3Text = "set" + String.valueOf(setNumber) + "_6_a3";
        int question6Answer3Id = getResources().getIdentifier(question6Answer3Text, "string", getPackageName());
        question6Answer3.setText(getString(question6Answer3Id));

        String question6Answer4Text = "set" + String.valueOf(setNumber) + "_6_a4";
        int question6Answer4Id = getResources().getIdentifier(question6Answer4Text, "string", getPackageName());
        question6Answer4.setText(getString(question6Answer4Id));

        String question7Answer1Text = "set" + String.valueOf(setNumber) + "_7_a1";
        int question7Answer1Id = getResources().getIdentifier(question7Answer1Text, "string", getPackageName());
        question7Answer1.setText(getString(question7Answer1Id));

        String question7Answer2Text = "set" + String.valueOf(setNumber) + "_7_a2";
        int question7Answer2Id = getResources().getIdentifier(question7Answer2Text, "string", getPackageName());
        question7Answer2.setText(getString(question7Answer2Id));

        String question7Answer3Text = "set" + String.valueOf(setNumber) + "_7_a3";
        int question7Answer3Id = getResources().getIdentifier(question7Answer3Text, "string", getPackageName());
        question7Answer3.setText(getString(question7Answer3Id));

        String question7Answer4Text = "set" + String.valueOf(setNumber) + "_7_a4";
        int question7Answer4Id = getResources().getIdentifier(question7Answer4Text, "string", getPackageName());
        question7Answer4.setText(getString(question7Answer4Id));

        String question8Answer1Text = "set" + String.valueOf(setNumber) + "_8_a1";
        int question8Answer1Id = getResources().getIdentifier(question8Answer1Text, "string", getPackageName());
        question8Answer1.setText(getString(question8Answer1Id));

        String question8Answer2Text = "set" + String.valueOf(setNumber) + "_8_a2";
        int question8Answer2Id = getResources().getIdentifier(question8Answer2Text, "string", getPackageName());
        question8Answer2.setText(getString(question8Answer2Id));

        String question8Answer3Text = "set" + String.valueOf(setNumber) + "_8_a3";
        int question8Answer3Id = getResources().getIdentifier(question8Answer3Text, "string", getPackageName());
        question8Answer3.setText(getString(question8Answer3Id));

        String question8Answer4Text = "set" + String.valueOf(setNumber) + "_8_a4";
        int question8Answer4Id = getResources().getIdentifier(question8Answer4Text, "string", getPackageName());
        question8Answer4.setText(getString(question8Answer4Id));

        String question9Answer1Text = "set" + String.valueOf(setNumber) + "_9_a1";
        int question9Answer1Id = getResources().getIdentifier(question9Answer1Text, "string", getPackageName());
        question9Answer1.setText(getString(question9Answer1Id));

        String question9Answer2Text = "set" + String.valueOf(setNumber) + "_9_a2";
        int question9Answer2Id = getResources().getIdentifier(question9Answer2Text, "string", getPackageName());
        question9Answer2.setText(getString(question9Answer2Id));

        String question9Answer3Text = "set" + String.valueOf(setNumber) + "_9_a3";
        int question9Answer3Id = getResources().getIdentifier(question9Answer3Text, "string", getPackageName());
        question9Answer3.setText(getString(question9Answer3Id));

        String question9Answer4Text = "set" + String.valueOf(setNumber) + "_9_a4";
        int question9Answer4Id = getResources().getIdentifier(question9Answer4Text, "string", getPackageName());
        question9Answer4.setText(getString(question9Answer4Id));

        String question10Answer1Text = "set" + String.valueOf(setNumber) + "_10_a1";
        int question10Answer1Id = getResources().getIdentifier(question10Answer1Text, "string", getPackageName());
        question10Answer1.setText(getString(question10Answer1Id));

        String question10Answer2Text = "set" + String.valueOf(setNumber) + "_10_a2";
        int question10Answer2Id = getResources().getIdentifier(question10Answer2Text, "string", getPackageName());
        question10Answer2.setText(getString(question10Answer2Id));

        String question10Answer3Text = "set" + String.valueOf(setNumber) + "_10_a3";
        int question10Answer3Id = getResources().getIdentifier(question10Answer3Text, "string", getPackageName());
        question10Answer3.setText(getString(question10Answer3Id));

        String question10Answer4Text = "set" + String.valueOf(setNumber) + "_10_a4";
        int question10Answer4Id = getResources().getIdentifier(question10Answer4Text, "string", getPackageName());
        question10Answer4.setText(getString(question10Answer4Id));

        String question11Answer1Text = "set" + String.valueOf(setNumber) + "_11_a1";
        int question11Answer1Id = getResources().getIdentifier(question11Answer1Text, "string", getPackageName());
        question11Answer1.setText(getString(question11Answer1Id));

        String question11Answer2Text = "set" + String.valueOf(setNumber) + "_11_a2";
        int question11Answer2Id = getResources().getIdentifier(question11Answer2Text, "string", getPackageName());
        question11Answer2.setText(getString(question11Answer2Id));

        String question11Answer3Text = "set" + String.valueOf(setNumber) + "_11_a3";
        int question11Answer3Id = getResources().getIdentifier(question11Answer3Text, "string", getPackageName());
        question11Answer3.setText(getString(question11Answer3Id));

        String question11Answer4Text = "set" + String.valueOf(setNumber) + "_11_a4";
        int question11Answer4Id = getResources().getIdentifier(question11Answer4Text, "string", getPackageName());
        question11Answer4.setText(getString(question11Answer4Id));

        String question12Answer1Text = "set" + String.valueOf(setNumber) + "_12_a1";
        int question12Answer1Id = getResources().getIdentifier(question12Answer1Text, "string", getPackageName());
        question12Answer1.setText(getString(question12Answer1Id));

        String question12Answer2Text = "set" + String.valueOf(setNumber) + "_12_a2";
        int question12Answer2Id = getResources().getIdentifier(question12Answer2Text, "string", getPackageName());
        question12Answer2.setText(getString(question12Answer2Id));

        String question12Answer3Text = "set" + String.valueOf(setNumber) + "_12_a3";
        int question12Answer3Id = getResources().getIdentifier(question12Answer3Text, "string", getPackageName());
        question12Answer3.setText(getString(question12Answer3Id));

        String question12Answer4Text = "set" + String.valueOf(setNumber) + "_12_a4";
        int question12Answer4Id = getResources().getIdentifier(question12Answer4Text, "string", getPackageName());
        question12Answer4.setText(getString(question12Answer4Id));

        String question13Answer1Text = "set" + String.valueOf(setNumber) + "_13_a1";
        int question13Answer1Id = getResources().getIdentifier(question13Answer1Text, "string", getPackageName());
        question13Answer1.setText(getString(question13Answer1Id));

        String question13Answer2Text = "set" + String.valueOf(setNumber) + "_13_a2";
        int question13Answer2Id = getResources().getIdentifier(question13Answer2Text, "string", getPackageName());
        question13Answer2.setText(getString(question13Answer2Id));

        String question13Answer3Text = "set" + String.valueOf(setNumber) + "_13_a3";
        int question13Answer3Id = getResources().getIdentifier(question13Answer3Text, "string", getPackageName());
        question13Answer3.setText(getString(question13Answer3Id));

        String question13Answer4Text = "set" + String.valueOf(setNumber) + "_13_a4";
        int question13Answer4Id = getResources().getIdentifier(question13Answer4Text, "string", getPackageName());
        question13Answer4.setText(getString(question13Answer4Id));

        String question14Answer1Text = "set" + String.valueOf(setNumber) + "_14_a1";
        int question14Answer1Id = getResources().getIdentifier(question14Answer1Text, "string", getPackageName());
        question14Answer1.setText(getString(question14Answer1Id));

        String question14Answer2Text = "set" + String.valueOf(setNumber) + "_14_a2";
        int question14Answer2Id = getResources().getIdentifier(question14Answer2Text, "string", getPackageName());
        question14Answer2.setText(getString(question14Answer2Id));

        String question14Answer3Text = "set" + String.valueOf(setNumber) + "_14_a3";
        int question14Answer3Id = getResources().getIdentifier(question14Answer3Text, "string", getPackageName());
        question14Answer3.setText(getString(question14Answer3Id));

        String question14Answer4Text = "set" + String.valueOf(setNumber) + "_14_a4";
        int question14Answer4Id = getResources().getIdentifier(question14Answer4Text, "string", getPackageName());
        question14Answer4.setText(getString(question14Answer4Id));

        String question15Answer1Text = "set" + String.valueOf(setNumber) + "_15_a1";
        int question15Answer1Id = getResources().getIdentifier(question15Answer1Text, "string", getPackageName());
        question15Answer1.setText(getString(question15Answer1Id));

        String question15Answer2Text = "set" + String.valueOf(setNumber) + "_15_a2";
        int question15Answer2Id = getResources().getIdentifier(question15Answer2Text, "string", getPackageName());
        question15Answer2.setText(getString(question15Answer2Id));

        String question15Answer3Text = "set" + String.valueOf(setNumber) + "_15_a3";
        int question15Answer3Id = getResources().getIdentifier(question15Answer3Text, "string", getPackageName());
        question15Answer3.setText(getString(question15Answer3Id));

        String question15Answer4Text = "set" + String.valueOf(setNumber) + "_15_a4";
        int question15Answer4Id = getResources().getIdentifier(question15Answer4Text, "string", getPackageName());
        question15Answer4.setText(getString(question15Answer4Id));

        String question16Answer1Text = "set" + String.valueOf(setNumber) + "_16_a1";
        int question16Answer1Id = getResources().getIdentifier(question16Answer1Text, "string", getPackageName());
        question16Answer1.setText(getString(question16Answer1Id));

        String question16Answer2Text = "set" + String.valueOf(setNumber) + "_16_a2";
        int question16Answer2Id = getResources().getIdentifier(question16Answer2Text, "string", getPackageName());
        question16Answer2.setText(getString(question16Answer2Id));

        String question16Answer3Text = "set" + String.valueOf(setNumber) + "_16_a3";
        int question16Answer3Id = getResources().getIdentifier(question16Answer3Text, "string", getPackageName());
        question16Answer3.setText(getString(question16Answer3Id));

        String question16Answer4Text = "set" + String.valueOf(setNumber) + "_16_a4";
        int question16Answer4Id = getResources().getIdentifier(question16Answer4Text, "string", getPackageName());
        question16Answer4.setText(getString(question16Answer4Id));

        String question17Answer1Text = "set" + String.valueOf(setNumber) + "_17_a1";
        int question17Answer1Id = getResources().getIdentifier(question17Answer1Text, "string", getPackageName());
        question17Answer1.setText(getString(question17Answer1Id));

        String question17Answer2Text = "set" + String.valueOf(setNumber) + "_17_a2";
        int question17Answer2Id = getResources().getIdentifier(question17Answer2Text, "string", getPackageName());
        question17Answer2.setText(getString(question17Answer2Id));

        String question17Answer3Text = "set" + String.valueOf(setNumber) + "_17_a3";
        int question17Answer3Id = getResources().getIdentifier(question17Answer3Text, "string", getPackageName());
        question17Answer3.setText(getString(question17Answer3Id));

        String question17Answer4Text = "set" + String.valueOf(setNumber) + "_17_a4";
        int question17Answer4Id = getResources().getIdentifier(question17Answer4Text, "string", getPackageName());
        question17Answer4.setText(getString(question17Answer4Id));

        String question18Answer1Text = "set" + String.valueOf(setNumber) + "_18_a1";
        int question18Answer1Id = getResources().getIdentifier(question18Answer1Text, "string", getPackageName());
        question18Answer1.setText(getString(question18Answer1Id));

        String question18Answer2Text = "set" + String.valueOf(setNumber) + "_18_a2";
        int question18Answer2Id = getResources().getIdentifier(question18Answer2Text, "string", getPackageName());
        question18Answer2.setText(getString(question18Answer2Id));

        String question18Answer3Text = "set" + String.valueOf(setNumber) + "_18_a3";
        int question18Answer3Id = getResources().getIdentifier(question18Answer3Text, "string", getPackageName());
        question18Answer3.setText(getString(question18Answer3Id));

        String question18Answer4Text = "set" + String.valueOf(setNumber) + "_18_a4";
        int question18Answer4Id = getResources().getIdentifier(question18Answer4Text, "string", getPackageName());
        question18Answer4.setText(getString(question18Answer4Id));

        String question19Answer1Text = "set" + String.valueOf(setNumber) + "_1_a1";
        int question19Answer1Id = getResources().getIdentifier(question19Answer1Text, "string", getPackageName());
        question19Answer1.setText(getString(question19Answer1Id));

        String question19Answer2Text = "set" + String.valueOf(setNumber) + "_19_a2";
        int question19Answer2Id = getResources().getIdentifier(question19Answer2Text, "string", getPackageName());
        question19Answer2.setText(getString(question19Answer2Id));

        String question19Answer3Text = "set" + String.valueOf(setNumber) + "_19_a3";
        int question19Answer3Id = getResources().getIdentifier(question19Answer3Text, "string", getPackageName());
        question19Answer3.setText(getString(question19Answer3Id));

        String question19Answer4Text = "set" + String.valueOf(setNumber) + "_19_a4";
        int question19Answer4Id = getResources().getIdentifier(question19Answer4Text, "string", getPackageName());
        question19Answer4.setText(getString(question19Answer4Id));

        String question20Answer1Text = "set" + String.valueOf(setNumber) + "_20_a1";
        int question20Answer1Id = getResources().getIdentifier(question20Answer1Text, "string", getPackageName());
        question20Answer1.setText(getString(question20Answer1Id));

        String question20Answer2Text = "set" + String.valueOf(setNumber) + "_20_a2";
        int question20Answer2Id = getResources().getIdentifier(question20Answer2Text, "string", getPackageName());
        question20Answer2.setText(getString(question20Answer2Id));

        String question20Answer3Text = "set" + String.valueOf(setNumber) + "_20_a3";
        int question20Answer3Id = getResources().getIdentifier(question20Answer3Text, "string", getPackageName());
        question20Answer3.setText(getString(question20Answer3Id));

        String question20Answer4Text = "set" + String.valueOf(setNumber) + "_20_a4";
        int question20Answer4Id = getResources().getIdentifier(question20Answer4Text, "string", getPackageName());
        question20Answer4.setText(getString(question20Answer4Id));
    }

    private void setQuestionText(int setNumber) {
        String question1 = "set" + String.valueOf(setNumber) + "_1_q";
        int question1Id = getResources().getIdentifier(question1, "string", getPackageName());
        question1Text.setText(getString(question1Id));

        String question2 = "set" + String.valueOf(setNumber) + "_2_q";
        int question2Id = getResources().getIdentifier(question2, "string", getPackageName());
        question2Text.setText(getString(question2Id));

        String question3 = "set" + String.valueOf(setNumber) + "_3_q";
        int question3Id = getResources().getIdentifier(question3, "string", getPackageName());
        question3Text.setText(getString(question3Id));

        String question4 = "set" + String.valueOf(setNumber) + "_4_q";
        int question4Id = getResources().getIdentifier(question4, "string", getPackageName());
        question4Text.setText(getString(question4Id));

        String question5 = "set" + String.valueOf(setNumber) + "_5_q";
        int question5Id = getResources().getIdentifier(question5, "string", getPackageName());
        question5Text.setText(getString(question5Id));

        String question6 = "set" + String.valueOf(setNumber) + "_6_q";
        int question6Id = getResources().getIdentifier(question6, "string", getPackageName());
        question6Text.setText(getString(question6Id));

        String question7 = "set" + String.valueOf(setNumber) + "_7_q";
        int question7Id = getResources().getIdentifier(question7, "string", getPackageName());
        question7Text.setText(getString(question7Id));

        String question8 = "set" + String.valueOf(setNumber) + "_8_q";
        int question8Id = getResources().getIdentifier(question8, "string", getPackageName());
        question8Text.setText(getString(question8Id));

        String question9 = "set" + String.valueOf(setNumber) + "_9_q";
        int question9Id = getResources().getIdentifier(question9, "string", getPackageName());
        question9Text.setText(getString(question9Id));

        String question10 = "set" + String.valueOf(setNumber) + "_10_q";
        int question10Id = getResources().getIdentifier(question10, "string", getPackageName());
        question10Text.setText(getString(question10Id));

        String question11 = "set" + String.valueOf(setNumber) + "_11_q";
        int question11Id = getResources().getIdentifier(question11, "string", getPackageName());
        question11Text.setText(getString(question11Id));

        String question12 = "set" + String.valueOf(setNumber) + "_12_q";
        int question12Id = getResources().getIdentifier(question12, "string", getPackageName());
        question12Text.setText(getString(question12Id));

        String question13 = "set" + String.valueOf(setNumber) + "_13_q";
        int question13Id = getResources().getIdentifier(question13, "string", getPackageName());
        question13Text.setText(getString(question13Id));

        String question14 = "set" + String.valueOf(setNumber) + "_14_q";
        int question14Id = getResources().getIdentifier(question14, "string", getPackageName());
        question14Text.setText(getString(question14Id));

        String question15 = "set" + String.valueOf(setNumber) + "_15_q";
        int question15Id = getResources().getIdentifier(question15, "string", getPackageName());
        question15Text.setText(getString(question15Id));

        String question16 = "set" + String.valueOf(setNumber) + "_16_q";
        int question16Id = getResources().getIdentifier(question16, "string", getPackageName());
        question16Text.setText(getString(question16Id));

        String question17 = "set" + String.valueOf(setNumber) + "_17_q";
        int question17Id = getResources().getIdentifier(question17, "string", getPackageName());
        question17Text.setText(getString(question17Id));

        String question18 = "set" + String.valueOf(setNumber) + "_18_q";
        int question18Id = getResources().getIdentifier(question18, "string", getPackageName());
        question18Text.setText(getString(question18Id));

        String question19 = "set" + String.valueOf(setNumber) + "_19_q";
        int question19Id = getResources().getIdentifier(question19, "string", getPackageName());
        question19Text.setText(getString(question19Id));

        String question20 = "set" + String.valueOf(setNumber) + "_20_q";
        int question20Id = getResources().getIdentifier(question20, "string", getPackageName());
        question20Text.setText(getString(question20Id));
    }

    private void findViewByIds() {
        question1Text = findViewById(R.id.question1Text);
        question2Text = findViewById(R.id.question2Text);
        question3Text = findViewById(R.id.question3Text);
        question4Text = findViewById(R.id.question4Text);
        question5Text = findViewById(R.id.question5Text);
        question6Text = findViewById(R.id.question6Text);
        question7Text = findViewById(R.id.question7Text);
        question8Text = findViewById(R.id.question8Text);
        question9Text = findViewById(R.id.question9Text);
        question10Text = findViewById(R.id.question10Text);
        question11Text = findViewById(R.id.question11Text);
        question12Text = findViewById(R.id.question12Text);
        question13Text = findViewById(R.id.question13Text);
        question14Text = findViewById(R.id.question14Text);
        question15Text = findViewById(R.id.question15Text);
        question16Text = findViewById(R.id.question16Text);
        question17Text = findViewById(R.id.question17Text);
        question18Text = findViewById(R.id.question18Text);
        question19Text = findViewById(R.id.question19Text);
        question20Text = findViewById(R.id.question20Text);

        question1Answer1 = findViewById(R.id.question1Answer1);
        question1Answer2 = findViewById(R.id.question1Answer2);
        question1Answer3 = findViewById(R.id.question1Answer3);
        question1Answer4 = findViewById(R.id.question1Answer4);

        question2Answer1 = findViewById(R.id.question2Answer1);
        question2Answer2 = findViewById(R.id.question2Answer2);
        question2Answer3 = findViewById(R.id.question2Answer3);
        question2Answer4 = findViewById(R.id.question2Answer4);

        question3Answer1 = findViewById(R.id.question3Answer1);
        question3Answer2 = findViewById(R.id.question3Answer2);
        question3Answer3 = findViewById(R.id.question3Answer3);
        question3Answer4 = findViewById(R.id.question3Answer4);

        question3Answer1 = findViewById(R.id.question3Answer1);
        question3Answer2 = findViewById(R.id.question3Answer2);
        question3Answer3 = findViewById(R.id.question3Answer3);
        question3Answer4 = findViewById(R.id.question3Answer4);

        question4Answer1 = findViewById(R.id.question4Answer1);
        question4Answer2 = findViewById(R.id.question4Answer2);
        question4Answer3 = findViewById(R.id.question4Answer3);
        question4Answer4 = findViewById(R.id.question4Answer4);

        question5Answer1 = findViewById(R.id.question5Answer1);
        question5Answer2 = findViewById(R.id.question5Answer2);
        question5Answer3 = findViewById(R.id.question5Answer3);
        question5Answer4 = findViewById(R.id.question5Answer4);

        question6Answer1 = findViewById(R.id.question6Answer1);
        question6Answer2 = findViewById(R.id.question6Answer2);
        question6Answer3 = findViewById(R.id.question6Answer3);
        question6Answer4 = findViewById(R.id.question6Answer4);

        question7Answer1 = findViewById(R.id.question7Answer1);
        question7Answer2 = findViewById(R.id.question7Answer2);
        question7Answer3 = findViewById(R.id.question7Answer3);
        question7Answer4 = findViewById(R.id.question7Answer4);

        question8Answer1 = findViewById(R.id.question8Answer1);
        question8Answer2 = findViewById(R.id.question8Answer2);
        question8Answer3 = findViewById(R.id.question8Answer3);
        question8Answer4 = findViewById(R.id.question8Answer4);

        question9Answer1 = findViewById(R.id.question9Answer1);
        question9Answer2 = findViewById(R.id.question9Answer2);
        question9Answer3 = findViewById(R.id.question9Answer3);
        question9Answer4 = findViewById(R.id.question9Answer4);

        question10Answer1 = findViewById(R.id.question10Answer1);
        question10Answer2 = findViewById(R.id.question10Answer2);
        question10Answer3 = findViewById(R.id.question10Answer3);
        question10Answer4 = findViewById(R.id.question10Answer4);

        question11Answer1 = findViewById(R.id.question11Answer1);
        question11Answer2 = findViewById(R.id.question11Answer2);
        question11Answer3 = findViewById(R.id.question11Answer3);
        question11Answer4 = findViewById(R.id.question11Answer4);

        question12Answer1 = findViewById(R.id.question12Answer1);
        question12Answer2 = findViewById(R.id.question12Answer2);
        question12Answer3 = findViewById(R.id.question12Answer3);
        question12Answer4 = findViewById(R.id.question12Answer4);

        question13Answer1 = findViewById(R.id.question13Answer1);
        question13Answer2 = findViewById(R.id.question13Answer2);
        question13Answer3 = findViewById(R.id.question13Answer3);
        question13Answer4 = findViewById(R.id.question13Answer4);

        question14Answer1 = findViewById(R.id.question14Answer1);
        question14Answer2 = findViewById(R.id.question14Answer2);
        question14Answer3 = findViewById(R.id.question14Answer3);
        question14Answer4 = findViewById(R.id.question14Answer4);

        question15Answer1 = findViewById(R.id.question15Answer1);
        question15Answer2 = findViewById(R.id.question15Answer2);
        question15Answer3 = findViewById(R.id.question15Answer3);
        question15Answer4 = findViewById(R.id.question15Answer4);

        question16Answer1 = findViewById(R.id.question16Answer1);
        question16Answer2 = findViewById(R.id.question16Answer2);
        question16Answer3 = findViewById(R.id.question16Answer3);
        question16Answer4 = findViewById(R.id.question16Answer4);

        question17Answer1 = findViewById(R.id.question17Answer1);
        question17Answer2 = findViewById(R.id.question17Answer2);
        question17Answer3 = findViewById(R.id.question17Answer3);
        question17Answer4 = findViewById(R.id.question17Answer4);

        question18Answer1 = findViewById(R.id.question18Answer1);
        question18Answer2 = findViewById(R.id.question18Answer2);
        question18Answer3 = findViewById(R.id.question18Answer3);
        question18Answer4 = findViewById(R.id.question18Answer4);

        question19Answer1 = findViewById(R.id.question19Answer1);
        question19Answer2 = findViewById(R.id.question19Answer2);
        question19Answer3 = findViewById(R.id.question19Answer3);
        question19Answer4 = findViewById(R.id.question19Answer4);

        question20Answer1 = findViewById(R.id.question20Answer1);
        question20Answer2 = findViewById(R.id.question20Answer2);
        question20Answer3 = findViewById(R.id.question20Answer3);
        question20Answer4 = findViewById(R.id.question20Answer4);
    }
}