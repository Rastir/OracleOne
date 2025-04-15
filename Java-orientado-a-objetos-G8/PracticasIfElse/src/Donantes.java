import java.util.Scanner;

public class Donantes {
    public static void main(String[] args) {

        int edad;
        double peso;

        System.out.println("ingrese la edad del donante :");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();

        System.out.println("ingrese el peso del donante en kilogramos");
        peso = sc.nextDouble();

        boolean marcaEdad = edad >= 18 && edad <= 65;
        boolean marcaPeso = peso >= 50;

        if(marcaEdad && marcaPeso){
            System.out.println("El candidato es apto para donar");
        }else {
            System.out.println("El candidato no es apto para donar, causa : " );
            if (!marcaEdad){
                System.out.println("- el candidato debe de estar en el rango de edad permitido");
            }
            if (!marcaPeso){
                System.out.println("- el candidato debe de pesar mas de o 50 kilogramos");
            }
        }

    }
}
