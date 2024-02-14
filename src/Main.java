import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.*;

import java.util.ArrayList;

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


        Filme filme2= new Filme();
        filme2.setNome("Donnie Darko");
        filme2.setAnoDeLancamento(2001);
        filme2.setDuracaoEmMinutos(110);
        filme2.avalia(9);
        filme2.avalia(8);
        filme2.avalia(6);
        System.out.println("Média de avaliações: "+ filme2.getpegaMedia());


        Filme filme3 = new Filme();
        filme3.setNome("Valerie and her week of wonders");
        filme3.setAnoDeLancamento(1970);
        filme3.setDuracaoEmMinutos(77);
        filme3.avalia(10);
        filme3.avalia(7);
        filme3.avalia(2);
        System.out.println("Média de avaliações: "+ filme3.getpegaMedia());

        Serie lost= new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração para marotonar Lost: "+ lost.getDuracaoEmMinutos()+ "minutos");

        var outroFilme= new Filme();
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


        ArrayList<Filme> listaDeFilmes= new ArrayList<>();

        listaDeFilmes.add(filmeFavorito);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista "+ listaDeFilmes.size());
        System.out.println("Primeiro filme "+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString() );
    }
}