package academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.test;

import academy.devdojo.MaratonaJava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.someDoisNumeros();
        calculadora.subtraiaDoisNumeros();
        calculadora.multiplicaDoisNumeros(20, 30);
    }
}
