package financiamento;

public class Casa extends Financiamento {
    private double seguroCasa = 80;

    public Casa(double valorImovel, int prazoFinanciamento, double taxasJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxasJurosAnual);
    }


    public double getSeguroCasa() {
        return seguroCasa;
    }

    public double pagamentoMensal () {
        return super.pagamentoMensal() + getSeguroCasa();
    }



}
