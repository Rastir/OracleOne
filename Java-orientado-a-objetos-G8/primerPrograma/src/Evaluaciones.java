import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluacion = 0;
        int intentos = 0;

        while (nota != -1 || intentos == 10){
            System.out.println("escribe la calificación para la pelicula Matrix");
            nota = sc.nextDouble();
            mediaEvaluacion += nota;
            intentos = intentos++;
        }
        System.out.println("La media de calificación para la pelicula es de : " + (mediaEvaluacion / intentos));
    }
}
