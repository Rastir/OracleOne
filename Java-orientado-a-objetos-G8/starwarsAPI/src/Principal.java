import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escriba el numero de pelicula a consultar");
        try{
            var numeroDePelicula = Integer.valueOf(sc.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivos generador = new GeneradorDeArchivos();
            generador.guardarJson(pelicula);
        }catch (NumberFormatException e){
            System.out.println("Eso no es un episodio "+e.getMessage());
        }
        catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }
    }
}
