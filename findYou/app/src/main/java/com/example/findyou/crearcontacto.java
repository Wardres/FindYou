package com.example.findyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.findyou.clases.Mensajes;

public class crearcontacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearcontacto);

        Button btnguardar = (Button) findViewById(R.id.btn_crearpersona);
        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Mensajes(v.getContext()).confirm("Confirmación", "Va a crear la Persona??", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        new Mensajes(v.getContext()).alert("Correcto", "A creado la Persona");
                    }
                }, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        new Mensajes(v.getContext()).alert("Cancelado", "No se ha creado la persona");

                    }
                });
            }
        });
    }
}