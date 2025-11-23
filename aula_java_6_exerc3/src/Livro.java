public class Livro extends Produto{
    protected String autor;
    protected int quantidadePaginas;

    public Livro(String nome, double preco, String autor, int quantidadePaginas) {
        super(nome, preco);
        this.autor = autor;
        this.quantidadePaginas = quantidadePaginas;
    }

    public void getAutor() {
        System.out.println("Autor: " + autor);
    }

    public void getQuantidadePaginas() {
        System.out.println("Paginas: " + quantidadePaginas);
    }
}
