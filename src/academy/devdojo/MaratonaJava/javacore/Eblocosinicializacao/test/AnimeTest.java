package academy.devdojo.MaratonaJava.javacore.Eblocosinicializacao.test;

import academy.devdojo.MaratonaJava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }

    }
}
