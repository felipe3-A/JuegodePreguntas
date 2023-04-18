package com.felipe.juegodepreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Referenciar id's

    MediaPlayer bien,mal;
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
    public static int puntos;
    public static int puntos1;

    private void refereciar() {
        bien=MediaPlayer.create(this,R.raw.bien);
        mal=MediaPlayer.create(this,R.raw.error);
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
                    case R.id.res1:
                        Toast.makeText(MainActivity.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                        mal.start();
                        break;

                    case R.id.res2:
                        Toast.makeText(MainActivity.this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                         bien.start();
                        puntos=puntos+3;
                        puntos1=3;

                    break;
                    case R.id.res3:
                        Toast.makeText(MainActivity.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                        mal.start();
                        break;
                    case R.id.res4:
                        Toast.makeText(MainActivity.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                        mal.start();
                        break;
                }

            }
        });
    }
}