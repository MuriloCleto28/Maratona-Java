package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Murilo");
        funcionario.setIdade(15);
        funcionario.setSalarios(new double[]{1500, 3890, 3211});
        funcionario.imprimirDados();
       /* System.out.println(funcionario.getIdade());
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalarios()); */
    }
}
