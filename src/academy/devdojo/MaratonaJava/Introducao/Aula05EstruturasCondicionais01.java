package academy.devdojo.MaratonaJava.Introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean poderComprarBebidasAlcoolicas = idade >= 18;
        if (poderComprarBebidasAlcoolicas) {
            System.out.println("Pode comprar bebidas alcolicas");
        } else {
            System.out.println("Não pode comprar bebidas alcolicas");
        }
    }
}
