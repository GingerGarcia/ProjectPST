package com.pst.projectpst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    EditText etUser, etContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        etUser = (EditText)findViewById(R.id.editTextTextPersonName);
        etContra=(EditText)findViewById(R.id.editTextTextPassword2);
    }
    public void login(View view) {
        Intent i = new Intent(this, Activity4.class );
        startActivity(i);
    }
    public void singup(View view) {
        Intent i = new Intent(this, Activity3.class );
        startActivity(i);
    }
}