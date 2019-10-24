package com.example.widgetspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView textView;
    Switch aSwitch;
    EditText editText;
    TextView textView2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView);
        aSwitch = findViewById(R.id.switch1);
        editText = findViewById(R.id.editText2);
        textView2 = findViewById(R.id.textView3);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView2.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    aSwitch.setText("ON");
                else
                    aSwitch.setText("OFF");
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int currentProgress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentProgress = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setText("Progress: "+currentProgress+"%");
            }
        });
    }
}
