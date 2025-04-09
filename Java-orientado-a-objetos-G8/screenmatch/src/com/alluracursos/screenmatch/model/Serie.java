package com.alluracursos.screenmatch.model;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorCapitulo;

    @Override
    public int getDuracionMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorCapitulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorCapitulo() {
        return minutosPorCapitulo;
    }

    public void setMinutosPorCapitulo(int minutosPorCapitulo) {
        this.minutosPorCapitulo = minutosPorCapitulo;
    }
}
