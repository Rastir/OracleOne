package com.aluracursos.screenmatch.calculos;

import com.alluracursos.screenmatch.model.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;
    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionMinutos();
    }


    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
}
