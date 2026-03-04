package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;



    public void init(String tipo, int episodios) {
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String tipo, int episodios, String nome) {
        this.init(tipo, episodios);
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
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
