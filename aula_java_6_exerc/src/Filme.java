public class Filme extends ConteudoNetflix{

    public Filme(String titulo, double duracao) {
    super(titulo, duracao);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo o filme: " + this.titulo);
    }
}
