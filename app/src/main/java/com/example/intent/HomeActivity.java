package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button apl;
    Button blog;
    Button sosmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        apl = (Button) findViewById(R.id.btn_apl);
        apl.setOnClickListener(this);
        blog = (Button) findViewById(R.id.btn_blog);
        blog.setOnClickListener(this);
        sosmed = (Button) findViewById(R.id.btn_sosmed);
        sosmed.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_apl:
                Intent aplikasi = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(aplikasi);
                break;
            case R.id.btn_blog:
                Intent blogs = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rppweb.blogspot.com/"));
                startActivity(blogs);
                break;
            case R.id.btn_sosmed:
                Intent sosial = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/riksaparadilapasa/"));
                startActivity(sosial);
                break;
            default:
                break;
        }
    }
}
