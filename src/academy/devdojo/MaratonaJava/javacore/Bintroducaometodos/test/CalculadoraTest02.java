package academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.test;

import academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
         double result = calculadora.divideDoisNumeros(0, 10);
        System.out.println(result);
    }
}
