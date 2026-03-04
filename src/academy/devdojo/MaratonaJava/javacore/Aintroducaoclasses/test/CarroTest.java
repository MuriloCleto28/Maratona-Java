package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.ano = 2020;
        carro01.modelo = "Fusca";
        carro01.nome = "Fusca Azul";

        System.out.println(carro01.ano);
        System.out.println(carro01.modelo);
        System.out.println(carro01.nome);

        Carro carro02 = new Carro();
        carro02.ano = 2022;
        carro02.nome = "Subaru Branco";
        carro02.modelo = "Subaru";

        System.out.println("---------------------------");
        System.out.println(carro02.ano);
        System.out.println(carro02.modelo);
        System.out.println(carro02.nome);
    }
}
