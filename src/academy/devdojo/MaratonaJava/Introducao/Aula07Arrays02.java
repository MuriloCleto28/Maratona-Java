package academy.devdojo.MaratonaJava.Introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // float, int, short, long, double, byte = 0
        //char = /n0000
        //boolean = false
        //String = null
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Luffy";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
