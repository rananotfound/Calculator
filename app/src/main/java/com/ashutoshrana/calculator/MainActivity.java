package com.ashutoshrana.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView input,output;
Button on,two,three,four,five,six,seven,eight,nine,zero,dot,plus,minus,multiple,divide,equals,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=findViewById(R.id.inputScreen);
        output=findViewById(R.id.resultScreen);
        on=findViewById(R.id.btnOne);
        two=findViewById(R.id.btnTwo);
        three=findViewById(R.id.btnThree);
        four=findViewById(R.id.btnFour);
        five=findViewById(R.id.btnFive);
        six=findViewById(R.id.btnSix);
        seven=findViewById(R.id.btnSeven);
        eight=findViewById(R.id.btnEight);
        nine=findViewById(R.id.btnNine);
        zero=findViewById(R.id.btnZero);
        dot=findViewById(R.id.btnDot);
        plus=findViewById(R.id.btnAdd);
        minus=findViewById(R.id.btnSubtract);
        multiple=findViewById(R.id.btnMultiply);
        divide=findViewById(R.id.btnDivide);
        equals=findViewById(R.id.btnEqual);
        clear=findViewById(R.id.btnClear);

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str="1";
            }
        });

    }
}
