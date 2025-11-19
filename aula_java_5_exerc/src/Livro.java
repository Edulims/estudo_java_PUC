class Livro extends Produto {
    private String autor;
    private int numPaginas;

    public Livro(int idProduto, String nome, double preco, String autor, int numPaginas) {
        super(idProduto, nome, preco);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
}