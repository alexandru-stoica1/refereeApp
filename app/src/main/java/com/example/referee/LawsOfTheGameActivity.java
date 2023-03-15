package com.example.referee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LawsOfTheGameActivity extends AppCompatActivity implements ExpandableListView.OnChildClickListener {
    private final String actionBarColor = "#42515e";
    private ExpandableListView expandableListViewLawsOfTheGame;
    private List<String> listGroup;
    private HashMap<String, List<String>> listItems;
    private HashMap<String, String> mapChaptersTitleToText;
    private HashMap<Integer, Integer> mapLawToNOChapters;

    private MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_of_the_game);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(actionBarColor));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setTitle(R.string.laws_of_the_game);

        expandableListViewLawsOfTheGame = findViewById(R.id.expandableListViewLawsOfTheGame);
        listGroup = new ArrayList<>();
        listItems = new HashMap<>();
        adapter = new MainAdapter(this, listGroup, listItems);
        mapChaptersTitleToText = new HashMap<>();
        mapLawToNOChapters = new HashMap<>();

        initmapLawToNOChapters();
        expandableListViewLawsOfTheGame.setAdapter(adapter);
        initListData();

        expandableListViewLawsOfTheGame.setOnChildClickListener(this);
    }

    private void initmapLawToNOChapters() {
        mapLawToNOChapters.put(1, (getResources().getStringArray(R.array.law1)).length);
        mapLawToNOChapters.put(2, (getResources().getStringArray(R.array.law2)).length);
        mapLawToNOChapters.put(3, (getResources().getStringArray(R.array.law3)).length);
        mapLawToNOChapters.put(4, (getResources().getStringArray(R.array.law4)).length);
        mapLawToNOChapters.put(5, (getResources().getStringArray(R.array.law5)).length);
        mapLawToNOChapters.put(6, (getResources().getStringArray(R.array.law6)).length);
        mapLawToNOChapters.put(7, (getResources().getStringArray(R.array.law7)).length);
        mapLawToNOChapters.put(8, (getResources().getStringArray(R.array.law8)).length);
        mapLawToNOChapters.put(9, (getResources().getStringArray(R.array.law9)).length);
        mapLawToNOChapters.put(10, (getResources().getStringArray(R.array.law10)).length);
        mapLawToNOChapters.put(11, (getResources().getStringArray(R.array.law11)).length);
        mapLawToNOChapters.put(12, (getResources().getStringArray(R.array.law12)).length);
        mapLawToNOChapters.put(13, (getResources().getStringArray(R.array.law13)).length);
        mapLawToNOChapters.put(14, (getResources().getStringArray(R.array.law14)).length);
        mapLawToNOChapters.put(15, (getResources().getStringArray(R.array.law15)).length);
        mapLawToNOChapters.put(16, (getResources().getStringArray(R.array.law16)).length);
        mapLawToNOChapters.put(17, (getResources().getStringArray(R.array.law17)).length);
    }

    private void initListData() {
        listGroup.add(getString(R.string.law1));
        listGroup.add(getString(R.string.law2));
        listGroup.add(getString(R.string.law3));
        listGroup.add(getString(R.string.law4));
        listGroup.add(getString(R.string.law5));
        listGroup.add(getString(R.string.law6));
        listGroup.add(getString(R.string.law7));
        listGroup.add(getString(R.string.law8));
        listGroup.add(getString(R.string.law9));
        listGroup.add(getString(R.string.law10));
        listGroup.add(getString(R.string.law11));
        listGroup.add(getString(R.string.law12));
        listGroup.add(getString(R.string.law13));
        listGroup.add(getString(R.string.law14));
        listGroup.add(getString(R.string.law15));
        listGroup.add(getString(R.string.law16));
        listGroup.add(getString(R.string.law17));

        populateMap(R.array.law1, listGroup.get(0));
        populateMap(R.array.law2, listGroup.get(1));
        populateMap(R.array.law3, listGroup.get(2));
        populateMap(R.array.law4, listGroup.get(3));
        populateMap(R.array.law5, listGroup.get(4));
        populateMap(R.array.law6, listGroup.get(5));
        populateMap(R.array.law7, listGroup.get(6));
        populateMap(R.array.law8, listGroup.get(7));
        populateMap(R.array.law9, listGroup.get(8));
        populateMap(R.array.law10, listGroup.get(9));
        populateMap(R.array.law11, listGroup.get(10));
        populateMap(R.array.law12, listGroup.get(11));
        populateMap(R.array.law13, listGroup.get(12));
        populateMap(R.array.law14, listGroup.get(13));
        populateMap(R.array.law15, listGroup.get(14));
        populateMap(R.array.law16, listGroup.get(15));
        populateMap(R.array.law17, listGroup.get(16));

        adapter.notifyDataSetChanged();
    }

    public void populateMap (int lawId, String listGroupElement) {
        List<String> list = new ArrayList<>();
        String[] array = getResources().getStringArray(lawId);

        for (String str : array) {
            list.add(str);
        }

        listItems.put(listGroupElement, list);
    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        Intent intent;
        String textToBePassed = "law_" + (groupPosition + 1) + '_' + (childPosition + 1);
        String titleToBePassed = (String) adapter.getChild(groupPosition, childPosition);

        intent = new Intent(LawsOfTheGameActivity.this, LawsOfTheGameChaptersActivity.class);
        intent.putExtra("textToBePassed", textToBePassed);
        intent.putExtra("titleToBePassed", titleToBePassed);
        intent.putExtra("groupPosition", groupPosition + 1);
        intent.putExtra("childPosition", childPosition + 1);
        intent.putExtra("mapLawToNOChapters", mapLawToNOChapters);
        intent.putExtra("listGroup", (Serializable) listGroup);
        intent.putExtra("listItems", listItems);

        startActivity(intent);

        return false;
    }
}