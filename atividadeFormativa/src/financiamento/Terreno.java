package financiamento;

public class Terreno extends Financiamento{
    protected String zona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxasJurosAnual, String zona) {
        super(valorImovel, prazoFinanciamento, taxasJurosAnual);
        this.zona = zona;
    }

    public String getZona() {return zona;}

    @Override
    public void imprimirInfo() {
        System.out.println("\n-----Dados do Financiamento----");
        System.out.printf("Valor total do financiamento: %.2f \n", totalPagamento());
        System.out.printf("Valor mensal do financiamento: %.2f \n", pagamentoMensal());
        System.out.printf("Valor do imóvel: %.2f \n" , getValorImovel());
        System.out.println("Setor/Zona do Terreno: " + getZona());
    }

    @Override
    public double pagamentoMensal () {
        double r = getTaxasJurosAnual() / 100.0 / 12.0; // taxa mensal
        int n = getPrazoFinanciamento() * 12;           // meses
        double P = getValorImovel();

        if (r == 0.0) {
            return P / n * 1.02; // caso especial: sem juros
        }

        double fator = Math.pow(1 + r, -n);
        return P * r / (1 - fator) * 1.02;
    }

    @Override
    public double totalPagamento() {
        return pagamentoMensal() * this.prazoFinanciamento * 12;
    }

}
