package financiamento;

public class Apartamento extends Financiamento{
    protected int vagaGaragem;
    protected int andar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxasJurosAnual, int vagaGaragem, int andar) {
        super(valorImovel, prazoFinanciamento, taxasJurosAnual);
        this.vagaGaragem = vagaGaragem;
        this.andar = andar;
    }

    public int getVagaGaragem() {return vagaGaragem;}

    public int getAndar() {return andar;}

    @Override
    public void imprimirInfo() {
        System.out.println("\n-----Dados do Financiamento----");
        System.out.printf("Valor total do financiamento: %.2f \n", totalPagamento());
        System.out.printf("Valor mensal do financiamento: %.2f \n", pagamentoMensal());
        System.out.printf("Valor do imóvel: %.2f \n" , getValorImovel());
        System.out.printf("Andar do apartamento: %d \n" , getAndar());
        System.out.printf("Quantidade de vagas na garagem: %d \n" , getVagaGaragem());
    }

    @Override
    public double pagamentoMensal () {
        double taxaMensal = getTaxasJurosAnual() / 12;
        double prazoMensal = getPrazoFinanciamento() * 12;
        double valorImovel = getValorImovel();
        double fator = Math.pow((1 + taxaMensal), prazoMensal); // expoente
        double numerador = valorImovel * fator; // parte de cima
        double denominador = fator - 1; // parte de baixo
        return numerador / denominador;
    }

    @Override
    public double totalPagamento() {
        return pagamentoMensal() * this.prazoFinanciamento * 12;
    }

}
