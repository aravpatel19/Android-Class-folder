package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button C;
    Button equals;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    TextView equation;
    TextView answer;
    String equation1 = "";
    StringTokenizer tokenizer;
    String answer1 = "";
    String previous;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.id_0);
        zero.setOnClickListener(this);

        one = findViewById(R.id.id_1);
        one.setOnClickListener(this);

        two = findViewById(R.id.id_2);
        two.setOnClickListener(this);

        three = findViewById(R.id.id_3);
        three.setOnClickListener(this);

        four = findViewById(R.id.id_4);
        four.setOnClickListener(this);

        five = findViewById(R.id.id_5);
        five.setOnClickListener(this);

        six = findViewById(R.id.id_6);
        six.setOnClickListener(this);

        seven = findViewById(R.id.id_7);
        seven.setOnClickListener(this);

        eight = findViewById(R.id.id_8);
        eight.setOnClickListener(this);

        nine = findViewById(R.id.id_9);
        nine.setOnClickListener(this);

        C = findViewById(R.id.id_C);
        C.setOnClickListener(this);

        equals = findViewById(R.id.id_equals);
        equals.setOnClickListener(this);

        add = findViewById(R.id.id_add);
        add.setOnClickListener(this);

        subtract = findViewById(R.id.id_subtract);
        subtract.setOnClickListener(this);

        multiply = findViewById(R.id.id_multiply);
        multiply.setOnClickListener(this);

        divide = findViewById(R.id.id_divide);
        divide.setOnClickListener(this);


        equation = findViewById(R.id.id_equation);
        answer = findViewById(R.id.id_answer);

        equation.setText("equation");

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("0");
                    equation.setText(equation1);
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("1");
                    equation.setText(equation1);
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("2");
                    equation.setText(equation1);
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("3");
                    equation.setText(equation1);
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("4");
                    equation.setText(equation1);
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("5");
                    equation.setText(equation1);
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("6");
                    equation.setText(equation1);
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("7");
                    equation.setText(equation1);
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("8");
                    equation.setText(equation1);
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    answer.setText("Error");
                }
                else{
                    equation1+=("9");
                    equation.setText(equation1);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    equation1 = answer1+" + ";
                    equation.setText(equation1);
                    answer1="";
                    answer.setText(answer1);
                }
                else {
                    equation1 += (" + ");
                    equation.setText(equation1);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    equation1 = answer1+" - ";
                    equation.setText(equation1);
                    answer1 = "";
                    answer.setText(answer1);
                }
                else {
                    equation1 += (" - ");
                    equation.setText(equation1);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    equation1 = answer1+" * ";
                    equation.setText(equation1);
                    answer1 = "";
                    answer.setText(answer1);
                }
                else {
                    equation1 += (" * ");
                    equation.setText(equation1);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.length() > 0){
                    equation1 = answer1+" / ";
                    equation.setText(equation1);
                    answer1 = "";
                    answer.setText(answer1);
                }
                else {
                    equation1 += (" / ");
                    equation.setText(equation1);
                }
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation1 = "";
                answer1 = "";
                equation.setText("");
                answer.setText("");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> list = new ArrayList<>();

                try {
                    tokenizer = new StringTokenizer(equation1);
                    while (tokenizer.hasMoreElements()) {
                        String f = tokenizer.nextToken();
                        list.add(f);
                    }
                    int i = 1;

                    while ((list.indexOf("*") >= 0 || list.indexOf("/") >= 0) && list.size() > 0 && i < list.size()) {
                        if (list.get(i).equals("*")) {
                            double x = Double.valueOf(list.get(i - 1));
                            double y = Double.valueOf(list.get(i + 1));

                            double t = x * y;
                            String addon = "" + t;
                            list.set(i - 1, addon);
                            list.remove(i);
                            list.remove(i);
                            i--;

                        } else if (list.get(i).equals("/")) {
                            double x = Double.valueOf(list.get(i - 1));
                            double y = Double.valueOf(list.get(i + 1));

                            double t = x / y;
                            String addon = "" + t;
                            list.set(i - 1, addon);
                            list.remove(i);
                            list.remove(i);
                            i--;
                        }
                        i++;
                    }

                    i = 1;
                    while ((list.indexOf("+") >= 0 || list.indexOf("-") >= 0) && list.size() > 0 && i < list.size()) {
                        if (list.get(i).equals("+")) {
                            double x = Double.valueOf(list.get(i - 1));
                            double y = Double.valueOf(list.get(i + 1));

                            double t = x + y;
                            String addon = "" + t;
                            list.set(i - 1, addon);
                            list.remove(i);
                            list.remove(i);
                            i--;
                        } else if (list.get(i).equals("-")) {
                            double x = Double.valueOf(list.get(i - 1));
                            double y = Double.valueOf(list.get(i + 1));

                            double t = x - y;
                            String addon = "" + t;
                            list.set(i - 1, addon);
                            list.remove(i);
                            list.remove(i);
                            i--;
                        }
                        i++;
                    }
                /*while(list.size()>1 && i < list.size()-1){
                    if(list.get(i).equals("*")){
                        double x = Double.valueOf(list.get(i-1));
                        double y = Double.valueOf(list.get(i+1));

                        double t = x*y;
                        String addon = ""+t;
                        list.set(i-1, addon);
                        list.remove(i);
                        list.remove(i);
                        i--;

                    }
                    else if(list.get(i).equals("/")){
                        double x = Double.valueOf(list.get(i-1));
                        double y = Double.valueOf(list.get(i+1));

                        double t = x/y;
                        String addon = ""+t;
                        list.set(i-1, addon);
                        list.remove(i);
                        list.remove(i);
                        i--;
                    }
                    else if(list.get(i).equals("+")){
                        double x = Double.valueOf(list.get(i-1));
                        double y = Double.valueOf(list.get(i+1));

                        double t = x+y;
                        String addon = ""+t;
                        list.set(i-1, addon);
                        list.remove(i);
                        list.remove(i);
                        i--;
                    }
                    else if(list.get(i).equals("-")) {
                        double x = Double.valueOf(list.get(i - 1));
                        double y = Double.valueOf(list.get(i + 1));

                        double t = x - y;
                        String addon = "" + t;
                        list.set(i - 1, addon);
                        list.remove(i);
                        list.remove(i);
                        i--;
                    }
                    i++;
                }*/
                }catch(Exception e){
                    answer1 = "Error";
                }

                for(String a: list){
                    if(a.equals("Infinity") || a.equals("NaN")){
                        answer1 = "Error";
                    }
                    else if(!answer1.equals("Error")){
                        answer1 += a;
                    }

                }

                answer.setText(answer1);
            }



        });

    }

    public void onClick(View view){

    }
}
