import java.util.Random;
import java.util.Scanner;

public class Juego1 {
    public static void main(String[] args) {

        int numeroSecreto = new Random().nextInt(100);
        int numeroIngresado = 0;
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int intentosMaximos = 5;

        System.out.println("Bienvenido al juego del adivinador, en este juego debes de adivinar el numero secreto de" +
                "entre 0 y 100, por favor ingresa un numero.");

        while (intentos < intentosMaximos) {
            for (int i = 0; i < 5; i++) {
                numeroIngresado = sc.nextInt();
                if (numeroIngresado == numeroSecreto) {
                    System.out.println("Felicidades encontraste el numero ! Eres chido !");
                } else {
                    if (numeroIngresado < numeroSecreto) {
                        System.out.println("Ups, el numero ingresado " + numeroIngresado + " es menor, vuelve a intentar");
                        intentos++;
                    } else if (numeroIngresado > numeroSecreto) {
                        System.out.println("Ups, el numero ingresado " + numeroIngresado + " es mayor, vuelve a intentar");
                        intentos++;
                    }
                }
            }
        }
        System.out.println("Se te han acabado los intentos. Vuelve a jugar ! ");
    }
}
