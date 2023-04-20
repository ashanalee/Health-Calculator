package com.example.healthcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bodyfate extends AppCompatActivity implements View.OnClickListener {
    EditText age,height,gender,waist,neck;
    Button calculatefat;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyfate);

        age = (EditText) findViewById(R.id.agefat);
        height = (EditText) findViewById(R.id.heightfat);
        gender = (EditText) findViewById(R.id.genderfat);
        waist = (EditText) findViewById(R.id.waist);
        neck = (EditText) findViewById(R.id.neckfat);
        result = (TextView) findViewById(R.id.resultfat);
        calculatefat = (Button) findViewById(R.id.calculatefat);
        calculatefat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.calculatefat:
                float height1 = Float.parseFloat(height.getText().toString());
                float waist1 = Float.parseFloat(waist.getText().toString());
                float neck1 = Float.parseFloat(neck.getText().toString());
                int age1 = Integer.parseInt(age.getText().toString());
                String gender1 = String.valueOf(gender.getText().toString());

                double bodyfat = (1.20* 18.5) + (0.23 * age1) - 5.4;


                if(bodyfat >= 2 || bodyfat <= 5)
                {
                    result.setText(""+"The BFP is: "+bodyfat +" %" +"\nEssential Fat");
                }
                else if(bodyfat >= 6 || bodyfat <= 13)
                {
                    result.setText(""+"The BFP is: "+bodyfat +" %" +"\nAtheletes");
                }
                else if(bodyfat >= 14 || bodyfat <= 17)
                {
                    result.setText(""+"The BFP is: "+bodyfat +" %" +"\nFitness");
                }
                else if(bodyfat >= 18 || bodyfat <= 24)
                {
                    result.setText(""+"The BFP is: "+bodyfat +" %" +"\nAverage");
                }
                else
                {
                    result.setText(""+"The BFP is: "+bodyfat +" %" +"\nObese");
                }

                break;
        }

    }

    }
