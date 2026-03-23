package academy.devdojo.MaratonaJava.javacore.Gassociacao.test;

import academy.devdojo.MaratonaJava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.MaratonaJava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Neymar");
        Jogador[] jogadores = {jogador01};
        Time time = new Time("Santos");
        jogador01.setTime(time);
        jogador01.imprime();
    }
}
