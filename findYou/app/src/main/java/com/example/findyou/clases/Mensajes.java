package com.example.findyou.clases;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

public class Mensajes {

    private Context contexto;
    private AlertDialog.Builder msj;

    public Mensajes(Context contexto) {
        this.contexto = contexto;
        this.msj = new AlertDialog.Builder(this.contexto);
    }

    public void alert(String titulo, String cuerpo) {
        msj.setTitle(titulo);
        msj.setMessage(cuerpo);
        msj.create();
        msj.show();

    }
    public void confirm(String titulo, String cuerpo, DialogInterface.OnClickListener eventoSi, DialogInterface.OnClickListener eventoNo ){
        msj.setTitle(titulo);
        msj.setMessage(cuerpo);
        msj.setNegativeButton("no",eventoNo);
        msj.setPositiveButton("si",eventoSi);
        msj.create();
        msj.show();
    }
}
