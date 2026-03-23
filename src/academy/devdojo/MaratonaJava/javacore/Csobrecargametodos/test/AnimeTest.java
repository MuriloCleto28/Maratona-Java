package academy.devdojo.MaratonaJava.javacore.Csobrecargametodos.test;

import academy.devdojo.MaratonaJava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Isekai", 125);
        anime.init("Isekai", 125, "Naruto");
        anime.imprime();
    }
}
