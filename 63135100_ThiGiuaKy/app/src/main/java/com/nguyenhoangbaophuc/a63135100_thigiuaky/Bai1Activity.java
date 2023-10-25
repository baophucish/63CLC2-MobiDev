package com.nguyenhoangbaophuc.a63135100_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai1Activity extends AppCompatActivity {
    Button submit;
    EditText chieuCao, canNang;
    TextView ketQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        widget();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height = Float.parseFloat(String.valueOf(chieuCao.getText())) / 100;
                float weight = Float.parseFloat(String.valueOf(canNang.getText()));
                float bmi = weight/(height*height);
                ketQua.setText(String.valueOf(bmi));
            }
        });
    }


    public void widget(){
        chieuCao = findViewById(R.id.chieuCao);
        canNang = findViewById(R.id.canNang);
        ketQua = findViewById(R.id.ketQua);
        submit = findViewById(R.id.btnSubmit);
    }

}