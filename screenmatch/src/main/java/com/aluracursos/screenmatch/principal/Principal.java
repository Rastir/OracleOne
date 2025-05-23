package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.model.DatosEpisodio;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporadas;
import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=89a3589f";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu(){

        System.out.println("Por favor escribe el nombre de la serie que deseas buscar!");
        var nombreSerie = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ","+")+ API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);

        List<DatosTemporadas> temporadas = new ArrayList<>();

        for (int i = 1; i <=datos.totalDeTemporadas() ; i++) {
            json = consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" ","+")+ "&Season="+i+ API_KEY);
            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
            temporadas.add(datosTemporadas);
        }
        //temporadas.forEach(System.out::println);

        // mostras solo el titulo de los episodios para las temporadas

        /*for (int i = 0; i < datos.totalDeTemporadas(); i++) {
            List<DatosEpisodio> episodiosTemporadas = temporadas.get(i).episodios();
            for (int j = 0; j < episodiosTemporadas.size(); j++) {
                System.out.println(episodiosTemporadas.get(j).titulo());
            }
        }*/
        //temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        // convertir todas las listas a una lista del tipo DatosEpisodio

        List<DatosEpisodio> datosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        // top 5 episodios
//        System.out.println("Los mejores 5 episodios de la serie son : ");
//        datosEpisodios.stream()
//                .filter(e -> !e.evaluacion().equals("N/A"))
//                .peek(e -> System.out.println("Primer filtro (N/A)" + e))
//                .sorted(Comparator.comparing(DatosEpisodio::evaluacion).reversed())
//                .peek(e -> System.out.println("Segundo ordenacion (M>m)" + e))
//                .map(e -> e.titulo().toUpperCase())
//                .peek(e -> System.out.println("tercer filtro mayusculas (m<M)" + e))
//                .limit(5)
//                .forEach(System.out::println);

        // convirtiendo los datos a una lista del tipo episodio
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                    .map(d -> new Episodio(t.numero(),d)))
                .collect(Collectors.toList());
        //episodios.forEach(System.out::println);

        // buesqueda de episodios a partir de x años //
//        System.out.println("por favor indica el año a partir de cual deseas ver los episodios");
//        var fecha = teclado.nextInt();
//        teclado.nextLine();
//        LocalDate fechaBusqueda = LocalDate.of(fecha, 1, 1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy");

//        episodios.stream()
//                .filter(e -> e.getFechaDeLanzamiento() != null && e.getFechaDeLanzamiento().isAfter(fechaBusqueda))
//                .forEach(e -> System.out.println(
//                        "Temporada " + e.getTemporada() +
//                                "Episodio " + e.getTitulo() +
//                                "Fecha de lanzamiento " + e.getFechaDeLanzamiento().format(dtf)
//                ));
        // BUsca episodios por pedazo del titulo
//        System.out.println("Ingrese el fragmento del episodio que desea ver");
//        var pedazoTitulo = teclado.nextLine();
//        Optional<Episodio> episodioBuscado = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(pedazoTitulo.toUpperCase()))
//                .findFirst();
//
//        if(episodioBuscado.isPresent()){
//            System.out.println("Episodio encontrado ");
//            System.out.println("Los datos son : " + episodioBuscado.get());
//        }else {
//            System.out.println("episodio no encontrado");
//        }
        Map<Integer, Double> evaluacionesPorTemporada = episodios.stream()
                .filter(e-> e.getEvaluacion() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getEvaluacion)));
        System.out.println(evaluacionesPorTemporada);

        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getEvaluacion() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getEvaluacion));
        System.out.println("Media de evaluaciones : " + est.getAverage());
        System.out.println("Capitulos sumados  : " + est.getCount());
        System.out.println("Peor calificación  : " + est.getMin());
        System.out.println("Mayor calificacion  : " + est.getMax());


    }
}
