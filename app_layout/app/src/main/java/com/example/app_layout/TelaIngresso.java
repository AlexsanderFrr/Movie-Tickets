package com.example.app_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TelaIngresso extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ingresso);

        ImageView imageView = findViewById(R.id.imgIngressoFilme);
        Button bt_assentos = findViewById(R.id.bt_assentos);
        Button bt_comprar = findViewById(R.id.bt_comprar);

        Bundle extras = getIntent().getExtras();
        int img = extras.getInt("IMG", 0);
        String t_name = extras.getString("NAME");
        String t_data = extras.getString("DATE");

        imageView.setImageResource(img);


        bt_assentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaIngresso.this, TelaAssentos.class);
                startActivity(intent);
            }
        });

        bt_comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TelaIngresso.this, "COMPRADO", Toast.LENGTH_SHORT).show();
            }
        });


    }
}