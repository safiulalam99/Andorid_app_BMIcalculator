package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.controls.templates.TemperatureControlTemplate;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void result(View view) {
        EditText heightE = findViewById(R.id.height);
        EditText weightE = findViewById(R.id.weight);
        TextView result  = findViewById(R.id.result);

        String heightString  =  heightE.getText().toString() ;
        String weightString  =  weightE.getText().toString() ;

        double height = Double.parseDouble(heightString);
        double weight = Double.parseDouble(weightString);

        double BMI = weight/(height/100 * height/100);
        double bm= Math.round(BMI);
        TextView bmitext = findViewById(R.id.result);
        bmitext.setText((""+bm));
   }
}