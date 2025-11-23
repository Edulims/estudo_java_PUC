public class Eletronico extends Produto{
    protected boolean garantia;
    protected String categoria;

    public Eletronico(String nome, double preco, boolean garantia, String categoria) {
        super(nome, preco);
        this.garantia = garantia;
        this.categoria = categoria;
    }

    public void isGarantia() {
        System.out.println("Garantia: " + garantia);
    }

    public void getCategoria() {
        System.out.println("Categoria: " + categoria);
    }
}
