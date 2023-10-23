package com.example.app_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(new Filme("Besouro azul", "10","10",R.drawable.besouro_azul,R.drawable.pipoca,R.drawable.tomate));
        filmes.add(new Filme("Barbie", "10","10",R.drawable.barbie,R.drawable.pipoca,R.drawable.tomate));
        filmes.add(new Filme("A Freira", "10","10",R.drawable.freira,R.drawable.pipoca,R.drawable.tomate));
        filmes.add(new Filme("Mario", "10","10",R.drawable.mario,R.drawable.pipoca,R.drawable.tomate));
        filmes.add(new Filme("One Piece", "10","10",R.drawable.one_piece,R.drawable.pipoca,R.drawable.tomate));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(recyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),filmes));
    }
}