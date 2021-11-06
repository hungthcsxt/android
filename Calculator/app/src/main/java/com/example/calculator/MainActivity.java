package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textResult ;
    private TextView textCalculation;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonC;
    private Button buttonCE;
    private Button buttonBS;
    private Button buttonAdd;
    private Button buttonDiv;
    private Button buttonMul;
    private Button buttonSub;
    private Button buttonEqual;
    private  String calculation = "";
    private  String calculation1 = "";
    private  String calculation2 = "";
    private int state =1, state1 = 0;
    private int op1;
    private int op2;
    private int cal;
    private String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.textResult);
        textCalculation = findViewById(R.id.textCalculator);

        Button button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        buttonC = findViewById(R.id.buttonCE);
        buttonCE = findViewById(R.id.buttonC);
        buttonBS = findViewById(R.id.buttonBS);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMul = findViewById(R.id.buttonMul);
        buttonSub = findViewById(R.id.buttonSub);

        buttonEqual = findViewById(R.id.buttonEqual);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonCE.setOnClickListener(this);
        buttonBS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId() ;
        switch (id){
            case R.id.button0:
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
                state1 = 0;
                calculation = calculation + ((Button)v).getText();
                calculation1 = calculation1 + ((Button)v).getText();
                result+=((Button)v).getText();
                textCalculation.setText(calculation);
                break;

            case R.id.buttonAdd:
                cal = 1;
                if(state == 1){
                    if(calculation=="" && state1 !=1){
                        break;
                    }
                    else if(state1 ==1){
                        calculation = textResult.getText().toString() + ((Button)v).getText();
                        //Log.v("TEST", calculation);
                        textCalculation.setText(calculation);
                        break;
                    }
                    else {
                        state = 2;
                        op1 = Integer.parseInt(calculation1);
                    }
                }
                calculation1 ="";
                calculation = calculation + ((Button)v).getText();
                calculation2 = calculation;
                textCalculation.setText(calculation);
                break;
            case R.id.buttonSub:
                cal = 2;
                if(state == 1){
                    if(calculation=="" && state1 !=1){
                        break;
                    }
                    else if(state1 ==1){
                        calculation = textResult.getText().toString() + ((Button)v).getText();
                        //Log.v("TEST", calculation);
                        textCalculation.setText(calculation);
                        break;
                    }
                    else {
                        state = 2;
                        op1 = Integer.parseInt(calculation1);
                    }
                }
                calculation1 ="";
                calculation = calculation + ((Button)v).getText();
                calculation2 = calculation;
                textCalculation.setText(calculation);
                break;
            case R.id.buttonMul:
                cal = 3;
                if(state == 1){
                    if(calculation=="" && state1 !=1){
                        break;
                    }
                    else if(state1 ==1){
                        calculation = textResult.getText().toString() + ((Button)v).getText();
                        //Log.v("TEST", calculation);
                        textCalculation.setText(calculation);
                        break;
                    }
                    else {
                        state = 2;
                        op1 = Integer.parseInt(calculation1);
                    }
                }
                calculation1 ="";
                calculation = calculation + ((Button)v).getText();
                calculation2 = calculation;
                textCalculation.setText(calculation);
                break;
            case R.id.buttonDiv:
                cal = 4;
                if(state == 1){
                    if(calculation=="" && state1 !=1){
                        break;
                    }
                    else if(state1 ==1){
                        calculation = textResult.getText().toString() + ((Button)v).getText();
                        //Log.v("TEST", calculation);
                        textCalculation.setText(calculation);
                        break;
                    }
                    else {
                        state = 2;
                        op1 = Integer.parseInt(calculation1);
                    }
                }
                calculation1 ="";
                calculation = calculation + ((Button)v).getText();
                calculation2 = calculation;
                textCalculation.setText(calculation);
                break;
            case R.id.buttonEqual:
                if(calculation =="+" ||
                        calculation =="-" ||
                        calculation =="*" ||
                        calculation =="/"){
                    break;
                }
                if(state ==1 ){
                    textResult.setText(textCalculation.getText().toString());
                }
                if(calculation == "" && state ==1){
                    textCalculation.setText(calculation);
                    break;
                }
                if(textCalculation.getText().toString() == "" && state ==1){
                    textCalculation.setText(calculation);
                    break;
                }
                if(state==2 && calculation1 ==""){
                    break;
                }
                op2 = Integer.parseInt(calculation1);
                switch (cal) {
                    case 1:
                        textResult.setText(Integer.toString(op1 + op2));
                        textCalculation.setText("");
                        op1 = op1+op2;
                        break;
                    case 2:
                        textResult.setText(Integer.toString(op1 - op2));
                        textCalculation.setText("");
                        op1 = op1-op2;
                        break;
                    case 3:
                        textResult.setText(Integer.toString(op1 * op2));
                        textCalculation.setText("");
                        op1 = op1*op2;
                        break;
                    case 4:
                        if(op2 ==0){
                            textResult.setText("Syntax error");
                            textCalculation.setText("");
                            break;
                        }
                        textResult.setText(Double.toString((double) op1 / op2));
                        textCalculation.setText("");
                        op1 = op1/op2;
                        break;
                }
                state=1;
                state1 = 1;
                calculation = "";
                calculation1 = "";
                break;
            case R.id.buttonCE:
                if(state==1){
                    calculation ="";
                    calculation1 ="";
                    textCalculation.setText(calculation);
                }
                if(state ==2){
                    calculation = calculation2;
                    calculation1 ="";
                    textCalculation.setText(calculation);
                }
                break;
            case R.id.buttonC:
                calculation ="";
                calculation1 = "";
                calculation2 = "";
                state1 = 0;
                state = 1;
                op1=0;
                textCalculation.setText(calculation);
                textResult.setText(calculation);
                break;
            case R.id.buttonBS:
                if(state ==1){
                    if(calculation == ""){
                        textCalculation.setText(calculation);
                        break;
                    }
                    else if(textCalculation.getText().toString() ==""){
                        textCalculation.setText(calculation);
                        break;
                    }
                    else {
                        calculation = calculation.substring(0, calculation.length() - 1);
                        calculation1 = calculation1.substring(0, calculation1.length() - 1);
                        textCalculation.setText(calculation);
                        break;
                    }
                }

                else if(state ==2 ){
                    if(calculation1 ==""){
                        state =1;
                        calculation = calculation.substring(0, calculation.length() - 1);
                        calculation1 = calculation;
                        textCalculation.setText(calculation);
                        break;
                    }
                    else {
                        calculation = calculation.substring(0, calculation.length() - 1);
                        calculation1 = calculation1.substring(0, calculation1.length() - 1);
                        textCalculation.setText(calculation);
                        break;
                    }
                }

            default:
                break;
        }

    }
}