public class Viagem {
    private final double precoBase = 2.0;
    private final double precoPorKm = 1.0;
    private final double PrecoPicoKm = 2.0;

    public double calcularPreco(double trajeto) {
        return precoBase + (trajeto * precoPorKm);
    }

    public double calcularPreco(double distancia, boolean horarioPico) {
        // horarioPico == true
        if (horarioPico) {
            return precoBase + (distancia * PrecoPicoKm);
        } else {
            return precoBase + (distancia * precoPorKm);
        }
    }


}
