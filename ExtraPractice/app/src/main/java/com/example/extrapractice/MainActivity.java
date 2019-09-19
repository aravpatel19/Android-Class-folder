package com.example.extrapractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button swap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.id_button);
        swap = findViewById(R.id.id_SwapButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int r = (int)(Math.random()*3);
                switch(r){
                    case 0:
                        button.setTextColor(Color.RED);
                        break;

                    case 1:
                        button.setTextColor(Color.BLUE);
                        break;

                    case 2:
                        button.setTextColor(Color.GREEN);
                        break;
                }
            }
        });

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence b1 = button.getText();
                button.setText(swap.getText());
                swap.setText(b1);
            }
        });

        AppCompatButton btnNext = (AppCompatButton) findViewById(R.id.next_button);
        btnNext.setTooltipText("This will take you to next page");
    }
}
