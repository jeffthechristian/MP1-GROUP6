package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView bloodResult,soberResult;
        bloodResult = findViewById(R.id.bloodResult);
        soberResult = findViewById(R.id.soberResult);


        SharedPreferences sp = getApplicationContext().getSharedPreferences("data", Context.MODE_PRIVATE);
        String sres = sp.getString("res", "0");
        String sres2 = sp.getString("res2", "0");

        double res = Double.parseDouble(sres);
        double res2 = Double.parseDouble(sres2);

        bloodResult.setText(sres);
        soberResult.setText(sres2);
    }
}