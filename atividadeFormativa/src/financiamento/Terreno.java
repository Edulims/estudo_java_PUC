package financiamento;

public class Terreno extends Financiamento{

    public Terreno(double valorImovel, int prazoFinanciamento, double taxasJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxasJurosAnual);
    }

    public double pagamentoMensal () {
        return super.pagamentoMensal() * 1.02;
    }

}
