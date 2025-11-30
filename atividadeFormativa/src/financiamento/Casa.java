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

    public double getAreaConstruida() { return areaConstruida; }

    public double getAreaTerreno() { return areaTerreno; }

    @Override
    public void imprimirInfo() {
        System.out.println("\n-----Dados do Financiamento (Casa)----");
        System.out.printf("Valor total do financiamento: %.2f \n", totalPagamento());
        System.out.printf("Valor mensal do financiamento: %.2f \n", pagamentoMensal());

        System.out.printf("Valor do imóvel: %.2f \n", getValorImovel());
        System.out.printf("Area total do terreno: %.2f \n", getAreaTerreno());
        System.out.printf("Area total construida: %.2f \n", getAreaConstruida());
        System.out.printf("Valor do Seguro (Atualizado): %.2f \n", getSeguroCasa());
    }

    @Override
    public double pagamentoMensal() {
        double taxaMensal = getTaxasJurosAnual() / 100.0 / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        double valorImovel = getValorImovel();

        // Cálculo dos juros mensal
        double valorJurosMensal = valorImovel * taxaMensal;
        double metadeDosJuros = valorJurosMensal / 2;

        try {
            if (seguroCasa > metadeDosJuros) {
                throw new AumentoMaiorDoQueJurosException("O seguro (R$ " + String.format("%.2f", seguroCasa) +
                        ") é maior que a metade dos juros (R$ " + String.format("%.2f", metadeDosJuros) + ").");
            }
        } catch (AumentoMaiorDoQueJurosException e) {
            System.out.println("\n[AVISO] " + e.getMessage());
            this.seguroCasa = valorJurosMensal; // Regra pedida: seguro = valor do juros
            System.out.println("[CORREÇÃO] O valor do seguro foi ajustado para o valor dos juros: R$ " + String.format("%.2f", this.seguroCasa));
        }

        if (taxaMensal == 0.0) {
            return valorImovel / meses + getSeguroCasa();
        }

        double fator = Math.pow(1 + taxaMensal, -meses);
        return valorImovel * taxaMensal / (1 - fator) + getSeguroCasa();
    }

    @Override
    public double totalPagamento() {
        return pagamentoMensal() * getPrazoFinanciamento() * 12;
    } }