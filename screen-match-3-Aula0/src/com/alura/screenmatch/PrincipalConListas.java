package com.alura.screenmatch;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("avatar",2023);
        otraPelicula.evalua(6);
        Serie lost = new Serie("lost",2000);
        var peliculaDeBruno = new Pelicula("el señor de los anillos",2001);
        peliculaDeBruno.evalua(10);

        Pelicula p1 = peliculaDeBruno;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);


        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope cruz");
        listaDeArtistas.add("Antonio banderas");
        listaDeArtistas.add("Aldo Sanchez");
        listaDeArtistas.add("Maria chan");

        System.out.println("Lista de artistas ordenada :" + listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada :" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados : " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println(lista);
    }
}
