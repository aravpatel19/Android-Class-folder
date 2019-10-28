package com.example.widgetsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText enter;
    EditText reenter;
    Button button;
    Switch aSwitch;
    String password = "";
    String password2 = "";
    boolean canSwitch = false;
    TextView textView;
    ArrayList<String> previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = findViewById(R.id.editText);
        reenter = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        aSwitch = findViewById(R.id.switch1);
        textView = findViewById(R.id.textView3);
        previous = new ArrayList<>();

        enter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                password = s.toString();
                check();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        reenter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                password2 = s.toString();
                check();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                canSwitch = true;
                for(String a : previous) {
                    if (password.equals(a)) {
                        canSwitch = false;
                        textView.setText("password already used");
                        break;
                    }
                }
                if(canSwitch) {
                    check();
                    if(canSwitch) {
                        previous.add(password);
                        textView.setText("password not used previously");
                    }
                    else
                        textView.setText("");
                }

                aSwitch.setChecked(canSwitch);
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (canSwitch)
                    aSwitch.setText("Match");
                else
                    aSwitch.setText("Does Not Match");
            }
        });

    }
    public void check(){
        if(password2.equals(password))
            canSwitch = true;
        else
            canSwitch = false;
    }
}
