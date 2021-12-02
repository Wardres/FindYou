package com.example.findyou;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.findyou.clases.Mensajes;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_FindYoubarra);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#BE9C5539")));
        getSupportActionBar().setTitle("Menú");
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater propiedadesMenu = getMenuInflater();
        propiedadesMenu.inflate(R.menu.mnu_principal, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Mensajes msjs = new Mensajes(this);
        switch (item.getItemId()){
            case R.id.mni_principal_acerca: Intent e = new Intent(this,Acercade.class);
                startActivity(e);
                break;
            case R.id.mni_principal_perfil: Intent i = new Intent(this, Perfil.class);
                startActivity(i);
                break;
            case R.id.mni_principal_quees: msjs.alert("Qué es Find you?","Es una aplicación diseñada para que encuentres y guardes a tus seres queridos");
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}