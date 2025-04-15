import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {

        int numero = 0;

        System.out.println("Ingrese un numero : ");

        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es par");

        } else {
            System.out.println("El numero es impar.");
        }
    }
}
