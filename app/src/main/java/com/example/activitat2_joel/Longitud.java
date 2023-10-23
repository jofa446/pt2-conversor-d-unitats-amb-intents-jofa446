package com.example.activitat2_joel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Longitud extends AppCompatActivity {
    private TextInputEditText input_l;
    private TextView resultatl;
    private Button resultat_l;
    private RadioButton f_km;
    private RadioButton f_mi;
    private RadioButton f_yd;
    private RadioButton f_polzada;
    private RadioButton to_km;
    private RadioButton to_mi;
    private RadioButton to_yd;
    private RadioButton to_polzada;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);

        resultatl = findViewById(R.id.resultatl);
        input_l = findViewById(R.id.input_l);

        f_km = findViewById(R.id.f_km);
        f_mi = findViewById(R.id.f_mi);
        f_yd= findViewById(R.id.f_yd);
        f_polzada = findViewById(R.id.f_polzada);

        to_km = findViewById(R.id.to_km);
        to_mi = findViewById(R.id.to_mi);
        to_yd = findViewById(R.id.to_yd);
        to_polzada = findViewById(R.id.to_polzada);

        resultat_l = findViewById(R.id.resultat_l);
        resultat_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double inputLongitud = Double.parseDouble(input_l.getText().toString());

                // Comprovar si es marquen les mateixes opcions
                if (f_km.isChecked() && to_km.isChecked()) {
                    resultatl.setText(String.valueOf(inputLongitud));
                } else if (f_km.isChecked() && to_mi.isChecked()) {
                    double milles = inputLongitud * 0.621371;
                    resultatl.setText(String.valueOf(milles));
                } else if (f_km.isChecked() && to_yd.isChecked()) {
                    double iards = inputLongitud * 1093.61;
                    resultatl.setText(String.valueOf(iards));
                } else if (f_km.isChecked() && to_polzada.isChecked()) {
                    double polzades = inputLongitud * 39370.1;
                    resultatl.setText(String.valueOf(polzades));
                } else if (f_mi.isChecked() && to_km.isChecked()) {
                    double quilòmetres = inputLongitud * 1.60934;
                    resultatl.setText(String.valueOf(quilòmetres));
                } else if (f_mi.isChecked() && to_mi.isChecked()) {
                    resultatl.setText(String.valueOf(inputLongitud));
                } else if (f_mi.isChecked() && to_yd.isChecked()) {
                    double iards = inputLongitud * 1760;
                    resultatl.setText(String.valueOf(iards));
                } else if (f_mi.isChecked() && to_polzada.isChecked()) {
                    double polzades = inputLongitud * 63360;
                    resultatl.setText(String.valueOf(polzades));
                } else if (f_yd.isChecked() && to_km.isChecked()) {
                    double quilòmetres = inputLongitud * 0.0009144;
                    resultatl.setText(String.valueOf(quilòmetres));
                } else if (f_yd.isChecked() && to_mi.isChecked()) {
                    double milles = inputLongitud * 0.000568182;
                    resultatl.setText(String.valueOf(milles));
                } else if (f_yd.isChecked() && to_yd.isChecked()) {
                    resultatl.setText(String.valueOf(inputLongitud));
                } else if (f_yd.isChecked() && to_polzada.isChecked()) {
                    double polzades = inputLongitud * 36;
                    resultatl.setText(String.valueOf(polzades));
                } else if (f_polzada.isChecked() && to_km.isChecked()) {
                    double quilòmetres = inputLongitud * 0.0000254;
                    resultatl.setText(String.valueOf(quilòmetres));
                } else if (f_polzada.isChecked() && to_mi.isChecked()) {
                    double milles = inputLongitud * 0.0000157828;
                    resultatl.setText(String.valueOf(milles));
                } else if (f_polzada.isChecked() && to_yd.isChecked()) {
                    double iards = inputLongitud * 0.0277778;
                    resultatl.setText(String.valueOf(iards));
                } else if (f_polzada.isChecked() && to_polzada.isChecked()) {
                    resultatl.setText(String.valueOf(inputLongitud));
                } else {
                    resultatl.setText("Conversió no suportada");
                }
            }
        });
    }
}