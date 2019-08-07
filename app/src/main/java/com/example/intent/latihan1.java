package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latihan1 extends AppCompatActivity implements View.OnClickListener {

    Button explicitIntent;
    Button implicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1);

        explicitIntent = (Button)findViewById(R.id.explicitIntent);
        explicitIntent.setOnClickListener(this);
        implicitIntent = (Button)findViewById(R.id.implicitIntent);
        implicitIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.explicitIntent:
                Intent explicit = new Intent(latihan1.this,latihan1_intent.class);
                startActivity(explicit);
                break;

            case R.id.implicitIntent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://w3school.com"));
                startActivity(implicit);
                break;
             default:
                 break;
        }
    }
}
