package com.nguyenhoangbaophuc.a63135100_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai2Activity extends AppCompatActivity {

    ListView listTT;
    ArrayList<String> dsTT = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        dsTT.add("Levi");
        dsTT.add("KaTi");
        dsTT.add("Slayder");
        dsTT.add("Kiaya");
        dsTT.add("Palette");
        getWidget();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                dsTT
        );

        listTT.setAdapter(adapter);
    }

    public void getWidget() {
        listTT = findViewById(R.id.listTThu);
    }

}