package com.example.alcholator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //Go to DataInput activity or CheckboxScreen based on checkbox
        Button btnDataInput = findViewById(R.id.btnDataInput);
        CheckBox soulCheck = (CheckBox) findViewById(R.id.soulCheck);
        btnDataInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (soulCheck.isChecked()) {
                    Intent intent = new Intent(StartActivity.this, DataInput.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(StartActivity.this, CheckboxScreen.class);
                    startActivity(intent);
                }
            }
        });
    }
}