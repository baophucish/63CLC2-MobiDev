package com.nguyenhoangbaophuc.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextWeight = findViewById(R.id.weight);
        EditText editTextHeight = findViewById(R.id.height);
        Button button = findViewById(R.id.btnSubmit);
        TextView textView = findViewById(R.id.result);
        TextView textView2 = findViewById(R.id.result2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float height = Float.parseFloat(String.valueOf(editTextHeight.getText())) / 100;
                float weight = Float.parseFloat(String.valueOf(editTextWeight.getText()));
                float bmi = weight / (height * height);
                textView.setText(String.valueOf(bmi));
                if (bmi < 18.5){
                    textView2.setText("Very thin");
                } else if (bmi < 25) {
                    textView2.setText("Normal");
                } else if (bmi == 25) {
                    textView2.setText("Fat");
                } else if (bmi < 30) {
                    textView2.setText("Pre-obesity");
                } else if(bmi < 35){
                    textView2.setText("Grade 1 obesity");
                } else {
                    textView2.setText("Grade 2 obesity");
                }
            }
        });
    }
}