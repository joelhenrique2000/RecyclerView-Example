package com.example.joel.recyclerviewexample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.joel.recyclerviewexample.R;

public class AdapterImdb extends RecyclerView.Adapter<AdapterImdb.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewImdb = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_imdb, parent, false);

        return new MyViewHolder(viewImdb);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titulo.setText("Pato");
        holder.genero.setText("Patodrama");
        holder.ano.setText("2000");
        holder.pontuacao.setText("9,7");
    }

    @Override
    public int getItemCount() {
        return 10;
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
