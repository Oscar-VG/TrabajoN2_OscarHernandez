package com.android.trabajon2_oscarhernandez;

import android.content.Intent;
import android.widget.Button;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);

    Button botonVolver = (Button) findViewById(R.id.buttonVolver);
    Intent INTENT = new Intent(this, MainActivity.class);

    Intent INTENT1 = getIntent();
        if (INTENT1 != null) {
        botonVolver.setOnClickListener(view -> startActivity(INTENT)); }
    }
}