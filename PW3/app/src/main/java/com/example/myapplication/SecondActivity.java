package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txt;
        txt = findViewById(R.id.textViewMode);
        Button butt = findViewById(R.id.readPreBtn);
        SharedPreferences sp = getApplicationContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String moder = sp.getString("mode", "");
        if(sp.contains("mode")){
            if(moder.matches("Light theme")){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
            if(moder.matches("Dark theme")){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        };



        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getApplicationContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                String moder = sp.getString("mode", "");
                txt.setText(moder);
                if (!sp.contains("mode")){
                    Toast.makeText(SecondActivity.this, "Nothing found", Toast.LENGTH_LONG).show();
                }

            }
        });
        Button btnGoBack = (Button) findViewById(R.id.backButton);

        btnGoBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, FirstActivity.class));
            }
        });
    }
}