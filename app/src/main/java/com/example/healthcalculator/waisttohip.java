package com.example.healthcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class waisttohip extends AppCompatActivity implements View.OnClickListener {
    EditText age,height,waist;
    TextView result;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waisttohip);

        age = (EditText) findViewById(R.id.agefat);
        height = (EditText) findViewById(R.id.genderfat);
        waist = (EditText) findViewById(R.id.heightfat);
        result = (TextView)findViewById(R.id.resultbmi);
        calculate = (Button) findViewById(R.id.calculatefat);
        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.calculatefat:
                float height1 = Float.parseFloat(height.getText().toString());
                float waist1 = Float.parseFloat(waist.getText().toString());
                int age1 = Integer.parseInt(age.getText().toString());

                float whr = calculatewhr(height1, waist1);

                if(whr <= 0.34)
                {
                    result.setText(""+"The WHR is: "+whr +"\nExtremely Slim");
                }
                else if(whr <= 0.35 || whr <=0.42)
                {
                    result.setText(""+"The WHR is: "+whr +"\nSlim");
                }
                else if(whr <= 0.43 || whr <=0.52)
                {
                    result.setText(""+"The WHR is: "+whr +"\nHealthy");
                }
                else if(whr <= 0.53 || whr <=0.57)
                {
                    result.setText(""+"The WHR is: "+whr +"\nOverweight");
                }
                else if(whr <= 0.58 || whr <=0.62)
                {
                    result.setText(""+"The WHR is: "+whr +"\nVery Overweight");
                }
                else if(whr >=0.63)
                {
                    result.setText(""+"The WHR is: "+whr +"\nObese");
                }
                else
                {
                    result.setText(""+"\nNothing.");
                }


                break;
        }

    }
    private float calculatewhr(float height, float waist)
    {
        return waist/height;
    }
}

