package com.example.referee;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.referee.R;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.location.Address;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StadiumAdressesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private final String actionBarColor = "#42515e";

    private ListView stadiumAdressesListView;
    private ArrayList<String> stadiums;
    private LatLng currentLocation;
    private List<Address> address;
    FusedLocationProviderClient fusedLocationProviderClient;
    SupportMapFragment supportMapFragment;
    LocationManager locationManager;
    private HashMap<String, Integer> mapStadiumToLocation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium_adresses);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(actionBarColor));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        String actionBarTitle = "Adresele bazelor sportive";

        getSupportActionBar().setTitle(actionBarTitle);

        stadiumAdressesListView = findViewById(R.id.stadiumAddressesListView);
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        stadiums = new ArrayList<>();
        mapStadiumToLocation = new HashMap<>();

        populateResources();

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), R.layout.stadium_addresses_list_view, R.id.stadiumAdressesListViewText, stadiums);

        stadiumAdressesListView.setAdapter(arrayAdapter);
        stadiumAdressesListView.setOnItemClickListener(this);
    }


    @SuppressLint("ResourceAsColor")
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        if (ActivityCompat.checkSelfPermission(StadiumAdressesActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(StadiumAdressesActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 44);
        }

        String stadium = (String) adapterView.getItemAtPosition(i);
        String[] array = getResources().getStringArray(mapStadiumToLocation.get(stadium));

        try {
            Uri uri = Uri.parse("google.navigation:q=" + array[0] + "," + array[1] + "&mode=d");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    private void populateResources() {
        stadiums.add(getResources().getString(R.string.agronomie));
        mapStadiumToLocation.put(getResources().getString(R.string.agronomie), R.array.agronomie);

        stadiums.add(getResources().getString(R.string.aspol));
        mapStadiumToLocation.put(getResources().getString(R.string.aspol), R.array.aspol);

        stadiums.add(getResources().getString(R.string.aversa));
        mapStadiumToLocation.put(getResources().getString(R.string.aversa), R.array.aversa);

        stadiums.add(getResources().getString(R.string.biruinta));
        mapStadiumToLocation.put(getResources().getString(R.string.biruinta), R.array.biruinta);

        stadiums.add(getResources().getString(R.string.caldararu));
        mapStadiumToLocation.put(getResources().getString(R.string.caldararu), R.array.caldararu);

        stadiums.add(getResources().getString(R.string.cernica));
        mapStadiumToLocation.put(getResources().getString(R.string.cernica), R.array.cernica);

        stadiums.add(getResources().getString(R.string.coresi));
        mapStadiumToLocation.put(getResources().getString(R.string.coresi), R.array.coresi);

        stadiums.add(getResources().getString(R.string.dacogetica));
        mapStadiumToLocation.put(getResources().getString(R.string.dacogetica), R.array.dacogetica);

        stadiums.add(getResources().getString(R.string.danchilom));
        mapStadiumToLocation.put(getResources().getString(R.string.danchilom), R.array.danchilom);

        stadiums.add(getResources().getString(R.string.dangelo));
        mapStadiumToLocation.put(getResources().getString(R.string.dangelo), R.array.dangelo);

        stadiums.add(getResources().getString(R.string.dinamo));
        mapStadiumToLocation.put(getResources().getString(R.string.dinamo), R.array.dinamo);

        stadiums.add(getResources().getString(R.string.fcsb));
        mapStadiumToLocation.put(getResources().getString(R.string.fcsb), R.array.fcsb);

        stadiums.add(getResources().getString(R.string.iontiriac));
        mapStadiumToLocation.put(getResources().getString(R.string.iontiriac), R.array.iontiriac);

        stadiums.add(getResources().getString(R.string.ior));
        mapStadiumToLocation.put(getResources().getString(R.string.ior), R.array.ior);

        stadiums.add(getResources().getString(R.string.liamanoliu));
        mapStadiumToLocation.put(getResources().getString(R.string.liamanoliu), R.array.liamanoliu);

        stadiums.add(getResources().getString(R.string.metaloglobus));
        mapStadiumToLocation.put(getResources().getString(R.string.metaloglobus), R.array.metaloglobus);

        stadiums.add(getResources().getString(R.string.mobexpert));
        mapStadiumToLocation.put(getResources().getString(R.string.mobexpert), R.array.mobexpert);

        stadiums.add(getResources().getString(R.string.otopeni));
        mapStadiumToLocation.put(getResources().getString(R.string.otopeni), R.array.otopeni);

        stadiums.add(getResources().getString(R.string.parculflorilor));
        mapStadiumToLocation.put(getResources().getString(R.string.parculflorilor), R.array.parculflorilor);

        stadiums.add(getResources().getString(R.string.piperasintetic));
        mapStadiumToLocation.put(getResources().getString(R.string.piperasintetic), R.array.piperasintetic);

        stadiums.add(getResources().getString(R.string.romprim));
        mapStadiumToLocation.put(getResources().getString(R.string.romprim), R.array.romprim);

        stadiums.add(getResources().getString(R.string.samurcasi));
        mapStadiumToLocation.put(getResources().getString(R.string.samurcasi), R.array.samurcasi);

        stadiums.add(getResources().getString(R.string.tractiunea));
        mapStadiumToLocation.put(getResources().getString(R.string.tractiunea), R.array.tractiunea);

        stadiums.add(getResources().getString(R.string.tunari));
        mapStadiumToLocation.put(getResources().getString(R.string.tunari), R.array.tunari);

        stadiums.add(getResources().getString(R.string.vointa));
        mapStadiumToLocation.put(getResources().getString(R.string.vointa), R.array.vointa);
    }
}