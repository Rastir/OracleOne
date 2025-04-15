import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {

        System.out.println("Ingrese un día de la semana :");

        Scanner sc = new Scanner(System.in);
        String diaSemana = sc.nextLine();

        if (diaSemana.equalsIgnoreCase("lunes") || diaSemana.equalsIgnoreCase("martes")||
            diaSemana.equalsIgnoreCase("miercoles") || diaSemana.equalsIgnoreCase("jueves") ||
                diaSemana.equalsIgnoreCase("viernes")){
            System.out.println(diaSemana + " es un día habil");
        } else if (diaSemana.equalsIgnoreCase("sabado") || diaSemana.equalsIgnoreCase("domingo")){
            System.out.println(diaSemana + " es un día inhabil");
        } else {
            System.out.println("Eso no es un día, intenta de nuevo");
        }
    }
}
