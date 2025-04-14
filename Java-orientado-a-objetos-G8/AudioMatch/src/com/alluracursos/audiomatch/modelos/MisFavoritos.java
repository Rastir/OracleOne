package com.alluracursos.audiomatch.modelos;

public class MisFavoritos {

    public void adiciona(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + "Es un no de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + "Tambien es uno de los favoritos ");
        }
    }
}
