import java.util.Scanner;

public class StringFormater {
    public static void main(String[] args) {

        /* el sout puede cambiarse con un 'f' para darle un formato, se puede buscar la información en la documentación
        de oracle para el String format, pero en resumidas cuentas se puede hacer algo así*/

        //Iniciamos Scanner pa' leer lo que querramos ingresar
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        // creamos un bucle de repetición de 3, es un ejemplo
        for (int i = 0; i < 3; i++) {
            //Luego declaramos las variables a travez del scanner
            String string = sc.next();
            int numeros = sc.nextInt();

            /*Aquí se va a dar el formato y se explica de la  siguiente manera :
            "%-15s" -> se le está dando un formato de espacio donde el string será de maximo 15 espacios
            "%03d%n" -> se le da el valor al integer en este caso numeros y lo forza a usar 3 espacio en caso de no ser de
            3 espacios rellenará con "0" le espacio por ejemplo "065"*/
            System.out.printf("%-15s%03d%n",string,numeros);
        }

        System.out.println("================================");
    }
}

       /* Consideraciones para este tipo de ejercicios, que pasa si se se usa un integer con más de 3 espacios : "Lo recorre"
        a la derecha y sigue

        ¿Qué pasa si el string es mayor que el numero del formato? "solo lo recorrerá a la derecha hasta llenarlo"

        Por ahora eso es todo. Mucho exito*/