import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese temperatura a convertir : ");
        int temperaturaCelsius = sc.nextInt();

        double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("La temperatura " + temperaturaCelsius + " en grados Farenhait es : " + temperaturaFarenheit);

    }
}
