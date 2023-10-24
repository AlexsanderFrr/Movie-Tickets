package com.example.app_layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Filme> filmesList;

    private final SelectListener listener;

    public MyAdapter(Context context, List<Filme> filmesList, SelectListener listener) {
        this.context = context;
        this.filmesList = filmesList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.movie_view, parent, false),listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {




        holder.text_name_movie.setText(filmesList.get(position).getName());
        holder.text_note_public.setText(filmesList.get(position).getnPublico());
        holder.text_note_tomato.setText(filmesList.get(position).getnTomato());
        holder.image_movie.setImageResource(filmesList.get(position).getImage());
        holder.image_pipoca.setImageResource(filmesList.get(position).getImage_pipoca());
        holder.image_tomate.setImageResource(filmesList.get(position).getImage_tomate());



    }

    @Override
    public int getItemCount() {
        return filmesList.size();
    }
}
