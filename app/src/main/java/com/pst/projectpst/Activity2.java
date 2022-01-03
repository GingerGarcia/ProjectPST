package com.pst.projectpst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    private EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        et1 = findViewById(R.id.etuserlogin);
        et2 = findViewById(R.id.etpasswordlogin);
    }
}