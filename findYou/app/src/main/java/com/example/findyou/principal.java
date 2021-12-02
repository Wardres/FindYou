package com.example.findyou;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.findyou.clases.Mensajes;
import com.example.findyou.db.DataBaseUser;
import com.example.findyou.helpers.Validator;
import com.example.findyou.modelos.Usuario;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class principal extends AppCompatActivity {

    private DataBaseUser dataBaseUser;
    private EditText txtEmail,txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        dataBaseUser = new DataBaseUser(this);
        Button goToRegister = findViewById(R.id.crear_principal);
        Button btnLogin = findViewById(R.id.login_btnacceder);
        txtEmail = findViewById(R.id.login_txtCorreo);
        txtPass = findViewById(R.id.login_txtcontraseña);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailStr = txtEmail.getText().toString();
                String passStr = txtPass.getText().toString();
                Mensajes msjs = new Mensajes(getApplicationContext());
                Validator validator = new Validator();

                if(validator.confirmInputsLogin(emailStr,passStr)){




                if(dataBaseUser.isUserRegister(emailStr)){
                    if(dataBaseUser.isPassOk(emailStr,passStr)){
                        Toast.makeText(getApplicationContext(), "bienvenido", Toast.LENGTH_SHORT).show();

                        Intent goToHome = new Intent(getApplicationContext(),menu.class);
                        startActivity(goToHome);
                        finish();
                    }else {
                        msjs.alert("Error","La contraseña es incorrecta");
                    }
                }else{
                    msjs.alert("Error", "Usuario no encontrado");

                }}else{
                    Toast.makeText(getApplicationContext(), "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
                }




            }
        });

        goToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToReg = new Intent(getApplicationContext(),registro.class);
                startActivity(goToReg);
                finish();
            }
        });




    }
}






