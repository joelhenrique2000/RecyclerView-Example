package com.example.joel.recyclerviewexample.adapter;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.joel.recyclerviewexample.R;
import com.example.joel.recyclerviewexample.model.FilmeIMDB;

import java.util.List;
import java.util.function.Consumer;

public class AdapterImdb extends RecyclerView.Adapter<AdapterImdb.MyViewHolder> {

    private List<FilmeIMDB> listaFilmesIMDB;

    public AdapterImdb(List<FilmeIMDB> filmes) {
        this.listaFilmesIMDB = filmes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewImdb = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_imdb, parent, false);

        return new MyViewHolder(viewImdb);
    }

    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        FilmeIMDB filme = listaFilmesIMDB.get(position);

        holder.titulo.setText(filme.getTitulo());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());
        holder.pontuacao.setText(filme.getPontuacao());

    }

    @Override
    public int getItemCount() {
        return listaFilmesIMDB.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView pontuacao;
        TextView ano;
        TextView genero;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.titulo = itemView.findViewById(R.id.textTitulo);
            this.pontuacao = itemView.findViewById(R.id.textPontuacao);
            this.ano = itemView.findViewById(R.id.textAno);
            this.genero = itemView.findViewById(R.id.textGenero);
        }
    }
}
