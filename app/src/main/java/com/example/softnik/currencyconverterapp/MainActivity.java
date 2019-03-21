package com.example.softnik.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro,dollar,pound,yen,dinar,bitcoin,rubel,ausDollar,canDollar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.euro);
        dollar=findViewById(R.id.dollar);
        pound=findViewById(R.id.pound);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel=findViewById(R.id.rubel);
        ausDollar=findViewById(R.id.ausDollar);
        canDollar=findViewById(R.id.canDollar);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String euroToRupee=editText.getText().toString();

                if(TextUtils.isEmpty(euroToRupee)){
                    editText.setError("Empty User Input");
                }
                else{
                    double x,y;
                    x=Double.parseDouble(euroToRupee);
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    y= x * 0.012;

                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));

                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dollerToRupee=editText.getText().toString();

                if(TextUtils.isEmpty(dollerToRupee)){
                    editText.setError("Empty User Input");
                }else{
                    double x , y;
                    x=Double.parseDouble(dollerToRupee);
                    textView.setText(null);
                    y=x*0.014;

                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));

                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String poundToRupee=editText.getText().toString();

                if(TextUtils.isEmpty(poundToRupee)){
                    editText.setError("Empty User Input");
                }else{
                    double x , y;
                    x=Double.parseDouble(poundToRupee);
                    textView.setText(null);
                    y = x * 0.011;

                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yenToRupee=editText.getText().toString();

                if (TextUtils.isEmpty(yenToRupee)) {
                    editText.setError("Empty User Input");
                }else{
                    double x ,y;
                    x=Double.parseDouble(yenToRupee);
                    textView.setText(null);
                    y= x * 1.55;


                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));
                }

            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dinarToRupee=editText.getText().toString();

                if (TextUtils.isEmpty(dinarToRupee)) {
                    editText.setError("Empty User Input");
                }else{
                    double x ,y;
                    x=Double.parseDouble(dinarToRupee);
                    textView.setText(null);
                    y= x * 16.78;


                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));
                }

            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bitcoinToRupee=editText.getText().toString();

                if (TextUtils.isEmpty(bitcoinToRupee)) {
                    editText.setError("Empty User Input");
                }else{
                    double x ,y;
                    x=Double.parseDouble(bitcoinToRupee);
                    textView.setText(null);
                    y= x * 0.0000040;


                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));
                }

            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rubelToRupee=editText.getText().toString();

                if (TextUtils.isEmpty(rubelToRupee)) {
                    editText.setError("Empty User Input");
                }else{
                    double x ,y;
                    x=Double.parseDouble(rubelToRupee);
                    textView.setText(null);
                    y= x * 0.93;


                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));
                }

            }
        });

        ausDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ausDollarToRupee=editText.getText().toString();

                if (TextUtils.isEmpty(ausDollarToRupee)) {
                    editText.setError("Empty User Input");
                }else{
                    double x ,y;
                    x=Double.parseDouble(ausDollarToRupee);
                    textView.setText(null);
                    y= x * 0.020;


                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));
                }

            }
        });

        canDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String canDollarToRupee=editText.getText().toString();

                if (TextUtils.isEmpty(canDollarToRupee)) {
                    editText.setError("Empty User Input");
                }else{
                    double x ,y;
                    x=Double.parseDouble(canDollarToRupee);
                    textView.setText(null);
                    y= x * 0.019;


                    DecimalFormat numberFormat=new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(y));
                }

            }
        });



    }
}
