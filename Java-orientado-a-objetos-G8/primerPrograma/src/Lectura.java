import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita : ");

        String pelicula = sc.nextLine();
        System.out.println("Escribe la fecha de lanzamiento : ");
        int fechaDeLanzamiento = sc.nextInt();
        System.out.println("Ingresa la calificación de la pelicula del 0 al 10:");
        double calificacion = sc.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(calificacion);
    }
}
