package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecibirDatos extends AppCompatActivity {

    Integer estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_datos);

        TextView Nombre = (TextView)findViewById(R.id.tvNombreReci);
        TextView Edad = (TextView)findViewById(R.id.tvEdadReci);
        TextView Estado = (TextView)findViewById(R.id.tvEstado);
        Button bVolver = (Button)findViewById(R.id.btVolver);

        Bundle datosRecibidos = this.getIntent().getExtras();
        String nombre = datosRecibidos.getString("pNombre");
        String edad = datosRecibidos.getString("pEdad");

        Nombre.setText("Tu nombre es: "+nombre);
        Edad.setText("Tu edad es: "+edad);
        estado = Integer.parseInt(edad);

        if(estado < 18){
            Estado.setText("Eres menor de edad");
        }
        else{
            Estado.setText("Eres mayor de edad");
        }
        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new Intent(RecibirDatos.this,EnviarDatos.class);
                startActivity(vuelva);
            }
        });

    }
}