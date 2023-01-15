package com.example.pw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2,
            button3, button4, button5,
            button6, button7, button8,
            button9,buttonAdd, buttonSub,
            buttonMul, buttonDiv, buttonEql,
            buttonDot, buttonDel, buttonMS,
            buttonMR, buttonMC;
    EditText inputText;
    float firstValue, secValue;
    boolean addition, subtract, multiplication, division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPref =  getSharedPreferences("MyShred", Context.MODE_PRIVATE);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonEql = (Button) findViewById(R.id.buttonEql);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonDel = (Button) findViewById(R.id.buttonDel);

        buttonMS = (Button) findViewById(R.id.buttonMS);
        buttonMR = (Button) findViewById(R.id.buttonMR);
        buttonMC = (Button) findViewById(R.id.buttonMC);

        inputText = (EditText) findViewById(R.id.edt1);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + "9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText == null) {
                    inputText.setText("");
                } else {
                    firstValue = Float.parseFloat(inputText.getText() + "");
                    addition = true;
                    inputText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText == null) {
                    inputText.setText("");
                } else {
                    firstValue = Float.parseFloat(inputText.getText() + "");
                    subtract = true;
                    inputText.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText == null) {
                    inputText.setText("");
                } else {
                    firstValue = Float.parseFloat(inputText.getText() + "");
                    multiplication = true;
                    inputText.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText == null) {
                    inputText.setText("");
                } else {
                    firstValue = Float.parseFloat(inputText.getText() + "");
                    division = true;
                    inputText.setText(null);
                }
            }
        });

        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                secValue = Float.parseFloat(inputText.getText() + "");

                if (addition == true) {
                    inputText.setText(firstValue + secValue + "");
                    addition = false;
                }
                if (subtract == true) {
                    inputText.setText(firstValue - secValue + "");
                    subtract = false;
                }

                if (multiplication == true) {
                    inputText.setText(firstValue * secValue + "");
                    multiplication = false;
                }

                if (division == true) {
                    inputText.setText(firstValue / secValue + "");
                    division = false;
                }
            }

        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + ".");
            }
        });

        buttonMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}

