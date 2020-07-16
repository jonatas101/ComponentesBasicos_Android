package com.jvapp.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextView txtResultado;
    private TextInputEditText campoEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.txtInput_email);
        txtResultado = findViewById(R.id.textResultado);
    }

    public void enviar(View view){

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        txtResultado.setText("Nome: "+nome+ " email: " + email);

        campoNome.setText("");
        campoEmail.setText("");

    }
}