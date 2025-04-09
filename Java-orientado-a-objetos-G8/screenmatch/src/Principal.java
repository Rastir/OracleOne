import com.alluracursos.screenmatch.model.Pelicula;
import com.alluracursos.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        Pelicula otraPelicula = new Pelicula();

        miPelicula.setNombre("Matrix");
        miPelicula.setFechaDeLanzamiento(1998);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.evalua(10);
        miPelicula.evalua(9.8);
        miPelicula.evalua(7);

        miPelicula.muestraFichaTecnica();
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setFechaDeLanzamiento(2020);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorCapitulo(60);
        casaDragon.setEpisodiosPorTemporadas(10);
        System.out.println(casaDragon.getDuracionMinutos());
    }
}
