package com.aluracursos.reproducir.modelos;

public class Songs extends Audio{
    private String album;
    private String singer;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClasification() {
        if (getLiked() > 5000) {
            return 8;
        }else {
            return 4;
        }
    }
}
