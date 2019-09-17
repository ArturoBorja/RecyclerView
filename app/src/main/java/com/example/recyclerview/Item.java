package com.example.recyclerview;

public class Item {
    String texto;
    String url;

    public Item(String texto, String url) {
        this.texto = texto;
        this.url = url;
    }

    public String getTexto() {
        return texto;
    }

    public String getUrl() {
        return url;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
