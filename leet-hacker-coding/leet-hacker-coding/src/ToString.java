//Este ejercicio es un ejemplo de como se recibe un dato y se convierte a un string, se puede hacer tambien a la
//inversa osea convertir un string a un valor, concepto sencillo que se soluciona parseando las cosas.
import java.util.Scanner;

public class ToString {
    public static void main(String[] args) {
        //Iniciamos ingresando un numero por scanner o por variable

        // por escaner
        Scanner sc = new Scanner(System.in);
        String numero = sc.nextLine();

        //por variable
        int numeroDuro = 27;

        // tomamos el numero y lo parseamos

        int numeroString = Integer.parseInt(numero);


        //Por ultimo se imprime el resultado
        System.out.println("El numero ingresado por texto fue : " + numeroString);

        // Si bien aquí se acaba la demostración como sabemos que se ingresó recibió por pantalla un texto convertido
        // en lugar de un numero crudo, pues a parte de verlo arriba en el codigo se puede hacer una comparación.

        if(numeroDuro == numeroString){
            System.out.println("numero igual");
        } else {
            System.out.println("Numero no igual");
        }
    }
}

//Es un poco dificil de explicar el como funciona sin ver el codigo pero lo que se hace es recibir el numero en string
// y despues convertirlo en un entero, repito es un poco redundante pero esto funciona cuando por ejemplo tienes un
//cuadro de texto y la persona que no realizó su trabajo puso para una "edad" por ejemplo una caja de String, lo tomas
// como referencia. De nuevo, es un poco complejo sin ver el codigo y más porque esto pasa en lenguajes tipados pero
// nunca está de más saberlo.