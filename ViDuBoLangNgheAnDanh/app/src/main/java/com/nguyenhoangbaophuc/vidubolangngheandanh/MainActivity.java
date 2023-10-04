package com.nguyenhoangbaophuc.vidubolangngheandanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_Name;
    Button buttonSayHi, buttonXinChao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();

        buttonXinChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(editText_Name.getText());
                Toast.makeText(getBaseContext(),"Xin Chao " + name,Toast.LENGTH_LONG).show();
            }
        });

        buttonSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(editText_Name.getText());
                Toast.makeText(getBaseContext(),"Nice to meet you \n " + name,Toast.LENGTH_LONG).show();
            }
        });
    }

    void findControls(){
        editText_Name = findViewById(R.id.name);
        buttonSayHi = findViewById(R.id.btnHello);
        buttonXinChao = findViewById(R.id.btnXinChao);
    }
}