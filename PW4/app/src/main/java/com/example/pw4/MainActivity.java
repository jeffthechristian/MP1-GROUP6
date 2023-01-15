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

    float firstValue, secValue;
    boolean addition, subtract, multiplication, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 =  findViewById(R.id.button3);
        Button button4 =  findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 =  findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        Button  buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSub = findViewById(R.id.buttonSub);
        Button buttonMul = findViewById(R.id.buttonMul);
        Button buttonDiv = findViewById(R.id.buttonDiv);
        Button buttonEql = findViewById(R.id.buttonEql);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonDel = findViewById(R.id.buttonDel);

        Button buttonMS = findViewById(R.id.buttonMS);
        Button buttonMR = findViewById(R.id.buttonMR);
        Button buttonMC =  findViewById(R.id.buttonMC);

      EditText inputText = findViewById(R.id.edt1);

//kalkulatora pogu nolasisana
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

//pogu funkcionalitates izveide, kas atbild par atminas saglabasanu
        buttonMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
                SharedPreferences.Editor myEdit = sharedPreferences.edit();

                //ja ir tuksa vertiba ievades lauku atstaj tuksu
                try {
                    myEdit.putInt(String.valueOf(inputText), Integer.parseInt(inputText.getText().toString()));
                    myEdit.commit();
                }catch (NumberFormatException nfe){
                    inputText.setText("");
                }
                }

        });

        buttonMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                sharedPreferences.edit().remove(String.valueOf(inputText)).commit();
            }
        });

        buttonMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                int numb = sharedPreferences.getInt(String.valueOf(inputText),0);
                inputText.setText(String.valueOf(numb));
            }
        });


//matematisko pogu un darbibu definesana
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    firstValue = Float.parseFloat(inputText.getText() + "");
                    addition = true;
                    inputText.setText(null);
                }catch (NumberFormatException nfe){
                        inputText.setText("");
                    }
                }

        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    firstValue = Float.parseFloat(inputText.getText() + "");
                    subtract = true;
                    inputText.setText(null);
                }catch (NumberFormatException nfe) {
                    inputText.setText("");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 try {
                    firstValue = Float.parseFloat(inputText.getText() + "");
                    multiplication = true;
                    inputText.setText(null);
                }catch (NumberFormatException nfe){
                     inputText.setText("");
                 }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    firstValue = Float.parseFloat(inputText.getText() + "");
                    division = true;
                    inputText.setText(null);
                }catch (NumberFormatException nfe){
                    inputText.setText("");
                }
            }
        });

//parbauda kura no matematiskajam darbibam ir patiesa un veic matematisko darbibu
        buttonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
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
                } catch (NumberFormatException nfe) {
                    inputText.setText("");
                }
            }

        });



// ja nospiez pogu C tiek nodzests ievades lauks
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText("");
            }
        });

 // ievades lauka lauj ievadit dalskaitlus ar punktu pa vidu
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText() + ".");
            }
        });


    }
}










