import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.*;

public class Main {
    public static void main(String[] args) {
        Filme filmeFavorito = new Filme();
        filmeFavorito.setNome("Taxi driver");
        filmeFavorito.setAnoDeLancamento(1976);
        filmeFavorito.setDuracaoEmMinutos(114);
        filmeFavorito.avalia(9);
        filmeFavorito.avalia(9.5);
        filmeFavorito.avalia(10);
        System.out.println("Média de avaliações: "+ filmeFavorito.getpegaMedia());

        Serie lost= new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração para marotonar Lost: "+ lost.getDuracaoEmMinutos()+ "minutos");

        Filme outroFilme= new Filme();
        outroFilme.setNome("Breathless");
        outroFilme.setDuracaoEmMinutos(90);

        CalculadoraDeTempo calculadora= new CalculadoraDeTempo();
        calculadora.inclui(filmeFavorito);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FIltroRecomendacao filtro= new FIltroRecomendacao();
        filtro.filtra(filmeFavorito);

        Episodio episodio= new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}