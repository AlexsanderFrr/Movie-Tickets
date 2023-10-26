package com.example.app_layout;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TelaAssentos extends AppCompatActivity {
    private View view;



    public void trocarBackground(View view) {
        this.view = view;
        Drawable backgroundAtual = view.getBackground();
        Drawable assentoBranco = getResources().getDrawable(R.drawable.assentobranco);
        Drawable assentoVerde = getResources().getDrawable(R.drawable.assentoverde);
        Drawable assentoEspecial = getResources().getDrawable(R.drawable.assentoespecial);
        Drawable assentoEspecialVerde = getResources().getDrawable(R.drawable.assentoespecialverde);

        if (backgroundAtual.getConstantState().equals(assentoBranco.getConstantState())) {
            // Se o background atual é igual a "assentobranco", troque para "assentoverde"
            view.setBackground(assentoVerde);
        } else if (backgroundAtual.getConstantState().equals(assentoVerde.getConstantState())) {
            // Se o background atual é igual a "assentoverde", troque de volta para "assentobranco"
            view.setBackground(assentoBranco);
        } else if (backgroundAtual.getConstantState().equals(assentoEspecial.getConstantState())) {
            // Se o background atual é igual a "assentoespecial", troque para "assentoespecialverde"
            view.setBackground(assentoEspecialVerde);
        } else if (backgroundAtual.getConstantState().equals(assentoEspecialVerde.getConstantState())) {
            // Se o background atual é igual a "assentoespecialverde", troque de volta para "assentoespecial"
            view.setBackground(assentoEspecial);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_assentos);

        Button bt_conf = findViewById(R.id.bt_confirmar);

        bt_conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onBackPressed();
            }
        });
    }
}