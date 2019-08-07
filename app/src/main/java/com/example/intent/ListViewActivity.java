package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    List<Gambar> mylist;
    ListView listView;

    Button btn_cuaca, btn_login, btn_ui, btn_abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.list_view);
        mylist = new ArrayList<>();

        mylist.add(new Gambar(R.drawable.batman ,"Batman"));
        mylist.add(new Gambar(R.drawable.ironman ,"ironman"));


        Adapter adapter = new Adapter(this , R.layout.custom_list , mylist);
        listView.setAdapter(adapter);



        btn_cuaca =(Button)findViewById(R.id.btn_cuaca);
        btn_ui =(Button)findViewById(R.id.btn_inputUser);
        btn_login =(Button)findViewById(R.id.btn_login);
        btn_abc =(Button)findViewById(R.id.btn_abc);

        btn_ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(ListViewActivity.this, InputUserActivity.class);
                startActivity(move);
            }
        });


        btn_abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(ListViewActivity.this, abcActivity.class);
                startActivity(move);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(ListViewActivity.this, MainActivity.class);
                startActivity(move);
            }
        });

        btn_cuaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(ListViewActivity.this, CuacaActivity.class);
                startActivity(move);
            }
        });
    }
}
