import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Filme filmeFavorito = new Filme("Taxi driver", 1976);
        filmeFavorito.avalia(9);
        filmeFavorito.avalia(9.5);
        filmeFavorito.avalia(10);
        System.out.println("Média de avaliações: "+ filmeFavorito.getpegaMedia());

        Filme filme2= new Filme("Donnie Darko", 2001);
        filme2.avalia(9);
        filme2.avalia(8);
        filme2.avalia(6);
        System.out.println("Média de avaliações: "+ filme2.getpegaMedia());


        Filme filme3 = new Filme("Valerie and her week of wonders", 1970);
        filme3.avalia(10);
        filme3.avalia(7);
        filme3.avalia(2);
        System.out.println("Média de avaliações: "+ filme3.getpegaMedia());

        Serie lost= new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração para marotonar Lost: "+ lost.getDuracaoEmMinutos()+ "minutos");

        CalculadoraDeTempo calculadora= new CalculadoraDeTempo();
        calculadora.inclui(filmeFavorito);
        calculadora.inclui(filme2);
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