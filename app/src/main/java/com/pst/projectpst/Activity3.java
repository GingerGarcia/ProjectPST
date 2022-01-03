package com.pst.projectpst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {
    private EditText etnombre,etpassword,etcorreo,etusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        etnombre = findViewById(R.id.etnombreregistro);
        etpassword = findViewById(R.id.etpasswordregistro);
        etcorreo = findViewById(R.id.etemailregistro);
        etusername = findViewById(R.id.etusernameregistro);
    }
}