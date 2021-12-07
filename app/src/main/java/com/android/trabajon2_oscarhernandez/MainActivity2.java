package com.android.trabajon2_oscarhernandez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private SensorManager Mgr;
    private TextView tvSENSORLIST;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvSENSORLIST=(TextView) findViewById(R.id.tvSENSORLISTAM);
        Mgr=(SensorManager) getSystemService(Context.SENSOR_SERVICE);

        List<Sensor> sensorList=Mgr.getSensorList(Sensor.TYPE_ALL);
        StringBuilder stringBuilder=new StringBuilder();
        for (Sensor s: sensorList){
            stringBuilder.append(s.getName()+"\n");

        }
        tvSENSORLIST.setText(stringBuilder);


        Button botonVolver = (Button) findViewById(R.id.buttonVolver2);
        Intent INTENT = new Intent(this, MainActivity.class);

        Intent INTENT1 = getIntent();
        if (INTENT1 != null) {
            botonVolver.setOnClickListener(view -> startActivity(INTENT)); }
    }
}