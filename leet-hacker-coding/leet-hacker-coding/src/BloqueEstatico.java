import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Este es un ejercicio donde se pone a prueba el conocimiento de metodos y bloques estaticos, si bien un metodo estatico
ya esta predefinico y puede ser cambiado durante la ejecución del programa, el bloque estatico "static" lo inicializa
antes, haciendo que esto quede definido antes del metodo main, osea que los valores ya estén defido antes de iniciar,
en este ejemplo en especifico, se ingresan los valores por consola lo cual mata un poco el sentido de tener un bloque
estatico ya que aun así las variables las ingresas por consola con el scanner, pero sería un gran ejemplo si ponemos
numeros ya escritos, por ejemplo B = 3 y H = 6
*/
public class BloqueEstatico {

    //Se declaran las variables generales

        public static int B;
        public static int H;
        public static boolean flag = false;

        //Se crea el bloque estatico, en caso de querer meterlo por consola se inicia un scanner

        static {
            B = 3;
            H = 6;

            // se define la condicional si es mayor que ....
            if (B > 0 && H >  0) {
                //aqui tenemos nuestro centinela que se encarga del cumplimiento de uno u otro
                //siempre y cuando la condición se cumpla.
                flag = true;
            } else {
                //si no, pues arroja el error
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }

        //Por ultimo en el main ejecuta todo lo pasado en lugar de preguntar por variables durante la ejecución.
        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.println("Bloque estatico cargado con B: " + B + " y H: " + H);
                System.out.print(area);
            }
        }
    }

    //Como mencioné, el ejercicio es sencillo pero parece complicado si no se entiende el concepto de estatico, a fines
//practicos, es como si quisieras tener algo ya cargago para cuando vas a correr un programa, util en ciertas situaciones.