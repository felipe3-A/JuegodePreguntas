package com.felipe.juegodepreguntas;

import static com.felipe.juegodepreguntas.MainActivity.puntos1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    TextView resultado;
    TextView pre1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
referenciar();
    }

    private void referenciar() {
        resultado=findViewById(R.id.resultadofinal);
        pre1=findViewById(R.id.resultadoprimera);
        //Todos juntos
        MainActivity.puntos=MainActivity.puntos;
        resultado.setText("Resultado Total = "+MainActivity.puntos);
        //Primera pregunta
        pre1.setText("Resultado 1° pregunta = "+puntos1);

    }



}