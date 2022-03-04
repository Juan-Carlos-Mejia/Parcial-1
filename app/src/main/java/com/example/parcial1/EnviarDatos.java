package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnviarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        final EditText eNombre = (EditText)findViewById(R.id.etNombres);
        final EditText eEdad = (EditText)findViewById(R.id.etEdad);
        Button bEnviar = (Button)findViewById(R.id.btEnviarDatos2);
        Button bRegresar = (Button)findViewById(R.id.btRegresar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre",nombre);
                pasarDatos.putString("pEdad",edad);

                Intent siga = new Intent(EnviarDatos.this, RecibirDatos.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);
            }
        });

        bRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(EnviarDatos.this, Menu.class);
                startActivity(regresar);
            }
        });


    }
}