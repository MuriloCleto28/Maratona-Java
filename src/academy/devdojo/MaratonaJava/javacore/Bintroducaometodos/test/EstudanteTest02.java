package academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.test;

import academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.idade = 15;
        estudante01.nome = "Naruto";
        estudante01.sexo = 'M';

        estudante02.idade = 15;
        estudante02.nome = "Sakura";
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
