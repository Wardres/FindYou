package com.example.findyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        try{
            Bundle parametros = getIntent().getExtras();
            TextView txtnombre = findViewById(R.id.nombre_perfil);
            TextView txtcorreo = findViewById(R.id.correo_perfil);


        }
        catch (Exception ex){

        }


        ImageButton btnvolver_perfil = (ImageButton) findViewById(R.id.btnvolver_perfil);
        btnvolver_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        Button cerrarsesion = (Button) findViewById(R.id.cerrar_perfil);
        cerrarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hasta pronto", Toast.LENGTH_SHORT).show();
                Intent iralogin = new Intent(getApplicationContext(),principal.class);
                startActivity(iralogin);
                finish();
            }
        });



    }
}