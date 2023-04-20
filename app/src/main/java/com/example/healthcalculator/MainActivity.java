package com.example.healthcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BMI = (Button)findViewById(R.id.bmi);
        BMI.setOnClickListener(this);
        Button BFP = (Button)findViewById(R.id.bfp);
        BFP.setOnClickListener(this);
        Button WHR = (Button)findViewById(R.id.whr);
        WHR.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.bmi:
            {
                Intent j = new Intent(getApplicationContext(),BMICODE.class);
            }
            break;

            case R.id.bfp:
            {
                Intent i = new Intent(getApplicationContext(),bodyfate.class);
                startActivity(i);
            }
            break;
            case R.id.whr:
            {
                Intent i = new Intent(getApplicationContext(), waisttohip.class);
                startActivity(i);
            }
            break;
        }


    }
}