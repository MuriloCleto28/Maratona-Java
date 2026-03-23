package academy.devdojo.MaratonaJava.javacore.Gassociacao.test;

import academy.devdojo.MaratonaJava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.MaratonaJava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};
        jogador.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("--- Jogador ---");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
