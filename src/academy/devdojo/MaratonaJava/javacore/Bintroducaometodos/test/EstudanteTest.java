package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprimir = new ImprimeEstudante();

        estudante01.idade = 15;
        estudante01.nome = "Naruto";
        estudante01.sexo = 'M';

        estudante02.idade = 15;
        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';

        imprimir.imprime(estudante01);
        imprimir.imprime(estudante02);
        System.out.println("################################");
        imprimir.imprime(estudante01);
        imprimir.imprime(estudante02);
    }
}
