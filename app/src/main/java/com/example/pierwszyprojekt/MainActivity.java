package com.example.pierwszyprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wyswietl(View view) {
        Toast.makeText(MainActivity.this,"kliknieto",Toast.LENGTH_LONG).show();
    }
}