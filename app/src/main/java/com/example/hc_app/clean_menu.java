package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class clean_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_menu);
    }
    public void BH  (View v){
        Intent it = new Intent(clean_menu.this, MainActivity.class);
        startActivity(it);
    }
    public void BG  (View v){
        Intent it = new Intent(clean_menu.this, activity_bodyclean.class);
        startActivity(it);
    }
    public void cleanhard  (View v){
        Intent it = new Intent(clean_menu.this, clean_hair.class);
        startActivity(it);
    }
    public void cleanbody (View v){
        Intent it = new Intent(clean_menu.this,clean_body.class);
        startActivity(it);
    }
}

