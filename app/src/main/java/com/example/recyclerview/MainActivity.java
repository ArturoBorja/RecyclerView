package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    List<Item> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.reciclador);
        datos=new ArrayList<>();
        datos.add(new Item("elemento 1","https://i1.wp.com/www.astrobitacora.com/wp-content/uploads/2015/07/Stars-fixed.jpg?resize=1280%2C640&ssl=1"));
        datos.add(new Item("elemento 1","https://menorcaaldia.com/wp-content/uploads/2016/09/Cielo-Estrellado-Playa.jpg"));
        datos.add(new Item("elemento 1","https://yanomiramoselcielo.files.wordpress.com/2015/04/via-lactea.jpg?w=584&h=326"));
        datos.add(new Item("elemento 1","https://cflvdg.avoz.es/default/2018/07/22/00121532211591019706793/Foto/perseidas.jpg"));

        AdaptadorCodigo adaptador = new AdaptadorCodigo(this,datos);
        recycler.setAdapter(adaptador);
        recycler.setLayoutManager(new LinearLayoutManager(this));

    }
}
