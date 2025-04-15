import java.sql.SQLOutput;
import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {

        System.out.println("Ingrese un numero");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();

        System.out.println("Ingrese otro numero ");
        int numero2 = sc.nextInt();

        sc.close();

        if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
        } else if (numero1 > numero2){
            System.out.println("El numero " + numero1 + " es mayor qué " + numero2);
        } else {
            System.out.println("El numero " + numero2 + " es mayor qué " + numero1);
        }
    }
}
