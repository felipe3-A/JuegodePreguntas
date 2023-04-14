package com.felipe.juegodepreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    RadioGroup grupo5;
    RadioButton res1_p5;
    RadioButton res2_p5;
    RadioButton res3_p5;
    RadioButton res4_p5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        referenciar();
    }

    private void referenciar() {
        grupo5=findViewById(R.id.grupopregunta5);
        res1_p5=findViewById(R.id.res15);
        res2_p5=findViewById(R.id.res25);
        res3_p5=findViewById(R.id.res35);
        res4_p5=findViewById(R.id.res45);

        grupo5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.res15:
                        Toast.makeText(MainActivity5.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                    break;
                        case R.id.res25:
                        Toast.makeText(MainActivity5.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                    break;
                        case  R.id.res35:
                        Toast.makeText(MainActivity5.this, "Correcto", Toast.LENGTH_SHORT).show();
                        Intent fin = new Intent(MainActivity5.this,MainActivity6.class);
                        startActivity(fin);
                        break;
                        case R.id.res45:
                        Toast.makeText(MainActivity5.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                break;
                }
            }
        });
    }
}