package com.e.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etHeight, etWeight, etBmi;
    Button btnBMI;
    BMI bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        etBmi = findViewById(R.id.etBmi);
        btnBMI = findViewById(R.id.btnBmi);
        btnBMI.setOnClickListener(this);
        bmi = new BMI();
    }

    @Override
    public void onClick(View v) {
        Toast toast;
        switch (v.getId()){
            case R.id.btnBmi:
                float value;
                bmi.setHeight(Float.parseFloat(etHeight.getText().toString()));
                bmi.setWeight(Float.parseFloat(etWeight.getText().toString()));
                value=bmi.bmiCalculate();
                //Log.d(MainActivity.class.getName(), ""+ value);
                etBmi.setText(Float.toString(value));
                if (value < 18){
                    toast = Toast.makeText(this, "under weight", Toast.LENGTH_LONG);
                    toast.show();
                }else if (value > 18 && value < 24.9){
                   toast= Toast.makeText(this, "normal weight", Toast.LENGTH_LONG);
                   toast.show();
                }else if(value > 25 && value < 29.9){
                    toast = Toast.makeText(this, "overweight", Toast.LENGTH_LONG);
                    toast.show();
                }
                else{
                    toast = Toast.makeText(this, "obesity", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
                default:
                    break;
        }
    }

}
