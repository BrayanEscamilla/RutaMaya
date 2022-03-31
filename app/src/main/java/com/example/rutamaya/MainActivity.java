package com.example.rutamaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registro = findViewById(R.id.lblRegistro);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToRegistro();
            }
        });
    }
    public void GoToRegistro (){
        Intent i = new Intent(MainActivity.this, RegistroActivity.class);
        startActivity(i);
    }
}