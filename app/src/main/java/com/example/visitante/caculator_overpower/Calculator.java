package com.example.visitante.caculator_overpower;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
public class Calculator extends AppCompatActivity {

    int num, num_copia, x;
    String outp = "";
    String op = "";
    TextView tvResult;
    TextView tvNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tvResult = (TextView) findViewById(R.id.tvresults);
        tvNumero = (TextView) findViewById(R.id.tvelements);
    }

    public void Guarda(int i) {
        outp = outp + Integer.toString(i);
        num = i;
        tvNumero.setText(outp);
    }

    public void onClickBtn1(View view) {
        Guarda(1);
    }

    public void onClickBtn2(View view) {
        Guarda(2);
    }

    public void onClickBtn3(View view) {
        Guarda(3);
    }

    public void onClickBtn4(View view) {
        Guarda(4);
    }

    public void onClickBtn5(View view) {
        Guarda(5);
    }

    public void onClickBtn6(View view) {
        Guarda(6);
    }

    public void onClickBtn7(View view) {
        Guarda(7);
    }

    public void onClickBtn8(View view) {
        Guarda(8);
    }

    public void onClickBtn9(View view) {
        Guarda(9);
    }

    public void onClickBtn10(View view) {
        Guarda(0);
    }

    public void onClickBtnSum(View view) {
        haga();
        op = "+";
    }

    public void onClickBtnRest(View view) {
        haga();
        op = "-";
    }

    public void onClickBtnResult(View view) {
        resulta();
    }

    public void haga() {
        if (x==1){
            resulta();
        }
        outp = "";
        num_copia=num;
        x = 1;
    }

    public void resulta(){
        switch (op){
            case "+":
                num = num+num_copia;
                break;
            case "-":
                num=num_copia-num;
                break;
        }
        x = 0;
        tvResult.setText(""+num);
    }


    public void onClickRst(View view) {
        outp = "";
        num = 0;
        num_copia = 0;
        tvNumero.setText("");
        tvResult.setText("");
    }

    public void onClickHist (View view) {
        Intent i = new Intent(Calculator.this,Historial.class);
        startActivity(i);
    }
}
