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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textToChange);
        Button button1 = findViewById(R.id.btnSize);
        Button button2 = findViewById(R.id.btnColor);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickSizeCount++;
                if(clickSizeCount == 1){
                    textView.setTextSize(65);
                } else if (clickSizeCount == 2) {
                    textView.setTextSize(35);
                    clickSizeCount = 0;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickColorCount++;
                if(clickColorCount == 1){
                    textView.setTextColor(Color.parseColor("#bd0f32"));
                } else if (clickColorCount == 2) {
                    textView.setTextColor(Color.parseColor("#5018b8"));
                    clickColorCount = 0;
                }
            }
        });
    }
}