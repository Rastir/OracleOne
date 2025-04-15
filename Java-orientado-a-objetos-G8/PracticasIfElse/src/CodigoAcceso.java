import java.util.Scanner;

public class CodigoAcceso {
    public static void main(String[] args) {

        String codigo;
        int nivel;

        System.out.println("Ingrese codigo de accesso :");
        Scanner sc = new Scanner(System.in);
        codigo = sc.nextLine();

        System.out.println("Ingrese nivel de accesso");
        nivel = sc.nextInt();

        boolean marcaCodigo = codigo.equalsIgnoreCase("2023");
        boolean marcaNivel = nivel == 1 || nivel == 2 || nivel == 3;

        if(marcaCodigo && marcaNivel){
            System.out.println("Acceso concedido !Bienvenido!");
        }else {
            System.out.println("Acceso denegado, causa : " );
            if (!marcaCodigo){
                System.out.println("- codigo incorrecto");
            }
            if (!marcaNivel){
                System.out.println("- nivel incorrecto");
            }
        }

    }
}
