import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {

        double compra = 0;
        System.out.println("Bienvenido, digite el total de la compra : ");

        Scanner sc = new Scanner(System.in);
        compra = sc.nextDouble();

        if (compra >= 100){
            System.out.println("Se ha aplicado un descuento del 10%. El nuevo total a pagar es :" + (compra * 0.9));
        } else {
            System.out.println("No se ha aplicado ningún descuento, el total de su compra es : " + compra);
        }
    }
}
