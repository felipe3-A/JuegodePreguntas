package com.felipe.juegodepreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

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

        //Activar evento

        grupo1pregunta1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    //El toates un tipo de alert para movil en este caso avisa si la casilla marcada es coorecta o no
                    case R.id.res1:
                        Toast.makeText(MainActivity.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                    case R.id.res2:
                        Toast.makeText(MainActivity.this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                        //Si seleciona esta respuesta lo dirige la siguiente Vista
                        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);

                    case R.id.res3:
                        Toast.makeText(MainActivity.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                    case R.id.res4:
                        Toast.makeText(MainActivity.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}