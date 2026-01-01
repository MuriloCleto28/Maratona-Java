package academy.devdojo.MaratonaJava.Introducao;

public class Aula05EstruturasCondicionaisExercicios02 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("É Domingo, um final de semana");
                break;
            case 2:
                System.out.println("É Segunda, um dia util");
                break;
            case 3:
                System.out.println("É Terça, um dia util");
                break;
            case 4:
                System.out.println("É Quarta, um dia util");
                break;
            case 5:
                System.out.println("É Quinta, um dia util");
                break;
            case 6:
                System.out.println("É Sexta, um dia util");
                break;
            case 7:
                System.out.println("É Sabado, um final de semana");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
    }
}
