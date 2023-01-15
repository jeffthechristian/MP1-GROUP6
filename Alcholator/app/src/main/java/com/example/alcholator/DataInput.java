package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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


        String gender = genderCheck();


        String weight = weightInput.getText().toString();



        //Go to alc. calculator activity with data input
        Button btnSaveData = findViewById(R.id.btnSaveData);
        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sp = getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("gender", gender);
                editor.putString("weight", weight);
                editor.apply();
                startActivity(new Intent(DataInput.this, AlcoholCalculator.class));
            }
        } );

        //Go to alc. calculator activity without data input
        Button btnSkipData = findViewById(R.id.btnSkipData);
        btnSkipData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sp = getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("gender", "0.68");
                editor.putString("weight", "75" );
                editor.apply();
                startActivity(new Intent(DataInput.this, AlcoholCalculator.class));
            }
        } );
    }
    public void saveData(){

    }

    public void skipData(){
    }

    public String genderCheck() {
        String male = "0.68";
        String female = "0.55";
        String noGender = "0.68";
        String gender;

        if(maleBox.isChecked()){
            gender=male;
        }else if(femaleBox.isChecked()){
            gender=female;
        }else{
            gender=noGender;
        }
        return gender;
    }
}

