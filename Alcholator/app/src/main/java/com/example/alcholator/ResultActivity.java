package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView bloodResult,soberResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        bloodResult = findViewById(R.id.bloodResult);
        soberResult = findViewById(R.id.soberResult);

        String sprom = getIntent().getStringExtra("keyprom");
        String ssober = getIntent().getStringExtra("keysober");

        double res = Double.parseDouble(sprom);
        double res2 = Double.parseDouble(ssober);

        bloodResult.setText(sprom);
        soberResult.setText(ssober);

        Button btnBack2 = findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this, AlcoholCalculator.class));
            }
        } );
    }
}