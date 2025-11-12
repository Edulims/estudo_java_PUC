import java.util.ArrayList;

public class Serie {
    // Atributos da classe Serie
    String nome;
    ArrayList<Episodio> episodios;

    // Método construtor da classe Serie
    Serie(String nome) {
        this.nome = nome;
        this.episodios = new ArrayList<>();
    }

    // Método para adicionar episódio à série
    void adicionarEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }

    // Método para imprimir as informações da série
    void imprimirInfoSerie() {
        System.out.println("Série: " + this.nome);
        System.out.println("Episódios:");
        for(Episodio episodio : this.episodios) {
            episodio.imprimirDados();
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Criação de instâncias de Episódio
        Episodio episodio1 = new Episodio("Episódio 1", 45f);
        Episodio episodio2 = new Episodio("Episódio 2", 52f);
        Episodio episodio3 = new Episodio("Episódio 3", 49f);

        // Criação de uma instância de Serie
        Serie serie = new Serie("Série 1");

        // Adicionando episódios a uma Serie
        serie.adicionarEpisodio(episodio1);
        serie.adicionarEpisodio(episodio2);
        serie.adicionarEpisodio(episodio3);

        // Adicionando episódios de um outro jeito
        serie.adicionarEpisodio(new Episodio("Episódio 4", 64.2f));
        serie.adicionarEpisodio(new Episodio("Episódio 5", 55.2f));

        // Mostrando as informações da Serie
        serie.imprimirInfoSerie();
    }
}