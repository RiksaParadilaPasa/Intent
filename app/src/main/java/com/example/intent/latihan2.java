package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latihan2 extends AppCompatActivity {
    Button btn_plays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);

        btn_plays = (Button)findViewById(R.id.btn_play);

        btn_plays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(latihan2.this,HomeActivity.class);
                startActivity(move);
            }
        });
    }
}
