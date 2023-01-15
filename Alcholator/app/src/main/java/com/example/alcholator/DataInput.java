package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class DataInput extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_input);

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
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.maleBox:
                if (checked)

                break;
            case R.id.femaleBox:
                if (checked)

                break;
        }
    }
}