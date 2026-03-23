package academy.devdojo.MaratonaJava.javacore.Dconstrutores.test;


import academy.devdojo.MaratonaJava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Isekai", 125, "Naruto", 2006);
        anime.imprime();
    }
}
