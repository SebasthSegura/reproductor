package com.aluracursos.reproducir.principal;

import com.aluracursos.reproducir.modelos.Favorites;
import com.aluracursos.reproducir.modelos.Podcast;
import com.aluracursos.reproducir.modelos.Songs;

public class Main {
    public static void main(String[] args) {
        Songs newSong = new Songs();
        newSong.setName("Forever");
        newSong.setSinger("kiss");

        Podcast newPodcast = new Podcast();
        newPodcast.setInterviewer("gabriela");
        newPodcast.setName("Cafe.Tech");

        //creamos un iterador que permita aumentar el numero de reproducciones y like
        for (int i = 0; i < 150; i++) {
            newSong.like();
        }
        for (int i = 0; i < 5000; i++) {
            newSong.reproduction();
        }

        //ahora para los podcast
        for (int i = 0; i < 80; i++) {
            newPodcast.like();
        }
        for (int i = 0; i < 2000; i++) {
            newPodcast.reproduction();
        }

        System.out.println(String.format("""
                la cancion %s tiene
                un total de reproducciones de: %d
                """, newSong.getName(), newSong.getTotalReproductions()));
        System.out.println("*******************************************");
        System.out.println(String.format("""
                la cancion tambien tiene %d de me gustas 
                """, newSong.getLiked()));

        System.out.println("*******************************************");

        System.out.println(String.format("""
                El podcast de %s tiene
                un total de reproducciones de: %d
                """, newPodcast.getInterviewer(), newPodcast.getTotalReproductions()));
        System.out.println("*******************************************");
        System.out.println(String.format("""
                El podcast tambien tiene %d de me gustas 
                """, newPodcast.getLiked()));

        Favorites newFAvorite = new Favorites();
        newFAvorite.include(newPodcast);
        newFAvorite.include(newSong);
    }
}
