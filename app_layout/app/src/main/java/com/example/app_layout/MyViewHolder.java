package com.example.app_layout;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView image_movie, image_tomate, image_pipoca;
    TextView text_name_movie, text_note_public, text_note_tomato, text_data;




    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        image_movie = itemView.findViewById(R.id.image_movie);
        image_pipoca = itemView.findViewById(R.id.imageView_pipoca);
        image_tomate = itemView.findViewById(R.id.imageView_tomate);
        text_name_movie = itemView.findViewById(R.id.text_name_movie);
        text_note_public = itemView.findViewById(R.id.text_note_public);
        text_note_tomato = itemView.findViewById(R.id.text_note_tomato);
        text_data = itemView.findViewById(R.id.txt_data);


    }
}
