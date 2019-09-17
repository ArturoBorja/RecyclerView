package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ItemHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView txt_itemrecycle;
    public ImageView img_itemrecycle;
    AdaptadorCodigo adaptador;

    public ItemHolder(@NonNull View itemView, final AdaptadorCodigo adaptador) {
        super(itemView);
        this.adaptador = adaptador;
        cardView=itemView.findViewById(R.id.card_view);
        img_itemrecycle=itemView.findViewById(R.id.img_itemrecycle);
        txt_itemrecycle=itemView.findViewById(R.id.txt_itemrecycle);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(adaptador.context,txt_itemrecycle.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
