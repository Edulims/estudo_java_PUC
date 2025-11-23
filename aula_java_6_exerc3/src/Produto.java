public abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void getNome() {
        System.out.println("Nome: " + nome);
    }
    public void getPreco() {
        System.out.println("Oferta R$" + preco);
    }
}
