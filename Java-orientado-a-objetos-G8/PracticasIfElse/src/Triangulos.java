import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {

        double lado1,lado2,lado3;

        System.out.println("ingrese la longitud del primer lado : ");
        Scanner sc = new Scanner(System.in);
        lado1 = sc.nextDouble();

        System.out.println("ingrese la longitud del segundo lado : ");
        lado2 = sc.nextDouble();

        System.out.println("ingrese la longitud del tercer lado : ");
        lado3 = sc.nextDouble();

        sc.close();

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1  ){
            System.out.println("Los lados pueden formar un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo.");
        }
    }
}
