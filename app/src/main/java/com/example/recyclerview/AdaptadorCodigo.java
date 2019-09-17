package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdaptadorCodigo extends RecyclerView.Adapter<ItemHolder> {
    Context context;
    List<Item> datos;
    LayoutInflater inflater;

    public AdaptadorCodigo(Context context, List<Item> datos) {
        this.context = context;
        this.datos = datos;
        inflater=LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recycler,parent,false);

        return new ItemHolder(v,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        holder.txt_itemrecycle.setText(datos.get(position).texto);
        Glide.with(context).load(datos.get(position).getUrl()).into(holder.img_itemrecycle);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
