package com.example.complementario2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ejemplo_linear_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_linear_layout);
    }

    public void finalizarActividad (View v)
    {
        finish();
    }
}