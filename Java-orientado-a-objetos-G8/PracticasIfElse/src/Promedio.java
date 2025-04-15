public class Promedio {
    public static void main(String[] args) {

        double promedio = 5.2;

        if(promedio >= 7.0){
            System.out.println("El alumno fue aprovado");
        } else if (promedio >= 5.0 && promedio <= 6.9){
            System.out.println("El alumno está en recuperación ");
        }else {
            System.out.println("El alumno va derecho a extraordinario");
        }
    }
}
