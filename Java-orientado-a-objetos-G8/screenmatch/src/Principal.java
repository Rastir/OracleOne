public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        Pelicula otraPelicula = new Pelicula();

        miPelicula.nombre = "Matrix";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionMinutos = 180;
        miPelicula.evalua(10);
        miPelicula.evalua(9.8);


        otraPelicula.nombre = "Alamo";
        otraPelicula.fechaDeLanzamiento = 1999;
        otraPelicula.duracionMinutos = 12;

        miPelicula.muestraFichaTecnica();
        System.out.println(miPelicula.totalEvaluaciones);
        System.out.println(miPelicula.sumaEvaluaciones);
        System.out.println(miPelicula.calculaMedia());
        otraPelicula.muestraFichaTecnica();
    }
}
