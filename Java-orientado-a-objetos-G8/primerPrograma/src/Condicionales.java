public class Condicionales {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "sencillo";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Pelicula retro que aún vale la pena ver");
        }

        if(incluidoEnElPlan && tipoDePlan.equalsIgnoreCase("plus")){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Deme más dinero!");
        }
    }
}
