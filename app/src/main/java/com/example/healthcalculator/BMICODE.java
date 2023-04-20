package com.example.healthcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMICODE extends AppCompatActivity implements View.OnClickListener {
    EditText weight,height,gender;
    TextView result;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicode);

        weight = (EditText) findViewById(R.id.agefat);
        height = (EditText) findViewById(R.id.genderfat);
        gender = (EditText) findViewById(R.id.heightfat);
        result = (TextView) findViewById(R.id.resultbmi);
        calculate = (Button) findViewById(R.id.calculatefat);
        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.calculatefat:
                float height1 = Float.parseFloat(height.getText().toString());
                float weight1 = Float.parseFloat(weight.getText().toString());
                String gender1 = String.valueOf(gender.getText().toString());

                float bmi = calculateBMI(height1, weight1);

                if(bmi < 16.0)
                {
                    result.setText(""+"The BMI is: "+bmi +"\nVery Severely Underweight");
                }
                else if(bmi >= 16.0 || bmi <= 16.9)
                {
                    result.setText(""+"The BMI is: "+bmi +"\nSeverely Underweight");
                }
                else if(bmi >= 17.0 || bmi <= 18.4)
                {
                    result.setText(""+"The BMI is: "+bmi +"\nUnderweight");
                }
                else if(bmi >= 18.5 || bmi <= 24.9)
                {
                    result.setText(""+"The BMI is: "+bmi +"\nNormal");
                }
                else if(bmi >= 25.0|| bmi <= 29.9)
                {
                    result.setText(""+"The BMI is: "+bmi +"\nOverweight");
                }
                else if(bmi >= 30.0 || bmi <= 34.9)
                {
                    result.setText(""+"The BMI is: "+bmi +"\nObese Class 1");
                }
                else if(bmi >= 35.0 || bmi <= 39.9)
                {
                    result.setText(""+"The BMI is: "+bmi +"\nObese Class 2");
                }
                else
                {
                    result.setText(""+"The BMI is: "+bmi +"\nObese Class 3");
                }
                break;
        }

    }
    private float calculateBMI(float height, float weight)
    {
        return weight / (height * height);
    }
}
