package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch aSwitch;
    EditText editText;
    TextView textView;
    Button button;
    SeekBar seekBar;
    boolean canSlide = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.switch2);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        seekBar = findViewById(R.id.seekBar);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    canSlide = true;
                else
                    canSlide = false;
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.equals("red"))
                    textView.setTextColor(Color.RED);
                else if(s.equals("blue"))
                    textView.setTextColor(Color.BLUE);
                else if(s.equals("green"))
                    textView.setTextColor(Color.GREEN);
                else
                    textView.setTextColor(Color.BLACK);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
