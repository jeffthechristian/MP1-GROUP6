package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.DataInput;

public class AlcoholCalculator extends AppCompatActivity {
   public static TextView alcStrengthInput, volumeInput;
    public static Button btnSaveData2, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcohol_calculator);

        alcStrengthInput =(TextView) findViewById(R.id.alcStrengthInput);
        volumeInput=(TextView) findViewById(R.id.volumeInput);

        btnSaveData2=(Button) findViewById(R.id.btnSaveData2);
        btnBack=(Button) findViewById(R.id.btnBack);


        SharedPreferences sp = getApplicationContext().getSharedPreferences("data", Context.MODE_PRIVATE);
        String sgender = sp.getString("gender", "0.68");
        String sweight = sp.getString("weight", "75");


        double gender = Double.parseDouble(sgender);
        double weight = Double.parseDouble(sweight);
        double alcStrength = Double.parseDouble(alcStrengthInput.getText().toString());
        double volume = Double.parseDouble(volumeInput.getText().toString());



        btnSaveData2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double vr = alcStrength * volume * 7.9;
                double mr = weight * gender;
                double prom = vr / mr;
                double TSober = prom / 0.16;

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("res", String.valueOf(prom));
                editor.putString("res2", String.valueOf(TSober));
                editor.apply();
                startActivity(new Intent(AlcoholCalculator.this, DataInput.class));

            }
        } );

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlcoholCalculator.this, DataInput.class));
            }
        } );
    }

}