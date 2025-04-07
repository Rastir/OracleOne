import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {

        String nombre;
        double dinero = 0;
        double depositar =0;
        double consultar =0;
        boolean salir = false ;
        int opcion =0;
        double retiro =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos a banca flaca, por favor introduzca su nombre : ");
        nombre = sc.nextLine();

        System.out.println("Bienvenido Sr./Srta. " + nombre + " que desea hacer hoy ?");

        while (opcion != 9){
            System.out.print("**************************************************" +
                            "\n1 - Consultar " +
                            "\n2 - Retirar " +
                            "\n3 - Depositar " +
                            "\n9 - Salir " +
                            "\n**************************************************" );
            opcion = sc.nextInt();

            if (opcion == 1){
                System.out.println("El dinero de la cuenta de cheques es : " + dinero);
            } else if (opcion == 2){
                System.out.println("Cuanto dinero desea retirar ?");
                retiro = sc.nextDouble();
                if (retiro > dinero ){
                    System.out.println("Fondos insuficientes, favor de ingresar otra cantidad ");
                } else if (retiro == 0) {
                    System.out.println("No puede retirar cantidades nulas");
                } else {
                    dinero = (dinero - retiro);
                    System.out.println("**********************************" +
                                    "\nTransacción realizada" +
                                    "\n**********************************");
                }
            } else if (opcion == 3){
                System.out.println("Cuanto dinero desea ingresar ?");
                depositar = sc.nextDouble();
                dinero = (dinero + depositar);
                System.out.println("**********************************" +
                        "\nTransacción realizada" +
                        "\n**********************************");
            } else if (opcion == 9) {
                break;
            } else {
                System.out.println("Opción invalida, porfavor seleccione un numero de la lista");
            }
        }
        System.out.println("Gracias por usar la banca Flaca, vuelva pronto");
    }
}
