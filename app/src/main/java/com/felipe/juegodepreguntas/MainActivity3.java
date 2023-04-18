package com.felipe.juegodepreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
RadioGroup grupo3;
RadioButton pre1_3;
RadioButton pre2_3;
RadioButton pre3_3;
RadioButton pre4_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        referenciar();
    }

    private void referenciar() {
        grupo3=findViewById(R.id.grupopregunta3);
        pre1_3=findViewById(R.id.res13);
        pre2_3=findViewById(R.id.res23);
        pre3_3=findViewById(R.id.res33);
        pre4_3=findViewById(R.id.res43);

        grupo3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.res13:
                        Toast.makeText(MainActivity3.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.res23:
                        Toast.makeText(MainActivity3.this, "¡Incorrecto!", Toast.LENGTH_SHORT).show();
                          break;
                    case R.id.res33:
                        Toast.makeText(MainActivity3.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.res43:
                        Toast.makeText(MainActivity3.this, "Correcto", Toast.LENGTH_SHORT).show();
                        MainActivity.puntos=MainActivity.puntos+3;

                        //Si seleciona esta respuesta lo dirige la siguiente Vista
                        Intent intento = new Intent(MainActivity3.this,MainActivity4.class);
                        startActivity(intento);
                        break;
                }
            }
        });
    }
}