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
        RecyclerView recyclerView_em_Breve = findViewById(R.id.recyclerView_em_breve);

        List<Filme> filmes = new ArrayList<Filme>();
        List<Filme> filmes_em_breve = new ArrayList<Filme>();

        filmes.add(new Filme("Besouro azul", "10","10",R.drawable.besouro_azul,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));
        filmes.add(new Filme("Barbie", "10","10",R.drawable.barbie,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));
        filmes.add(new Filme("A Freira", "10","10",R.drawable.freira,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));
        filmes.add(new Filme("Mario", "10","10",R.drawable.mario,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));
        filmes.add(new Filme("One Piece", "10","10",R.drawable.one_piece,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));

        filmes_em_breve.add(new Filme("Estranha forma de vida", "10","10",R.drawable.estranha_forma_de_vida,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));
        filmes_em_breve.add(new Filme("Trolls 3", "10","10",R.drawable.trolls3,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));
        filmes_em_breve.add(new Filme("Mussum, O filmis", "10","10",R.drawable.mussum_filme,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));
        filmes_em_breve.add(new Filme("Taylo Swift: The era tour", "10","10",R.drawable.taylor_swift,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));
        filmes_em_breve.add(new Filme("Titanic", "10","10",R.drawable.titanic,R.drawable.pipoca,R.drawable.tomate, "10/10/23"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(recyclerView.HORIZONTAL);

        LinearLayoutManager linearLayoutManager_em_breve = new LinearLayoutManager(this);
        linearLayoutManager_em_breve.setOrientation(recyclerView_em_Breve.HORIZONTAL);


        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView_em_Breve.setLayoutManager(linearLayoutManager_em_breve);


        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),filmes));
        recyclerView_em_Breve.setAdapter(new MyAdapter_emBreve(getApplicationContext(),filmes_em_breve));

        //-------------------------------------------------Tela Splash------------------------------------------//

    }
}