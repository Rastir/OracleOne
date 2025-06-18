import java.util.Scanner;

/* Este ejercicio muestra una serie en la que tenemos el siguiente enunciado (a+2^0 * b), (a +2^0 * b + 2^1 * b) ,...,
(a+21b+...+2^n-1b)

Esta progresión es una serie en la que tomas un numero de referencia, por ejemplo:

    a = 5 ==> aquí inicia tu serie
    b = 3 ==> este será tu factor de potencia
    c = 4 ==> este será tu numero de iteraciones

    en resumen harás algo como lo siguiente

    5 (numero de donde empeiza) + (1 x 3) factor inicial 1 y despues pasa a 2 = 8

    Ahora en la segunda iteración el valor inicial será 8 ya que tu valor final se combirtio en el inicial

    8(ahora valor inicial) + (2 x 3) factor de potencia, ya que se cambió al aumentar el numero de iteración = 14

    14(nuevo valor inicial) + (4 x 3) valor duplicado ya que se multiplicó el valor inicial por 2 (osea 2 x 2) = 26

    26(nuevo valor inicial) + (8 x 3) valor duplicado nuevamente por potencia = 50

    Así cumplimos la regla solicitada (a '<- valor inicial' + 2^0 '<- factor de potencia' * b) más complicado de lo que
    parece pero cumple la regla logica.
 */
public class LoopSerie {
    public static void main(String[] args) {

        //Ingresamos scanner y detallamos las instrucciones
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de series para trabajar");
        int t = in.nextInt();
        //creamos un loop sencillo con 'fori' con el factor de 't' donde 't' será las series a imprimir
        for (int i = 0; i < t; i++) {
            //se detallan las instrucciones, de quererse
            System.out.println("En qué numero empezará la serie?");
            int a = in.nextInt();
            System.out.println("Cual será el factor de multiplicación?");
            int b = in.nextInt();
            System.out.println("Cual será el numero maximo de iteraciones?");
            int n = in.nextInt();

            //dejamos en claro que la suma y el factor son centinelas
            int suma = a;
            int factor = 1;

            System.out.println("*======================================*");
            System.out.println("La serie iniciando en " + a + " con factor de potencia " + b + " se muestra de " +
                    "de la siguiente manera : ");
            /*Con el lopp por cada iteración haremos :
                    => tomar el numero inicial y agregarle el factor * b
                    => imprimir el numero y un espacio
                    => multiplicar el factor
            */
            for (int j = 0; j < n; j++) {
                suma += factor * b;
                System.out.print(suma + " ");
                factor *= 2;
            }
            System.out.println();
            System.out.println("*======================================*");
        }
        in.close();
    }
}

/* La mayoria de los ejercicios son ejercicios de logica matematica entonces tomalos con calma y no te rindas */
