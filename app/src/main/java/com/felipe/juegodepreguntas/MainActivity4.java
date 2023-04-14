package com.felipe.juegodepreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
RadioGroup grupo4;
RadioButton op1_4;
RadioButton op2_4;
RadioButton op3_4;
RadioButton op4_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        referenciar();
    }

    private void referenciar() {
        grupo4=findViewById(R.id.grupopregunta4);
        op1_4=findViewById(R.id.res14);
        op2_4=findViewById(R.id.res24);
        op3_4=findViewById(R.id.res34);
        op4_4=findViewById(R.id.res44);
        grupo4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.res14:
                        Toast.makeText(MainActivity4.this, "¡Correcto!", Toast.LENGTH_SHORT).show();
                        Intent fin = new Intent(MainActivity4.this,MainActivity5.class);
                        startActivity(fin);
                        break;
                    case R.id.res24:
                        Toast.makeText(MainActivity4.this, "¡InCorrecto!", Toast.LENGTH_SHORT).show();
                         break;
                    case R.id.res34:
                        Toast.makeText(MainActivity4.this, "¡InCorrecto!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.res44:
                        Toast.makeText(MainActivity4.this, "¡InCorrecto!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}