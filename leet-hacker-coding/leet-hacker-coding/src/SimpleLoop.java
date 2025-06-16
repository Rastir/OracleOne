import java.util.Scanner;

public class SimpleLoop {
    /* en este ejercicio crearemos un loop para a traves de consola imprimir una lista como una tabla de multiplicar*/

    public static void main(String[] args) {

        // iniciamos metodo de ingresar datos y mostramos mensaje para solicitarlo

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la tabla de multiplicar a mostrar ");
        int tabla = sc.nextInt();

        //creamos un loop for para crear la tabla de multiplicar donde tomemos el numero y lo multipliquemos por si en
        //la posición hasta el numero que querramos en este caso pondremos un limite de 10

        //Se inicia en posicion 1 porque las tablas de multiplicar no empiezan en 0
        for (int i = 1; i <= 10; i++) {
            //damos formato y realizamos la logica sencilla
            // -> Imprimimos el numero que ingresamos en el scanner
            // -> Despues ponemos la posicion en i
            // -> Por ultimo multiplicamos el numero por la posicion en i por ejemplo 1 x 1 = 1 y así sigue todo el limite
            System.out.println(tabla + " x " + i + " = " + (tabla*i));

            // Con eso se termina el ejercicio, no hay más. Exito !
        }
    }

}
