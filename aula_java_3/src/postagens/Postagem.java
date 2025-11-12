package postagens;

public class Postagem {
    // atributos
    private int curtidas;

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas (int novaQuantidadeCurtidas) {
        this.curtidas = Postagem.validarNumeroCurtidas(novaQuantidadeCurtidas);
    }

    // Construtor
    public Postagem(){
        this.curtidas = 0;
    }

    public void mostrarCurtidas(){
        System.out.println("Total de curtidas: " + curtidas);
    }

    public void adicionarCurtida() {
        curtidas += 1;
    }

    private static int validarNumeroCurtidas(int quantidadeValidar) {
        if (quantidadeValidar < 0) {
            System.out.println("Números de curtidas inválidos!");
            return 0;
        } else {
            return quantidadeValidar;
        }
    }

}
