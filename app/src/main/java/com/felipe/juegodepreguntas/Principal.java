package com.felipe.juegodepreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }
    public void Siguiente(View view){
        Intent Siguiente= new Intent(this,MainActivity.class);
        startActivity(Siguiente);
    }
    //Metodos implicitos

    public void whatsapp(View view){
        Intent intent= new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://web.whatsapp.com/"));
        startActivity(intent);
    }
    public  void facebook(View view){
     Intent intent =new Intent(Intent.ACTION_VIEW,
        Uri.parse("https://www.facebook.com/peggi.ledezma?mibextid=ZbWKwL"));
     startActivity(intent);
    }
    public void Maps(View view){
        Intent intent =new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/@-33.569697,-70.62996,17z?hl=es-ES"));
        startActivity(intent);
    }
    public void Correo (View view){
        Intent intent=new Intent(Intent.ACTION_SEND);
             intent.setType("text/plain");
             intent.putExtra(Intent.EXTRA_SUBJECT,"asunto");
             intent.putExtra(Intent.EXTRA_TEXT,"Texto del correo");
             startActivity(intent);
    }

    public void llamar(View view){
        Intent intent=new Intent(Intent.ACTION_CALL,
                Uri.parse("tel:962849347"));
        startActivity(intent);
    }
    public void foto(View view){
        Intent intent =new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
}