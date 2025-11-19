package financiamento;

public class Apartamento extends Financiamento{

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxasJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxasJurosAnual);
    }

    public double pagamentoMensal () {
        double taxaMensal = getTaxasJurosAnual() / 12;
        double prazoMensal = getPrazoFinanciamento() * 12;
        double valorImovel = getValorImovel();
        double fator = Math.pow((1 + taxaMensal), prazoMensal); // expoente
        double numerador = valorImovel * fator; // parte de cima
        double denominador = fator - 1; // parte de baixo
        return numerador / denominador;
    }

}
