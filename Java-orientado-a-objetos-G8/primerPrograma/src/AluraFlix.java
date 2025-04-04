public class AluraFlix {
    public static void main(String[] args) {

        String nombre = "Matrix";
        int fechaDeLanzamiento = 1998;
        boolean incluidoEnPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sipnosis = """
                
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en : 
                """ + fechaDeLanzamiento;
        System.out.println(sipnosis);

        int clasificacion = (((int) media) / 2);
        System.out.println(clasificacion);
    }
}
