package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    boolean isNewOp = true;
    EditText ed1;
    String oldNumber = "";
    String operator = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);

    }

    public void numberEvent(View view) {
        if (isNewOp) {
            ed1.setText("");
        }
        isNewOp = false;
        String number = ed1.getText().toString();
        if (view.getId() == R.id.bu0) {
            number += "0";
        }
        if (view.getId() == R.id.bu1) {
            number += "1";
        }
        if (view.getId() == R.id.bu2) {
            number += "2";
        }
        if (view.getId() == R.id.bu3) {
            number += "3";
        }
        if (view.getId() == R.id.bu4) {
            number += "4";
        }
        if (view.getId() == R.id.bu5) {
            number += "5";
        }
        if (view.getId() == R.id.bu6) {
            number += "6";
        }
        if (view.getId() == R.id.bu7) {
            number += "7";
        }
        if (view.getId() == R.id.bu8) {
            number += "8";
        }
        if (view.getId() == R.id.bu9) {
            number += "9";
        }
        if (view.getId() == R.id.buDot) {
            number += ".";
        }
        if (view.getId() == R.id.buPlusMinus) {
            number = "-" + number;
        }
        ed1.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        if (view.getId() == R.id.buPlus) {
            operator = "+";
        }
        if (view.getId() == R.id.buMinus) {
            operator = "-";
        }
        if (view.getId() == R.id.buMultiply) {
            operator = "*";
        }
        if (view.getId() == R.id.buDivide) {
            operator = "/";
        }
    }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        if (operator.equals("+")) {
            result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
        }
        if (operator.equals("-")) {
            result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
        }
        if (operator.equals("*")) {
            result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
        }
        if (operator.equals("/")) {
            result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
        }
        ed1.setText("" + result);
    }

    public void acEvent(View view) {
        ed1.setText("0");
        isNewOp = true;
    }

    public void percentEvent(View view) {
        double percentNumber = Double.parseDouble(ed1.getText().toString()) / 100;
        ed1.setText(percentNumber + "");
        isNewOp = true;
    }
}