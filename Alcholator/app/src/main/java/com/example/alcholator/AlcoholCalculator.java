package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlcoholCalculator extends AppCompatActivity {
    TextView alcStrengthInput, volumeInput;
    Button btnSaveData2, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcohol_calculator);

        alcStrengthInput = findViewById(R.id.alcStrengthInput);
        alcStrengthInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        volumeInput= findViewById(R.id.volumeInput);
        volumeInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        btnSaveData2= findViewById(R.id.btnSaveData2);
        btnBack= findViewById(R.id.btnBack);

        btnSaveData2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sgender = getIntent().getStringExtra("keygender");
                String sweight = getIntent().getStringExtra("keyweight");
                double gender = Double.parseDouble(sgender);
                double weight = Double.parseDouble(sweight);
                double alcStrength = Double.parseDouble(alcStrengthInput.getText().toString());
                double volume = Double.parseDouble(volumeInput.getText().toString());

                double vr = alcStrength * (volume * 7.9);
                double mr = weight * gender;
                double prom = vr / mr;
                double sober = prom / 0.16;

                String ssober = String.valueOf(sober);
                String sprom = String.valueOf(prom);

                Intent yoo = new Intent(AlcoholCalculator.this, ResultActivity.class);
                yoo.putExtra("keyprom", sprom);
                yoo.putExtra("keysober", ssober);
                startActivity(yoo);
            }
        } );

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlcoholCalculator.this, DataInput.class));
            }
        } );
    }
}