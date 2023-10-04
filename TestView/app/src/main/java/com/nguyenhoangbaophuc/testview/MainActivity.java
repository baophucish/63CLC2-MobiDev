package com.nguyenhoangbaophuc.testview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void XuLyNoiXinChao(View v){
        EditText name1 = findViewById(R.id.name);
        String name = String.valueOf(name1.getText());
        Toast.makeText(this,"Xin chao " + name,Toast.LENGTH_LONG).show();
    }

    // Viet Ham Xu ly
    public void XuLyNoiHello(View v){
        EditText name1 = findViewById(R.id.name);
        String name = String.valueOf(name1.getText());
        Toast.makeText(this,"Nice to see you \n " + name,Toast.LENGTH_LONG).show();
    }
}