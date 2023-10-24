package com.example.app_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class TelaAssentos extends AppCompatActivity {
    public void trocarBackground(View view) {
        Drawable backgroundAtual = view.getBackground();
        Drawable assentoBranco = getResources().getDrawable(R.drawable.assentobranco);
        Drawable assentoVerde = getResources().getDrawable(R.drawable.assentoverde);

        if (backgroundAtual.getConstantState().equals(assentoBranco.getConstantState())) {
            // Se o background atual é igual a "assentobranco", troque para "assentoverde"
            view.setBackground(assentoVerde);
        } else {
            // Caso contrário, troque para "assentobranco"
            view.setBackground(assentoBranco);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_assentos);
    }
}