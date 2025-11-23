package financiamento;

public abstract class Financiamento {
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxasJurosAnual;

    public double getValorImovel() {
        return valorImovel;
    }
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }
    public double getTaxasJurosAnual() {
        return taxasJurosAnual;
    }

    public abstract void imprimirInfo();

    public Financiamento (double valorImovel, int prazoFinanciamento, double taxasJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxasJurosAnual = taxasJurosAnual;
    }

    public abstract double pagamentoMensal ();

    public abstract double totalPagamento ();
}
