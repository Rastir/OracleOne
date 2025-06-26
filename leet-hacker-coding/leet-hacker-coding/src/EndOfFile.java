import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        /* Este ejercicio nos enseña las bondades del End of File, que en resumidas cuentas es la manera interna en la
        el lenguaje en si detecta que haz terminado de agregar algo por terminal o a travez del input estandar, en este
        caso en java a través del scanner aquí un ejemplo*/

        //Inicia un scanner y un contador para que se impriman lineas y sus numeros
        Scanner sc = new Scanner(System.in);
        int contador = 1;

        //Usamos un bucle while para que mientras haya texto introducido se ejecute el codigo
        while (sc.hasNextLine()){
            //se le asigna la frase actual a la variable frase
            String frase = sc.nextLine();
            //se imprime el contador iniciado en 1 y la frase ingresada
            System.out.println(contador + " " + frase);
            // aumentamos contador para que en el siguiente (si es que hay) cambie de numero
            contador++;
        }
        //Se cierra el scaner y fin, eso es todo
        sc.close();
    }
}

/* Este ejercicio enseña el concepto de como funciona el final de la linea mientras siga habiendo ingresos sin la
necesidad de agregar una manera de cerrarlo, como una condicional, extraño porque casi siempre debe de existir una
condición de salida, pero es bueno aprenderlo.*/