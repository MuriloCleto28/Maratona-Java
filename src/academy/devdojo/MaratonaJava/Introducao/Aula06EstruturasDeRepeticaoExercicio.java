package academy.devdojo.MaratonaJava.Introducao;

public class Aula06EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {
        float numberPar = 0;
        do {
            System.out.println(numberPar);
            numberPar += 2;
        } while (numberPar <= 1000000);
    }
}
