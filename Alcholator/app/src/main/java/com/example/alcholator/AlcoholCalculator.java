package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlcoholCalculator extends AppCompatActivity {
    private TextView alcStrengthInput, volumeInput;
    private Button btnSaveData2, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcohol_calculator);

        alcStrengthInput =(TextView) findViewById(R.id.alcStrengthInput);
        volumeInput=(TextView) findViewById(R.id.volumeInput);

        btnSaveData2=(Button) findViewById(R.id.btnSaveData2);
        btnBack=(Button) findViewById(R.id.btnBack);

        double alcStrength = Integer.parseInt(alcStrengthInput.getText().toString());
        double volume = Integer.parseInt(volumeInput.getText().toString());

        btnSaveData2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlcoholCalculator.this, DataInput.class));
                calculate();
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
    public void calculate(){
    };
}