import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("escribe la calificación para la pelicula Matrix");
            nota = sc.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }

        System.out.println("La media de evaluaciones de esta pelicula es de : " + mediaEvaluaciones / 3);
    }
}
