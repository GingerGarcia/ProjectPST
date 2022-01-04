package com.pst.projectpst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    EditText etnombre, etEmail, etUsuario, etContra;
    Intent emailIntent = new Intent(Intent.ACTION_SEND);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        etnombre=(EditText)findViewById(R.id.editTextTextPersonName2);
        etEmail=(EditText)findViewById(R.id.editTextTextEmailAddress2);
        etUsuario=(EditText)findViewById(R.id.editTextTextPersonName3);
        etContra=(EditText)findViewById(R.id.editTextTextPassword);
    }
    public void signup (View v){
        Toast.makeText(this, "Se cargaron los datos correctamente",
                Toast.LENGTH_SHORT).show();
        etnombre.setText("");
        etEmail.setText("");
        etUsuario.setText("");
        etContra.setText("");
    }
}
