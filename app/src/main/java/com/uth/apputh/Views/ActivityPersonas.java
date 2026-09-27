package com.uth.apputh.Views;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.uth.apputh.R;

public class ActivityPersonas extends AppCompatActivity {

    EditText nombresTxt, ApellidoText, FechaNacimientoTxt, DireccionTxt, TelefonoTxt, CorreTxt;
    Button buttonAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_personas);
        InitControl();

    }

    private void InitControl(){

        nombresTxt = (EditText) findViewById(R.id.nombresTxt);
        ApellidoText = (EditText) findViewById(R.id.ApellidoText);
        FechaNacimientoTxt =(EditText) findViewById(R.id.FechaNacimientoTxt);
        DireccionTxt = (EditText) findViewById(R.id.DireccionTxt);
        TelefonoTxt =(EditText) findViewById(R.id.TelefonoTxt);
        CorreTxt =(EditText) findViewById(R.id.CorreTxt);
        buttonAgregar = (Button) findViewById(R.id.buttonAgregar);
    }
}