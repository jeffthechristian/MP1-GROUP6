package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class DataInput extends AppCompatActivity {
    public CheckBox maleBox, femaleBox;
    public TextView weightInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_input);

        maleBox=(CheckBox) findViewById(R.id.maleBox);
        femaleBox=(CheckBox) findViewById(R.id.femaleBox);

        weightInput = (TextView) findViewById(R.id.weightInput);


        double gender =(double) genderCheck();
        double weight = Integer.parseInt(weightInput.getText().toString());


        //Go to alc. calculator activity with data input
        Button btnSaveData = findViewById(R.id.btnSaveData);
        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DataInput.this, AlcoholCalculator.class));
            }
        } );

        //Go to alc. calculator activity without data input
        Button btnSkipData = findViewById(R.id.btnSkipData);
        btnSkipData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DataInput.this, AlcoholCalculator.class));
            }
        } );
    }
    public void saveData(){
    };

    public void skipData(){
    };

    public double genderCheck() {
        double male = 0;
        double female = 0;
        double noGender = 0;
        double gender = 0;

        if(maleBox.isChecked()){
            gender=male;
        }else if(femaleBox.isChecked()){
            gender=female;
        }else{
            gender=noGender;
        };
        return gender;
    };
}