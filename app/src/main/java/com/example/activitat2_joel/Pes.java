package com.example.activitat2_joel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Pes extends AppCompatActivity {
    private TextInputEditText input_p;
    private TextView resultatp;
    private Button resultat_p;
    private RadioButton from_kg;
    private RadioButton from_lb;
    private RadioButton from_oz;
    private RadioButton from_st;
    private RadioButton to_kg;
    private RadioButton to_lb;
    private RadioButton to_oz;
    private RadioButton to_st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pes);

        resultatp = findViewById(R.id.resultatp);
        input_p = findViewById(R.id.input_p);

        from_kg = findViewById(R.id.from_kg);
        from_lb = findViewById(R.id.from_lb);
        from_oz = findViewById(R.id.from_oz);
        from_st = findViewById(R.id.from_st);


        to_kg = findViewById(R.id.to_kg);
        to_lb = findViewById(R.id.to_lb);
        to_oz = findViewById(R.id.to_oz);
        to_st = findViewById(R.id.to_st);

        resultat_p = findViewById(R.id.resultat_p);
        resultat_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double inputPes = Double.parseDouble(input_p.getText().toString());

                // Comprovar si es marquen les mateixes opcions
                if (from_kg.isChecked() && to_kg.isChecked()) {
                    resultatp.setText(String.valueOf(inputPes));
                } else {
                    // Altres opcions de conversió de pes
                    if (from_kg.isChecked() && to_lb.isChecked()) {
                        double lb = inputPes * 2.20462;
                        resultatp.setText(String.valueOf(lb));
                    } else if (from_kg.isChecked() && to_oz.isChecked()) {
                        double oz = inputPes * 35.274;
                        resultatp.setText(String.valueOf(oz));
                    } else if (from_kg.isChecked() && to_st.isChecked()) {
                        double st = inputPes * 0.15747;
                        resultatp.setText(String.valueOf(st));
                    } else if (from_lb.isChecked() && to_kg.isChecked()) {
                        double kg = inputPes * 0.45359;
                        resultatp.setText(String.valueOf(kg));
                    } else if (from_lb.isChecked() && to_oz.isChecked()) {
                        double oz = inputPes * 16;
                        resultatp.setText(String.valueOf(oz));
                    } else if (from_lb.isChecked() && to_st.isChecked()) {
                        double st = inputPes * 0.07143;
                        resultatp.setText(String.valueOf(st));
                    } else if (from_oz.isChecked() && to_kg.isChecked()) {
                        double kg = inputPes * 0.02835;
                        resultatp.setText(String.valueOf(kg));
                    } else if (from_oz.isChecked() && to_lb.isChecked()) {
                        double lb = inputPes * 0.06250;
                        resultatp.setText(String.valueOf(lb));
                    } else if (from_oz.isChecked() && to_st.isChecked()) {
                        double st = inputPes * 0.00446;
                        resultatp.setText(String.valueOf(st));
                    } else if (from_st.isChecked() && to_kg.isChecked()) {
                        double kg = inputPes * 6.35029;
                        resultatp.setText(String.valueOf(kg));
                    } else if (from_st.isChecked() && to_lb.isChecked()) {
                        double lb = inputPes * 14;
                        resultatp.setText(String.valueOf(lb));
                    } else if (from_st.isChecked() && to_oz.isChecked()) {
                        double oz = inputPes * 224;
                        resultatp.setText(String.valueOf(oz));
                    } else {
                        resultatp.setText(String.valueOf(inputPes));
                    }
                }
            }
        });

    }
}