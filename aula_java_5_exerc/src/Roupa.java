class Roupa extends Produto {
    private String tamanho;
    private String cor;

    public Roupa(int idProduto, String nome, double preco, String tamanho, String cor) {
        super(idProduto, nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }
}
