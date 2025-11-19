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

    //override:  sobrescrita de método
    public void getDetalhes() {
        super.getDetalhes();
        System.out.println("O nosso caminhão tem uma capacidade de " + getCapacidadeEmToneladas() + " toneladas.");
    }

    //overload: sobrecarga de métodos
    public void getDetalhes(boolean mostrarEixos) {
        if (mostrarEixos) {
            System.out.println("O caminhão tem " + getNumeroEixos() + " eixos.");
        }
        else {
            System.out.println("Não mostrarei nada sobre eixos");
        }
    }

    public void getDetalhes (int quantidadeLinhasEmBranco) {
        for (int i = 0; i < quantidadeLinhasEmBranco; i++) {
            System.out.println();
        }
        super.getDetalhes();
    }

    // Polimorfismo: método da classe pai se comporta diferente na classe filha,
    // override e overload são tipos de polimorfismo.
    public void getSom() {
        System.out.println("Os caminhão são barulhentos.");
    }

}
