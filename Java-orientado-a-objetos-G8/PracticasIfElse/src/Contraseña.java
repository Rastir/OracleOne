import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {

        String contrasenia = "123456";

        System.out.println("Bienvenido al sistema favor de ingresar la contraseña :");
        Scanner sc = new Scanner(System.in);
        String intento = sc.nextLine();

        if (intento.equals(contrasenia)){
            System.out.println("Acceso concedido ");
        } else {
            System.out.println("You shall not pass !");
        }
    }
}
