package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button EnvioDatos = (Button)findViewById(R.id.btn1);
        Button Tab = (Button)findViewById(R.id.btn2);
        Button SensorProximidad = (Button)findViewById(R.id.btn3);
        Button Acelerometro = (Button)findViewById(R.id.btn4);
        Button ReproductorMusica = (Button)findViewById(R.id.btn5);
        Button Acercade = (Button)findViewById(R.id.btn6);


        EnvioDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent j = new Intent(Menu. this, EnviarDatos.class);
                startActivity(j);
            }
        });

        Tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent j = new Intent(Menu. this, Tabs.class);
                startActivity(j);
            }
        });

        SensorProximidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent j = new Intent(Menu. this, SensorDeProximidad.class);
                startActivity(j);
            }
        });

        Acelerometro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent j = new Intent(Menu. this, Acelerometro.class);
                startActivity(j);
            }
        });

        ReproductorMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent j = new Intent(Menu. this, ReproductorDeMusica.class);
                startActivity(j);
            }
        });

        Acercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent j = new Intent(Menu. this, AcercaDe.class);
                startActivity(j);
            }
        });


    }
}