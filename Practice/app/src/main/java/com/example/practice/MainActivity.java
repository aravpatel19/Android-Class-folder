package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.id_Color);
        button2 = findViewById(R.id.id_NotColor);
    }

    public void onClickColor(View view){
        int rand = (int)(Math.random()*3);
        int color;
        if(rand == 0){
            color = Color.RED;
        }
        else if(rand == 1){
            color = Color.BLUE;
        }
        else{
            color = Color.GREEN;
        }
        button.setTextColor(color);
    }
    public void onClickGo(View view){
        if(button2.getText().equals("Not Color"))
            button2.setText("Swap Text");
        else
            button2.setText("Not Color");
    }
}
