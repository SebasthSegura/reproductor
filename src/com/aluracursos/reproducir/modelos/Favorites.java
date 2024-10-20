package com.aluracursos.reproducir.modelos;

public class Favorites {
    public void include(Audio audio){
        if (audio.getClasification() >= 8) {
            System.out.println(String.format("""
                    %s es uno de los favoritos del momento
                    """, audio.getName()));
        }else {
            System.out.printf("%s es muy recomendado para escuchar ahora", audio.getName());
        }
    }
}
