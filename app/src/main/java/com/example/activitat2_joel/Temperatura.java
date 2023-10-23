package com.example.activitat2_joel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Temperatura extends AppCompatActivity {
    private TextInputEditText input_t;
    private TextView resultatt;
    private Button resultat_t;
    private RadioButton from_kelvin;
    private RadioButton from_celsius;
    private RadioButton from_fahrenheit;
    private RadioButton from_rankine;
    private RadioButton to_kelvin;
    private RadioButton to_celsius;
    private RadioButton to_fahrenheit;
    private RadioButton to_rankine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);



        resultatt = findViewById(R.id.resultatt);
        input_t = findViewById(R.id.input_t);

        from_kelvin = findViewById(R.id.from_kelvin);
        from_celsius = findViewById(R.id.from_celsius);
        from_fahrenheit = findViewById(R.id.from_fahrenheit);
        from_rankine = findViewById(R.id.from_rankine);


        to_kelvin = findViewById(R.id.to_kelvin);
        to_celsius = findViewById(R.id.to_celsius);
        to_fahrenheit = findViewById(R.id.to_fahrenheit);
        to_rankine = findViewById(R.id.to_rankine);

        resultat_t = findViewById(R.id.resultat_t);
        resultat_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultatt.setText("hola bon dia");
                double inputTemperature = Double.parseDouble(input_t.getText().toString());

                if (from_kelvin.isChecked() && to_kelvin.isChecked()) {
                    resultatt.setText(String.valueOf(inputTemperature));
                } else if (from_kelvin.isChecked() && to_celsius.isChecked()) {
                    double celsius = inputTemperature - 273.15;
                    resultatt.setText(String.valueOf(celsius));
                } else if (from_kelvin.isChecked() && to_fahrenheit.isChecked()) {
                    double fahrenheit = (inputTemperature - 273.15) * 9/5 + 32;
                    resultatt.setText(String.valueOf(fahrenheit));
                } else if (from_kelvin.isChecked() && to_rankine.isChecked()) {
                    double rankine = inputTemperature * 1.8;
                    resultatt.setText(String.valueOf(rankine));
                } else if (from_celsius.isChecked() && to_kelvin.isChecked()) {
                    double kelvin = inputTemperature + 273.15;
                    resultatt.setText(String.valueOf(kelvin));
                } else if (from_celsius.isChecked() && to_fahrenheit.isChecked()) {
                    double fahrenheit = (inputTemperature * 9/5) + 32;
                    resultatt.setText(String.valueOf(fahrenheit));
                } else if (from_celsius.isChecked() && to_rankine.isChecked()) {
                    double rankine = (inputTemperature + 273.15) * 1.8;
                    resultatt.setText(String.valueOf(rankine));
                } else if (from_fahrenheit.isChecked() && to_kelvin.isChecked()) {
                    double kelvin = (inputTemperature - 32) * 5/9 + 273.15;
                    resultatt.setText(String.valueOf(kelvin));
                } else if (from_fahrenheit.isChecked() && to_celsius.isChecked()) {
                    double celsius = (inputTemperature - 32) * 5/9;
                    resultatt.setText(String.valueOf(celsius));
                } else if (from_fahrenheit.isChecked() && to_rankine.isChecked()) {
                    double rankine = inputTemperature + 459.67;
                    resultatt.setText(String.valueOf(rankine));
                } else if (from_rankine.isChecked() && to_kelvin.isChecked()) {
                    double kelvin = inputTemperature * 5/9;
                    resultatt.setText(String.valueOf(kelvin));
                } else if (from_rankine.isChecked() && to_celsius.isChecked()) {
                    double celsius = (inputTemperature - 491.67) * 5/9;
                    resultatt.setText(String.valueOf(celsius));
                } else if (from_rankine.isChecked() && to_fahrenheit.isChecked()) {
                    double fahrenheit = inputTemperature - 459.67;
                    resultatt.setText(String.valueOf(fahrenheit));
                } else {
                    resultatt.setText(String.valueOf(inputTemperature));
                }

            }
        });
    }
}