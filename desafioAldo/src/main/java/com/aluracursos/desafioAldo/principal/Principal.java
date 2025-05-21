package com.aluracursos.desafioAldo.principal;

import com.aluracursos.desafioAldo.model.Datos;
import com.aluracursos.desafioAldo.model.DatosLibros;
import com.aluracursos.desafioAldo.service.ConsumoAPI;
import com.aluracursos.desafioAldo.service.ConvierteDatos;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    public void muestraElMenu(){
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);

        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

        // top 10 de libros mas descargados
        System.out.println("El top 10 de libros mas descargados : ");
        datos.resultados().stream()
                .sorted(Comparator.comparing(DatosLibros::numeroDeDescargas).reversed())
                .limit(10)
                .map(l -> l.titulo().toUpperCase())
                .forEach(System.out::println);

        // BUsqueda de libros por nombre

        System.out.println("INgrese el nombre del libro a buscar");
        var tituloLibro = teclado.nextLine();
        json = consumoAPI.obtenerDatos(URL_BASE + "?search=" + tituloLibro.replace(" ","+"));
        var datosBusqueda = conversor.obtenerDatos(json, Datos.class);
        Optional<DatosLibros> libroBuscado = datosBusqueda.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(tituloLibro.toUpperCase()))
                .findFirst();
        if (libroBuscado.isPresent()){
            System.out.println("libro encontrado ");
            System.out.println(libroBuscado.get());
        }else {
            System.out.println("libro no encontrado");
        }

        // trabajando con estadisticas
        DoubleSummaryStatistics est = datos.resultados().stream()
                .filter(d -> d.numeroDeDescargas() > 0)
                .collect(Collectors.summarizingDouble(DatosLibros::numeroDeDescargas));
        System.out.println("Cantidad media de descargas : " + est.getAverage());
        System.out.println("Cantidad maxima de descargas : " + est.getMax());
        System.out.println("Cantidad minima de descargas : " + est.getMin());
        System.out.println("Cantidad de registros evaluados para calcular las estadisticas : " + est.getCount());
    }
}
