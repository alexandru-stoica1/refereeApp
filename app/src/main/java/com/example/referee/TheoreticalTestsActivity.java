package com.example.referee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TheoreticalTestsActivity extends AppCompatActivity implements ExpandableListView.OnChildClickListener {
    private final String actionBarColor = "#42515e";

    private ExpandableListView expandableListViewTheoreticalTests;

    private List<String> listGroup;
    private HashMap<String, List<String>> listItems;

    private MainAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theoretical_tests);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(actionBarColor));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setTitle(R.string.tests);

        expandableListViewTheoreticalTests = findViewById(R.id.expandableListViewTheoreticalTests);

        listGroup = new ArrayList<>();
        listItems = new HashMap<>();
        adapter = new MainAdapter(this, listGroup, listItems);

        expandableListViewTheoreticalTests.setAdapter(adapter);

        initListData();

        expandableListViewTheoreticalTests.setOnChildClickListener(this);
    }

    private void initListData() {
        listGroup.add(getString(R.string.referees_l3));
        listGroup.add(getString(R.string.assistant_referees_l3));

        listGroup.add(getString(R.string.referees_l2));
        listGroup.add(getString(R.string.assistant_referees_l2));

        populateMap(R.array.referees_l3, listGroup.get(0));
        populateMap(R.array.assistant_referees_l3, listGroup.get(1));
        populateMap(R.array.referees_l2, listGroup.get(2));
        populateMap(R.array.assistant_referees_l2, listGroup.get(3));

        adapter.notifyDataSetChanged();
    }

    private void populateMap(int id, String s) {
        List<String> list = new ArrayList<>();
        String[] array = getResources().getStringArray(id);

        for (String str : array) {
            list.add(str);
        }

        listItems.put(s, list);
    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        int setNumber = 0;

        if (groupPosition == 0) {
            setNumber = childPosition + 6;
        } else if (groupPosition == 1) {
            setNumber = childPosition;
        } else if (groupPosition == 2) {
            setNumber = childPosition + 15;
        } else if (groupPosition == 3) {
            setNumber = childPosition + 10;
        }

        setNumber++;

        Intent intent;
        intent = new Intent(TheoreticalTestsActivity.this, QuizzActivity.class);
        intent.putExtra("setNumber", setNumber);
        startActivity(intent);

        return false;
    }
}