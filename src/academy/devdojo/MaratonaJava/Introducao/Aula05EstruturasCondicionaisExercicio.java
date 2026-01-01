package academy.devdojo.MaratonaJava.Introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.5 / 100;
        double imposto;
        if (salarioAnual <= 34712) {
            salarioAnual *= primeiraFaixa;
            imposto = salarioAnual;
            salarioAnual /= primeiraFaixa;
            salarioAnual -= imposto;
        } else if (salarioAnual > 34713 && salarioAnual <= 68507) {
            salarioAnual *= segundaFaixa;
            imposto = salarioAnual;
            salarioAnual /= segundaFaixa;
            salarioAnual -= imposto;
        } else {
            salarioAnual *= terceiraFaixa;
            imposto = salarioAnual;
            salarioAnual /= terceiraFaixa;
            salarioAnual -= imposto;
        }
        System.out.println("Eu ganho " + salarioAnual + " de salario contando com os impostos, e pago " + imposto + " de imposto.");
    }
}
