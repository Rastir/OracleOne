package com.alluracursos.audiomatch.principal;

import com.alluracursos.audiomatch.modelos.Cancion;
import com.alluracursos.audiomatch.modelos.MisFavoritos;
import com.alluracursos.audiomatch.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        Podcast miPodcast = new Podcast();

        miCancion.setTitulo("tussi melon");
        miCancion.setCantante("Kidviniflo");

        miPodcast.setPresentador("JD Sonder");
        miPodcast.setTitulo("Radio Bellako");


        //Canciones
        for (int i = 0; i < 15000; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 300000; i++) {
            miCancion.reproduce();
        }

        //Podcast
        for (int i = 0; i < 2; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 50; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Nombre de la canción :  " + miCancion.getTitulo());
        System.out.println("Total de reproducciones : " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta : " + miCancion.getTotalDeMegusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miCancion);
        favoritos.adiciona(miPodcast);
    }
}
