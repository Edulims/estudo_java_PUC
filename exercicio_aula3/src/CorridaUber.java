public class CorridaUber {
    private String localizacaoAtual;
    private String destino;
    private double precoEstimado;

    public CorridaUber(String localizacaoAtual, String destino, double precoEstimado) {
        this.localizacaoAtual = localizacaoAtual;
        this.destino = destino;
        this.precoEstimado = precoEstimado;
    }

    public String getLocalizacaoAtual() {
        return localizacaoAtual;
    }
    public String getDestino() {
        return destino;
    }
    public double getPrecoEstimado() {
        return precoEstimado;
    }

    public void setLocalizacaoAtual(String localizacaoAtual) {
        this.localizacaoAtual = localizacaoAtual;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setPrecoEstimado(double precoEstimado) {
        this.precoEstimado = precoEstimado;
    }

    public static void main(String[] args) {
        CorridaUber corrida1 = new CorridaUber("Av. Paulista", "Rua Augusta", 35.00);
        System.out.println("Corrida 1 - De: " + corrida1.getLocalizacaoAtual() + ", Para: " + corrida1.getDestino() + ", Preço estimado: R$" + corrida1.getPrecoEstimado());

        CorridaUber corrida2 = new CorridaUber("Parque Ibirapuera", "Estação Vila Madalena", 45.00);
        System.out.println("Corrida 2 - De: " + corrida2.getLocalizacaoAtual() + ", Para: " + corrida2.getDestino() + ", Preço estimado: R$" + corrida2.getPrecoEstimado());
    }

}


