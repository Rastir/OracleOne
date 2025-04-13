import com.alluracursos.screenmatch.model.Episodio;
import com.alluracursos.screenmatch.model.Pelicula;
import com.alluracursos.screenmatch.model.Serie;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        Pelicula otraPelicula = new Pelicula();
        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();

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

        calculadoraDeTiempo.incluye(miPelicula);
        calculadoraDeTiempo.incluye(casaDragon);
        System.out.println(calculadoraDeTiempo.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setNombre("el chiludo");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodio);   

    }
}
