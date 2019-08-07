package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abcActivity extends AppCompatActivity {
    Button btn_list, btn_login, btn_ui, btn_cuaca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);

        btn_list =(Button)findViewById(R.id.btn_listview);
        btn_ui =(Button)findViewById(R.id.btn_inputUser);
        btn_login =(Button)findViewById(R.id.btn_login);
        btn_cuaca =(Button)findViewById(R.id.btn_cuaca);

        btn_ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(abcActivity.this, InputUserActivity.class);
                startActivity(move);
            }
        });


        btn_cuaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(abcActivity.this, CuacaActivity.class);
                startActivity(move);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(abcActivity.this, MainActivity.class);
                startActivity(move);
            }
        });

        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(abcActivity.this, ListViewActivity.class);
                startActivity(move);
            }
        });
    }
}
