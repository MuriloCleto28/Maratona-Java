package academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.test;

import academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Murilo");
        pessoa.setIdade(15);
       // pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
