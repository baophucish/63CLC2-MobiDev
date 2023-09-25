package com.nguyenhoangbaophuc.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton buttonAdd, buttonSub, buttonMultiply, buttonDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNum1 = findViewById(R.id.num1);
        EditText editNum2 = findViewById(R.id.num2);

        TextView textView = findViewById(R.id.result);

        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMultiply = findViewById(R.id.btnMultiply);
        buttonDivide = findViewById(R.id.btnDivide);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(String.valueOf(editNum1.getText()));
                float num2 = Float.parseFloat(String.valueOf(editNum2.getText()));
                float sum = num1 + num2;
                textView.setText(String.valueOf(sum));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(String.valueOf(editNum1.getText()));
                float num2 = Float.parseFloat(String.valueOf(editNum2.getText()));
                float hieu = num1 - num2;
                textView.setText(String.valueOf(hieu));
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(String.valueOf(editNum1.getText()));
                float num2 = Float.parseFloat(String.valueOf(editNum2.getText()));
                float tich = num1 * num2;
                textView.setText(String.valueOf(tich));
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(String.valueOf(editNum1.getText()));
                float num2 = Float.parseFloat(String.valueOf(editNum2.getText()));
                float thuong = num1 / num2;
                textView.setText(String.valueOf(thuong));
            }
        });
    }
}