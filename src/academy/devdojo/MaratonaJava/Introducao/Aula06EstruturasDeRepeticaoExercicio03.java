package academy.devdojo.MaratonaJava.Introducao;

public class Aula06EstruturasDeRepeticaoExercicio03 {
    public static void main(String[] args) {
        double valorDoCarro = 50000;
        double limite = 1000;
        for (int i = 1; valorDoCarro / i >= limite; i++) {
            double valorDasParcelas = valorDoCarro / i;
            if (valorDasParcelas < 1000) {
                break;
            }
            System.out.println("O carro pode ser parcelado em " + i + " vezes, em que cada parcela custará: " + valorDasParcelas);
        }
    }
}
