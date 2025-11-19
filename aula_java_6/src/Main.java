import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var veiculos = new ArrayList<Veiculo>();

        veiculos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
        veiculos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));


        for (var veiculo : veiculos) {
            veiculo.getDetalhes();
        }

    }
}