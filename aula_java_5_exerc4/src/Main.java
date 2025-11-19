public class Main {
    public static void main(String[] args) {
        Viagem trajeto1 = new Viagem();

        var valorCorrida1 = trajeto1.calcularPreco(10);
        var valorCorrida2 = trajeto1.calcularPreco(10, true);

        System.out.println("O valor de sua corrida é: " + valorCorrida1);
        System.out.println("O valor de sua corrida é: " + valorCorrida2);

    }
}
