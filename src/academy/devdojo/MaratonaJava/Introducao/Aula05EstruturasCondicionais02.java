package academy.devdojo.MaratonaJava.Introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 13;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}

