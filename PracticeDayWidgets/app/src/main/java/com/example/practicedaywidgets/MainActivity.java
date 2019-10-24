package com.example.practicedaywidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    Switch aSwitch1;
    Switch aSwitch2;
    Switch aSwitch3;
    TextView color;
    EditText email;
    Button verify;
    boolean canVerify = false;
    TextView isVerified;
    EditText database;
    Button check;
    boolean isChecked = false;
    TextView inDatabase;
    TextView textSize;
    SeekBar seekBar;
    String email1 = "Ratchet@google.com";
    String email2 = "Aakash@google.com";
    String email3 = "Arav@google.com";
    String email4 = "Ryan@google.com";

    boolean one;
    boolean two;
    boolean three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch1 = findViewById(R.id.switch1);
        aSwitch2 = findViewById(R.id.switch2);
        aSwitch3 = findViewById(R.id.switch3);
        color = findViewById(R.id.textView);
        email = findViewById(R.id.editText);
        verify = findViewById(R.id.button);
        isVerified = findViewById(R.id.textView2);
        database = findViewById(R.id.editText3);
        check = findViewById(R.id.button2);
        inDatabase = findViewById(R.id.textView3);
        textSize = findViewById(R.id.textView4);
        seekBar = findViewById(R.id.seekBar);

        aSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    one = true;
                else
                    one = false;

                changeColor();

            }
        });
        aSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    two = true;
                else
                    two = false;

                changeColor();

            }
        });
        aSwitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    three = true;
                else
                    three = false;

                changeColor();

            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().contains("@")&& s.toString().contains(".com")){
                    if(s.toString().indexOf("@") < s.toString().indexOf(".com")){
                        canVerify = true;
                    }
                    else {
                        canVerify = false;
                    }
                }
                else
                    canVerify = false;

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(canVerify)
                    isVerified.setText("Verified");
                else
                    isVerified.setText("Not Verified");
            }
        });

        database.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if( s.toString().equals(email1) ||
                    s.toString().equals(email2) ||
                    s.toString().equals(email3) ||
                    s.toString().equals(email4)){

                    isChecked = true;
                }
                else
                    isChecked = false;
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isChecked)
                    inDatabase.setText("In Database");
                else
                    inDatabase.setText("Not in Database");
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textSize.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void changeColor(){
        if(one && two && three)
            color.setTextColor(Color.BLUE);
        else if(one && !two && three)
            color.setTextColor(Color.RED);
        else if(!one && !two && three)
            color.setTextColor(Color.GREEN);
        else
            color.setTextColor(Color.BLACK);
    }
}
