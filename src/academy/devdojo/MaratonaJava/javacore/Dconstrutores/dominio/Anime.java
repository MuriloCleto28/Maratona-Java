package academy.devdojo.MaratonaJava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private int ano;

    public Anime(String tipo, int episodios, String nome) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public Anime(String tipo, int episodios, String nome, int ano) {
        this(tipo, episodios, nome);
        this.ano = ano;
    }

    public Anime() {

    }

    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.ano);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }
}
