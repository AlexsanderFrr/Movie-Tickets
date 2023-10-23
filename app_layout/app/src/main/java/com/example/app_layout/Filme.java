package com.example.app_layout;

public class Filme {

    String name;
    String nPublico;
    String nTomato;
    int image;
    int image_pipoca;
    int image_tomate;

    String data;

    public Filme(String name, String nPublico, String nTomato, int image,  int image_pipoca,  int image_tomate, String data) {
        this.name = name;
        this.nPublico = nPublico;
        this.nTomato = nTomato;
        this.image = image;
        this.image_pipoca = image_pipoca;
        this.image_tomate = image_tomate;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnPublico() {
        return nPublico;
    }

    public void setnPublico(String nPublico) {
        this.nPublico = nPublico;
    }

    public String getnTomato() {
        return nTomato;
    }

    public void setnTomato(String nTomato) {
        this.nTomato = nTomato;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage_pipoca() {
        return image_pipoca;
    }

    public void setImage_pipoca(int image_pipoca) {
        this.image_pipoca = image_pipoca;
    }

    public int getImage_tomate() {
        return image_tomate;
    }

    public void setImage_tomate(int image_tomate) {
        this.image_tomate = image_tomate;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
