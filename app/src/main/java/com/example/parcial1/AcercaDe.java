package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        Button salir = (Button)findViewById(R.id.btnsalir);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent j = new Intent(AcercaDe. this, Menu.class);
                startActivity(j);
            }
        });
    }
}