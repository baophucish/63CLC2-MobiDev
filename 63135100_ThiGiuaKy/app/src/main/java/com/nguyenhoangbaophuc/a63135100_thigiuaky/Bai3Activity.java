package com.nguyenhoangbaophuc.a63135100_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai3Activity extends AppCompatActivity {
    ArrayList<TuyenThu> tuyenThus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        tuyenThus = new ArrayList<TuyenThu>();
        TuyenThu tuyenThu1 = new TuyenThu("Levi","levi",1999);
        TuyenThu tuyenThu2 = new TuyenThu("Palette","palette",1999);
        TuyenThu tuyenThu3 = new TuyenThu("Kiaya","kiaya",1999);
        TuyenThu tuyenThu4 = new TuyenThu("Kati","kati",1999);
        TuyenThu tuyenThu5 = new TuyenThu("Slayder","slayder",1999);

        tuyenThus.add(tuyenThu1);
        tuyenThus.add(tuyenThu2);
        tuyenThus.add(tuyenThu3);
        tuyenThus.add(tuyenThu4);
        tuyenThus.add(tuyenThu5);

        ListView listView = findViewById(R.id.listViewTT);
        TuyenThuAdapter adapter = new TuyenThuAdapter(tuyenThus,this);

        listView.setAdapter(adapter);
    }
}