package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SensorDeProximidad extends AppCompatActivity {

    SensorManager sensorManager;

    Sensor sensor;

    SensorEventListener sensorEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_de_proximidad);

            //boton de regreso
        Button regresar = (Button)findViewById(R.id.btnregresar);
            //ejectar el boton
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent anterior = new Intent(SensorDeProximidad. this, Menu.class);
                startActivity(anterior);
            }
        });
        final TextView texto = (TextView)findViewById(R.id.tvsensorpro);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        if(sensor==null)finish();
        sensorEventListener = new SensorEventListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0] < sensor.getMaximumRange()){
                    getWindow().getDecorView().setBackgroundColor(Color.CYAN);
                    texto.setText("CAMBIADO A COLOR CELESTE");
                }else{
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                    texto.setText("SENSOR DE PROXIMIDAD");
                }

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        start();

    }

    public void start() {
        sensorManager.registerListener(sensorEventListener,sensor,200*1000);
    }
    public void stop(){
        sensorManager.unregisterListener(sensorEventListener);
    }

    @Override

    protected void onPause() {
        super.onPause();
        stop();
        super.onPause();

    }
    @Override
    protected void onResume() {
        start();
        super.onResume();

    }

    }
