package com.example.joel.recyclerviewexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.joel.recyclerviewexample.R;
import com.example.joel.recyclerviewexample.adapter.AdapterImdb;
import com.example.joel.recyclerviewexample.model.FilmeIMDB;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<FilmeIMDB> filmesIMDB = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.recyclerView = findViewById(R.id.recyclerView);

        criandoFilmes();

        // Configurando o adapter
        AdapterImdb adapter = new AdapterImdb(filmesIMDB);

        // Configurando RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext()); // Layout Manager
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); // Tamanho fixo
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL)); // Linha de separação
        recyclerView.setAdapter(adapter);
    }

    public void criandoFilmes() {
        filmesIMDB.add(new FilmeIMDB("Um Sonho de Liberdade", "9,2", "1994", "Drama"));
        filmesIMDB.add(new FilmeIMDB("O Poderoso Chefão", "9,2", "1972", "Crime, Drama"));
        filmesIMDB.add(new FilmeIMDB("O Poderoso Chefão II", "9,0", "1974", "Crime, Drama"));
        filmesIMDB.add(new FilmeIMDB("Batman: O Cavaleiro das Trevas", "9,0", "2008", "Action, Crime, Drama"));
        filmesIMDB.add(new FilmeIMDB("12 Homens e uma Sentença", "8,9", "1957", "Crime, Drama"));
        filmesIMDB.add(new FilmeIMDB("A Lista de Schindler", "8,9", "1993", "Biography, Drama, History"));
        filmesIMDB.add(new FilmeIMDB("O Senhor dos Anéis: O Retorno do Rei", "8,9", "2003", "Adventure, Drama, Fantasy"));
        filmesIMDB.add(new FilmeIMDB("Pulp Fiction: Tempo de Violência", "8,9", "1994", "Crime, Drama"));
        filmesIMDB.add(new FilmeIMDB("Três Homens em Conflito", "8,8", "1966", "Western"));
        filmesIMDB.add(new FilmeIMDB("Clube da Luta", "8,8", "1999", "Drama"));
        filmesIMDB.add(new FilmeIMDB("O Senhor dos Anéis: A Sociedade do Anel", "8,8", "2001", "Adventure, Drama, Fantasy"));
        filmesIMDB.add(new FilmeIMDB("Forrest Gump: O Contador de Histórias", "8,7", "1994", "Drama, Romance"));
        filmesIMDB.add(new FilmeIMDB("O Império Contra-Ataca", "8,7", "1980", "Action, Adventure, Fantasy"));
        filmesIMDB.add(new FilmeIMDB("A Origem", "8,7", "2010", "Action, Adventure, Sci-Fi"));
        filmesIMDB.add(new FilmeIMDB("O Senhor dos Anéis: As Duas Torres" , "8,7", "2002", "Adventure, Drama, Fantasy"));
        filmesIMDB.add(new FilmeIMDB("Um Estranho no Ninho", "8,7", "1975", "Drama"));
        filmesIMDB.add(new FilmeIMDB("Os Bons Companheiros", "8,7", "1990", "Crime, Drama"));
        filmesIMDB.add(new FilmeIMDB("Matrix", "8,6", "1999", "Action, Sci-Fi"));
        filmesIMDB.add(new FilmeIMDB("Os Sete Samurais", "8,6", "1954", "Adventure, Drama"));
        filmesIMDB.add(new FilmeIMDB("Cidade de Deus", "8,6", "2002", "Crime, Drama"));
    }
}
