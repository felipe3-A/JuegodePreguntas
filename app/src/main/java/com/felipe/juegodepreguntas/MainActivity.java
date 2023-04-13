package com.felipe.juegodepreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    //Referenciar id's
    RadioGroup grupo1pregunta1;
    RadioButton pre1_res1;
    RadioButton pre1_res2;
    RadioButton pre1_res3;
    RadioButton pre1_res4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Crear metodo para referenciar
        refereciar();
        //Alt + Enter
    }

    private void refereciar() {
        grupo1pregunta1=findViewById(R.id.grupopregunta11);
        pre1_res1=findViewById(R.id.res1);
        pre1_res2=findViewById(R.id.res2);
        pre1_res3=findViewById(R.id.res3);
        pre1_res4=findViewById(R.id.res4);
    }
}