package com.android.trabajon2_oscarhernandez;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.trabajon2_oscarhernandez.Clases.test;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    private List<test> Listtest = new ArrayList<test>();
    ArrayAdapter<test> arrayAdaptertest;

    EditText etValor, etDolar;
    Button button;
    Button button2;
    ListView lvListado;
    Button button4;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor = findViewById(R.id.etValor);
        etDolar = findViewById(R.id.etDolar);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button4 = findViewById(R.id.button4);
        lvListado = findViewById(R.id.lvListado);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test test = new test();
                test.setTextView2("Dolar");
                //test.setTextView2(UUID.randomUUID().toString());
                test.setTextView1(etValor.getText().toString());
                test.setTextView2(etDolar.getText().toString());
                databaseReference.child("test").child(test.getTextView1()).setValue(test);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("test").child("").setValue(null);
            }
        });
        Intent INTENT=new Intent(this,MainActivity2.class);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(INTENT);
            }
        });

    }

    {
    inicializarFirebase();
    ListarDatos();
}


    private void ListarDatos() {
        databaseReference.child("test").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Listtest.clear();
                for(DataSnapshot objS :snapshot.getChildren()){
                    test tt=objS.getValue(test.class);
                    if (tt.getTextView2().equals("")) {
                        Listtest.add(tt);
                        arrayAdaptertest = new ArrayAdapter<test>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, Listtest);
                        lvListado.setAdapter(arrayAdaptertest);
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();
    }

    public void setLocation(Location loc) {
    }
}