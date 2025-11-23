package financiamento;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double areaTerreno;
    private double seguroCasa = 80;

    public Casa(double valorImovel, int prazoFinanciamento, double taxasJurosAnual, double areaConstruida, double areaTerreno) {
        super(valorImovel, prazoFinanciamento, taxasJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    public double getSeguroCasa() {
        return seguroCasa;
    }

    public double getAreaConstruida() {return areaConstruida;}

    public double getAreaTerreno() {return areaTerreno;}

    @Override
    public void imprimirInfo() {
        System.out.println("\n-----Dados do Financiamento----");
        System.out.printf("Valor total do financiamento: %.2f \n", totalPagamento());
        System.out.printf("Valor mensal do financiamento: %.2f \n", pagamentoMensal());
        System.out.printf("Valor do imóvel: %.2f \n" , getValorImovel());
        System.out.printf("Area total do terreno: %.2f \n" , getAreaTerreno());
        System.out.printf("Area total construida: %.2f \n" , getAreaConstruida());
    }

    @Override
    public double pagamentoMensal () {
        double r = getTaxasJurosAnual() / 100.0 / 12.0; // taxa mensal
        int n = getPrazoFinanciamento() * 12;           // meses
        double P = getValorImovel();

        if (r == 0.0) {
            return P / n + getSeguroCasa(); // caso especial: sem juros
        }

        double fator = Math.pow(1 + r, -n);
        return P * r / (1 - fator) + getSeguroCasa();
    }

    @Override
    public double totalPagamento() {
        return pagamentoMensal() * this.prazoFinanciamento * 12;
    }
}
