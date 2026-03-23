package academy.devdojo.MaratonaJava.javacore.Gassociacao.test;

import academy.devdojo.MaratonaJava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.MaratonaJava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor[] professores = {professor};
        Escola escola = new Escola("Adventista", professores);
        escola.imprime();
    }
}
