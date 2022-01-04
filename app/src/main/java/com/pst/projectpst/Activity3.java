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
        etnombre=(EditText)findViewById(R.id.editTextName);
        etEmail=(EditText)findViewById(R.id.editTextTextEmailAddress2);
        etUsuario=(EditText)findViewById(R.id.editTextTextPersonName3);
        etContra=(EditText)findViewById(R.id.editTextTextPassword);
    }
    public void signup (View v){
        String[] to={"gngarcia@espol.edu.ec"};
        String[] cc={"ginger.n-1999@hotmail.com"};
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        emailIntent.putExtra(Intent.EXTRA_CC, cc);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Prueba de app");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Datos de Contacto\n" +
                "Nombres:" + etnombre.getText().toString()+ "\n" +
                "E-mail:" + etEmail.getText().toString() +"\n" +
                "User Name:" + etUsuario.getText().toString() + "\n" +
                "Contrasena:" + etContra.getText().toString()+ "\n");
        try {
            startActivity(Intent.createChooser(emailIntent, "Registrando"));
            Log.i("Usuario registrado", "");
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Activity3.this, "No existe cliente Email instalado.", Toast.LENGTH_SHORT).show();
        }
    }
}
