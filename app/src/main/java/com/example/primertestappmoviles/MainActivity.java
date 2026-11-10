package com.example.primertestappmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonIngresar = findViewById(R.id.botonIngresar);
        botonIngresar.setOnClickListener(view -> {
            Intent pantallaLogin = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(pantallaLogin);
        });
    }
}
