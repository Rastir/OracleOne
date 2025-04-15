import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {

        double prestamo;
        System.out.println("Por favor ingrese una cantidad para su prestamo : ");
        Scanner sc = new Scanner(System.in);
        prestamo = sc.nextDouble();

        if (prestamo < 1000 || prestamo > 5000){
            System.out.println("La cantidad ingresada no es apta para el prestamo");
        } else {
            System.out.println("Prestamo aprobado, disfrute del billete!");
        }
    }
}
