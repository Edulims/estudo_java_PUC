public class Caminhao extends Veiculo {
    // Atributos
    private String marca;
    private int numeroEixos;
    private int capacidadeEmToneladas;

    // Construtor
    public Caminhao(String marcaDoCaminhao, String motorDoCaminhao, int numEixosCaminhao, int capacidadeToneladas) {
        super(marcaDoCaminhao, motorDoCaminhao); // chama o construtor do Veiculo
        this.marca = marcaDoCaminhao;
        this.numeroEixos = numEixosCaminhao;
        this.capacidadeEmToneladas = capacidadeToneladas;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getNumeroEixos() {
        return this.numeroEixos;
    }

    public int getCapacidadeEmToneladas() {
        return this.capacidadeEmToneladas;
    }

    @Override
    public void getDetalhes() {

    }
}
