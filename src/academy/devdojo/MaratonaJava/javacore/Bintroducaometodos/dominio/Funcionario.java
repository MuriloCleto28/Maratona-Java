package academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            System.out.println("Esse funcionario não possui registro");
            return;
        }
        double valor = 0;
        for (double num : salarios) {
            valor += num;
            System.out.println(num);
        }
        double media = valor / salarios.length;
        System.out.println("Essa é a média do salário: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        return idade;
    }
}
