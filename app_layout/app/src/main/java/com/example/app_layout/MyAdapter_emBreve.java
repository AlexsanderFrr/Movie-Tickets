package com.example.app_layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter_emBreve extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Filme> filmesListEmBreve;

    private final SelectListener listener;

    public MyAdapter_emBreve(Context context, List<Filme> filmesListEmBreve, SelectListener listener) {
        this.context = context;
        this.filmesListEmBreve = filmesListEmBreve;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.movie_view_em_breve, parent, false ), listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.text_name_movie.setText(filmesListEmBreve.get(position).getName());
        holder.image_movie.setImageResource(filmesListEmBreve.get(position).getImage());
        holder.text_data.setText(filmesListEmBreve.get(position).getData());

    }

    @Override
    public int getItemCount() {
        return filmesListEmBreve.size();
    }
}
