package com.example.alex.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlusClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.result);

        double num1 = Integer.parseInt(el1.getText().toString());
        double num2 = Integer.parseInt(el2.getText().toString());
        double resSum = num1 + num2;
        resText.setText(Double.toString(resSum));
    }

    public void onMinusClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.result);

        double num1 = Integer.parseInt(el1.getText().toString());
        double num2 = Integer.parseInt(el2.getText().toString());
        double resSum = num1 - num2;
        resText.setText(Double.toString(resSum));
    }

    public void onMultClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.result);

        double num1 = Integer.parseInt(el1.getText().toString());
        double num2 = Integer.parseInt(el2.getText().toString());
        double resSum = num1 * num2;
        resText.setText(Double.toString(resSum));
    }

    public void onDivClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.result);

        double num1 = Integer.parseInt(el1.getText().toString());
        double num2 = Integer.parseInt(el2.getText().toString());
        double resSum = num1/num2;
        resText.setText(Double.toString(resSum));
    }

    public void onModClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.result);

        double num1 = Integer.parseInt(el1.getText().toString());
        double num2 = Integer.parseInt(el2.getText().toString());
        double resSum = num1 % num2;
        resText.setText(Double.toString(resSum));
    }

    public void onPowClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.result);

        double num1 = Integer.parseInt(el1.getText().toString());
        double num2 = Integer.parseInt(el2.getText().toString());
        double resSum = Math.pow(num1, num2);
        resText.setText(Double.toString(resSum));
    }
}
