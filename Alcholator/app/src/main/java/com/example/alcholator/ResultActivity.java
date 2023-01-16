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
    TextView bloodResult,soberResult, yesDrive, noDrive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        bloodResult = findViewById(R.id.bloodResult);
        soberResult = findViewById(R.id.soberResult);
        yesDrive = findViewById(R.id.textView16);
        noDrive = findViewById(R.id.textView17);

        String sprom = getIntent().getStringExtra("keyprom");
        String ssober = getIntent().getStringExtra("keysober");
        String sgender = getIntent().getStringExtra("keygender");
        String sweight = getIntent().getStringExtra("keyweight");

        double res = Double.parseDouble(sprom);
        double res2 = Double.parseDouble(ssober);

        bloodResult.setText(sprom);
        soberResult.setText(ssober);

        canYouDrive();

        Button btnBack2 = findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent doo = new Intent(ResultActivity.this, AlcoholCalculator.class);
                doo.putExtra("keygender", sgender);
                doo.putExtra("keyweight", sweight);
                startActivity(doo);

            }
        } );
    }
    void canYouDrive() {
        double promiles = Double.parseDouble(getIntent().getStringExtra("keyprom"));
        if (promiles < 0.5) {
            yesDrive.setVisibility(View.VISIBLE);
        }
        if (promiles > 0.5) {
            noDrive.setVisibility(View.VISIBLE);
        }
    }
}