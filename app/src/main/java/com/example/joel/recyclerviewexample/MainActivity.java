package com.example.joel.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.recyclerView = findViewById(R.id.recyclerView);

        // Configurando o adapter


        // Configurando RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext()); // Layout Manager
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); // Tamanho fixo
        //recyclerView.setAdapter();

    }
}
