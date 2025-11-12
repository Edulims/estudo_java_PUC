public class Aventureiro {
    String nome;
    String classe;

    // Construtor
    public Aventureiro(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public void apresentar() {
        System.out.println("Eu sou " + this.nome + ", o " + this.classe + "!");
    }


}
