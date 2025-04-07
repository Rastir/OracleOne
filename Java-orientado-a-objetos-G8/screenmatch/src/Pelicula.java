public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionMinutos;
    boolean incluidoEnElPlan;
    double sumaEvaluaciones ;
    int totalEvaluaciones;
    void muestraFichaTecnica(){
        System.out.println("Información de la pelicula : " +
                "\n Nombre : " + nombre +
                "\n Fecha de lanzamiento : " + fechaDeLanzamiento +
                "\n Duración : " + duracionMinutos +
                "\n Incluida en el plan : " + incluidoEnElPlan);
    }

    void evalua(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }
    double calculaMedia(){
        return sumaEvaluaciones / totalEvaluaciones;
    }
}
