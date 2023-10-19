package com.nguyenhoangbaophuc.testlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> countries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // chuan bi du lieu, hard-code
        countries = new ArrayList<Country>();
        Country country1 = new Country("Viet Nam","vn",10000);
        Country country2 = new Country("Nga","ru",20000);
        Country country3 = new Country("My","us",30000);

        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        // tim dieu khien
        ListView listView = findViewById(R.id.listViewNation);

        // tao adapter
        CountryAdapter adapter = new CountryAdapter(countries,this);

        // gan adapter
        listView.setAdapter(adapter);
        //xu ly su kien


    }
}