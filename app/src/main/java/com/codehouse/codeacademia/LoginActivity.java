package com.codehouse.codeacademia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.DiffUtil;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginActivity extends AppCompatActivity {

    EditText editUser,editPassword;
    Button btnIniciarSesion;
    ArrayList<String> usuarios= new ArrayList<String>(Arrays.asList("jjcrow","lbasante","espol"));
    ArrayList<String> claves= new ArrayList<String>(Arrays.asList("passw0rd","12345678","espol123"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUser= findViewById(R.id.edit_user);
        editPassword= findViewById(R.id.edit_password);
        btnIniciarSesion= findViewById(R.id.btn_iniciar_sesion);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user= editUser.getText().toString();
                String password= editPassword.getText().toString();
                if(TextUtils.isEmpty(user)){
                   Toast.makeText(LoginActivity.this, "Campo usuario no puede estar vacío!", Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(password)){
                   Toast.makeText(LoginActivity.this, "Campo contraseña no puede estar vacío!", Toast.LENGTH_SHORT).show();
                }
                else if(!usuarios.contains(user) || !claves.contains(password)){
                    Toast.makeText(LoginActivity.this, "Usuario o contraseña inválido", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }
}
