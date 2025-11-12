public class Episodio {
    String titulo;
    Float duracao;

    Episodio (String nome, Float tempo) {
        this.titulo = nome;
        this.duracao = tempo;
    }

    void imprimirDados(){
        System.out.println("Título: " + this.titulo);
        System.out.printf("Duração: %.2f\n", this.duracao);

    }

    public static void main(String[] args) {
        Episodio ep1 = new Episodio("Capitulo 1", 41.10f);
        Episodio ep2 = new Episodio("Capitulo 2", 44.15f);
        Episodio ep3 = new Episodio("Capitulo 3", 45.00f);
        Episodio ep4 = new Episodio("Capitulo 4", 39.420f);
        Episodio ep5 = new Episodio("Capitulo 5", 43.28f);


    }
}
