package com.nguyenhoangbaophuc.changesth;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int clickColorCount = 0;
    private int clickSizeCount = 0;
    private int size = 35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textToChange);
        Button btnUpSize = findViewById(R.id.upSize);
        Button btnDownSize = findViewById(R.id.downSize);

        Button btnRed = findViewById(R.id.colorRed);
        Button btnBlue = findViewById(R.id.colorBlue);
        Button btnOrange = findViewById(R.id.colorOrange);
        Button btnGreen = findViewById(R.id.colorGreen);

        btnUpSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(size >= 0){
                    textView.setTextSize(size + 2);
                }
                size += 2;
            }
        });

        btnDownSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(size >= 0){
                    textView.setTextSize(size - 2);
                }
                size-=2;
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.parseColor("#e8130c"));
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.parseColor("#0ced5b"));
            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.parseColor("#db4f09"));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.parseColor("#0c4ced"));
            }
        });
    }
}