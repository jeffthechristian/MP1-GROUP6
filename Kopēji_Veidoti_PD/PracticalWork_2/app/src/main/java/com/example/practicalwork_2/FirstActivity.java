package com.example.practicalwork_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    TextView text;
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btnGoSecond = (Button) findViewById(R.id.buttongo2);
        Button btnDialog = (Button) findViewById(R.id.buttonDialog);

        btnGoSecond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });
    }

        private void showAlertDialog() {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(FirstActivity.this);
            alertDialog.setTitle("6 Group’s Dialog");
            String[] items = {"Emīls Daivids Kļaviņš","Krista Briede","Valts Gustavs Gusmanis","Signe Grosberga"};
            boolean[] checkedItems = {false, false, false, false, false,false};
            alertDialog.setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    switch (which) {
                        case 0:
                            if(isChecked)
                                Toast.makeText(FirstActivity.this, "Emīls Daivids Kļaviņš checked", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(FirstActivity.this, "Emīls Daivids Kļaviņš unchecked", Toast.LENGTH_LONG).show();
                            break;
                        case 1:
                            if(isChecked)
                                Toast.makeText(FirstActivity.this, "Krista Briede checked", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(FirstActivity.this, "Krista Briede unchecked", Toast.LENGTH_LONG).show();
                            break;
                        case 2:
                            if(isChecked)
                                Toast.makeText(FirstActivity.this, "Valts Gustavs Gusmanis checked", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(FirstActivity.this, "Valts Gustavs Gusmanis unchecked", Toast.LENGTH_LONG).show();
                            break;
                        case 3:
                            if(isChecked)
                                Toast.makeText(FirstActivity.this, "Signe Grosberga checked", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(FirstActivity.this, "Signe Grosberga unchecked", Toast.LENGTH_LONG).show();
                            break;
                    }
                }
            });
            alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(FirstActivity.this, "You clicked OK", Toast.LENGTH_SHORT).show();
                }
            });

            alertDialog.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(FirstActivity.this, "You closed dialog", Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                }
            });

            AlertDialog alert = alertDialog.create();
            alert.setCanceledOnTouchOutside(false);
            alert.show();

    }
}