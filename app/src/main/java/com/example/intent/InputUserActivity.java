package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InputUserActivity extends AppCompatActivity {
    Button btn_list, btn_login, btn_cuaca, btn_abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_user);

        btn_list =(Button)findViewById(R.id.btn_listview);
        btn_cuaca =(Button)findViewById(R.id.btn_cuaca);
        btn_login =(Button)findViewById(R.id.btn_login);
        btn_abc =(Button)findViewById(R.id.btn_abc);

        btn_cuaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(InputUserActivity.this, CuacaActivity.class);
                startActivity(move);
            }
        });


        btn_abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(InputUserActivity.this, abcActivity.class);
                startActivity(move);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(InputUserActivity.this, MainActivity.class);
                startActivity(move);
            }
        });

        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(InputUserActivity.this, ListViewActivity.class);
                startActivity(move);
            }
        });
    }
}
