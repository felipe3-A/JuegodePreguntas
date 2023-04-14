package com.felipe.juegodepreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
   //Referenciar vista2
    RadioGroup grupo2;
    RadioButton op1;
    RadioButton op2;
    RadioButton op3;
    RadioButton op4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Metodo
        referenciar();
    }

    private void referenciar() {
        grupo2=findViewById(R.id.grupopregunta2);
        op1=findViewById(R.id.res12);
        op2=findViewById(R.id.res22);
        op3=findViewById(R.id.res32);
        op4=findViewById(R.id.res42);

        //Activar Evento

        grupo2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int k) {
                switch (k){
                    case R.id.res12:
                        Toast.makeText(MainActivity2.this, "Correcto x2", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                        startActivity(intent);
                        break;
                    case R.id.res22:
                        Toast.makeText(MainActivity2.this, "InCorrecto", Toast.LENGTH_SHORT).show();
break;
                    case R.id.res32:
                        Toast.makeText(MainActivity2.this, "InCorrecto", Toast.LENGTH_SHORT).show();
break;
                    case R.id.res42:
                        Toast.makeText(MainActivity2.this, "InCorrecto", Toast.LENGTH_SHORT).show();

                        break;
                }
            }
        });
    }
}