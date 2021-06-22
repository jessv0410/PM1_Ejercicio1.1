package com.aplicacion.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView texto = (TextView)findViewById(R.id.resultado);
        Intent pantalla = getIntent();
        String n2 = pantalla.getStringExtra("n2");
        String n1 = pantalla.getStringExtra("n1");
        String signo = pantalla.getStringExtra("signo");
        String result = pantalla.getStringExtra("Respuesta");
        texto.setText(n1 + " " + signo + " " + n2 + " = " + result);
    }
}
