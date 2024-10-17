package com.aluracursos.reproducir.modelos;

public class Audio {
    //creamos las variables con las que vamos a trabajar
    private String tittle;
    private int duration;
    private int totalReproductions;
    private int liked;
    private int clasification;

    //implementamos los getter y setter
    public String getName() {
        return tittle;
    }

    public void setName(String name) {
        this.tittle = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public int getClasification() {
        return clasification;
    }

    public void setClasification(int clasification) {
        this.clasification = clasification;
    }

    //agregamos el metodo megusta
    public void like(){
    this.liked ++;
    }

    //agregamos el metodo reproduction que permite ver las reproducciones
    public void reproduction(){
    this.totalReproductions++;
    }
}
