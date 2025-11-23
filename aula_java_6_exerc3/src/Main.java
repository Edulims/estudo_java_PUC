public class Main {
    public static void main(String[] args) {
        Eletronico videogame1 = new Eletronico("Playstation 5", 4500, true, "videogame");
        Livro livro1 = new Livro("Harry Potter", 49.90, "J.K. Rolling", 392);

        System.out.println("==== Cadastro de Eletronicos ====");
        videogame1.getNome();
        videogame1.getPreco();
        videogame1.getCategoria();
        videogame1.isGarantia();

        System.out.println("\n=== Cadastro de Livros ===");
        livro1.getNome();
        livro1.getPreco();
        livro1.getAutor();
        livro1.getQuantidadePaginas();

    }
}
