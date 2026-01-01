package academy.devdojo.MaratonaJava.Introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        boolean isVinteMaiorQueDez = 20 > 10;
        boolean isVinteMenorQueDez = 20 < 10;

        System.out.println(isDezIgualDez);
        System.out.println(isVinteMaiorQueDez);
        System.out.println(isDezDiferenteDez);
        System.out.println(isVinteMenorQueDez);

        // && (AND) || (OR) !
        // Bom para utilizar em condiçoes if/else

        // = += -= *= /= %= ++ --
        double bonus = 1800.0;
        bonus += 1000;

        System.out.println(bonus);
    }
}
