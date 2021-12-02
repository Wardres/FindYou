package com.example.findyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.findyou.db.DataBaseUser;
import com.example.findyou.helpers.Validator;

public class registro extends AppCompatActivity {

    private EditText email, pass_1, pass_2;
    private Button registerBtn;
    private DataBaseUser dataBaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        this.dataBaseUser = new DataBaseUser(this);

        this.email = findViewById(R.id.correo_registro);
        this.pass_1 = findViewById(R.id.pass_registro);
        this.pass_2 = findViewById(R.id.confirmpass_registro);
        this.registerBtn = findViewById(R.id.crear_registro);

        this.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Validator validator = new Validator();

                String emailStr = email.getText().toString();
                String pass_1Str = pass_1.getText().toString();
                String pass_2Str = pass_2.getText().toString();

                if(validator.confirmInputsRegister(emailStr,pass_1Str, pass_2Str)){
                    if(validator.confirmInputsRegisterPass(pass_1Str, pass_2Str)){

                        //TODO: Implementar registro
                        if (dataBaseUser.insertUser(emailStr,pass_1Str)){
                            Toast.makeText(getApplicationContext(), "Usuario registrado correctamente", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(getApplicationContext(), "No se ha podido registrar", Toast.LENGTH_SHORT).show();
                        }

                    }else{

                        Toast.makeText(getApplicationContext(), "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();

                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}