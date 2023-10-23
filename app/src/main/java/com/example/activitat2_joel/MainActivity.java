package com.example.activitat2_joel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button massa;
    private Button temperatura;
    private Button longitud;
    private boolean isLayout1Visible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        massa = findViewById(R.id.massa);
        massa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spes();

            }
        });
        temperatura = findViewById(R.id.temperatura);
        temperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stemperatura();
            }
        });


        longitud = findViewById(R.id.longitud);
        longitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slongitud();

            }
        });
    }

    private void slongitud() {
        Intent temperatura = new Intent(this, Longitud.class);
        startActivity(temperatura);
    }

    private void spes() {
        Intent temperatura = new Intent(this, Pes.class);
        startActivity(temperatura);
    }

    private void stemperatura() {
        Intent temperatura = new Intent(this, Temperatura.class);
        startActivity(temperatura);
    }
}