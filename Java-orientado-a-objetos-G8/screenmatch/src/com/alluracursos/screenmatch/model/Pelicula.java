package com.alluracursos.screenmatch.model;

public class Pelicula {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnElPlan;
    private double sumaEvaluaciones ;
    private int totalEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }
    public void muestraFichaTecnica(){
        System.out.println("Información de la pelicula : " +
                "\n Nombre : " + nombre +
                "\n Fecha de lanzamiento : " + fechaDeLanzamiento +
                "\n Duración : " + duracionMinutos +
                "\n Incluida en el plan : " + incluidoEnElPlan);
    }

    public void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }
    public double calculaMedia(){
        return sumaEvaluaciones / totalEvaluaciones;
    }


}
