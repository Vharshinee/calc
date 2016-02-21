package com.example.vharshinee.ex3;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, beq, ba, bs, bm, bd, bc;
    char op;
    float num1, result;
    String temp, s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc();

    }

    public void calc() {
        e = (EditText) findViewById(R.id.editText);
        b0 = (Button) findViewById(R.id.button10);
        b1 = (Button) findViewById(R.id.button7);
        b2 = (Button) findViewById(R.id.button8);
        b3 = (Button) findViewById(R.id.button9);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button3);
        b8 = (Button) findViewById(R.id.button2);
        b9 = (Button) findViewById(R.id.button13);
        beq = (Button) findViewById(R.id.button12);
        ba = (Button) findViewById(R.id.button);
        bs = (Button) findViewById(R.id.button14);
        bm = (Button) findViewById(R.id.button15);
        bd = (Button) findViewById(R.id.button16);
        bc = (Button) findViewById(R.id.button11);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("0");
                e.setText(temp);
            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("1");

                e.setText(temp);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("2");
                e.setText(temp);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("3");
                e.setText(temp);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("4");
                e.setText(temp);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("5");
                e.setText(temp);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("6");
                e.setText(temp);


            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("7");
                e.setText(temp);


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("8");
                e.setText(temp);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e.getText().toString().concat("9");
                e.setText(temp);


            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(" ");


            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sa = e.getText().toString().trim();
                num1 = Float.parseFloat(sa);
                op = '+';
                e.setText("");

            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss = e.getText().toString().trim();
                if (ss.equals("")) {
                    e.setText("-");

                } else {
                    num1 = Float.parseFloat(ss);
                    op = '-';
                    e.setText("");


                }
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sm = e.getText().toString().trim();
                num1 = Float.parseFloat(sm);
                op = '*';
                e.setText("");


            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sd = e.getText().toString().trim();
                num1 = Float.parseFloat(sd);
                op = '/';
                e.setText("");

            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s2 = e.getText().toString().trim();
                float num2 = Float.parseFloat(s2);
                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                e.setText(String.valueOf(result));
            }
        });
    }
}


