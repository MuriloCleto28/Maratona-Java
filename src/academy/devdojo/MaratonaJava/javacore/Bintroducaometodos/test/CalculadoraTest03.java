package academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.test;

import academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 20;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
