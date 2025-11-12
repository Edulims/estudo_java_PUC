package financiamento;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxasJurosAnual;

    public double getValorImovel() {
        return valorImovel;
    }
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }
    public double getTaxasJurosAnual() {
        return taxasJurosAnual;
    }

    public void imprimirInfo() {
        System.out.println("\n-----Dados do Financiamento----");
        System.out.printf("Valor total do financiamento: %.2f \n", totalPagamento());
        System.out.printf("Valor mensal do financiamento: %.2f \n", pagamentoMensal());
        System.out.printf("Valor do imóvel: %.2f \n" , getValorImovel());
    }

    public Financiamento (double valorImovel, int prazoFinanciamento, double taxasJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxasJurosAnual = taxasJurosAnual;
    }

    public double pagamentoMensal () {
        double r = getTaxasJurosAnual() / 100.0 / 12.0; // taxa mensal
        int n = getPrazoFinanciamento() * 12;           // meses
        double P = getValorImovel();

        if (r == 0.0) {
            return P / n; // caso especial: sem juros
        }

        double fator = Math.pow(1 + r, -n);
        return P * r / (1 - fator);
    }


    public double totalPagamento () {
        return pagamentoMensal() * this.prazoFinanciamento * 12;
    }
}
