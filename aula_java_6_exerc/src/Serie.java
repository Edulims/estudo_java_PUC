public class Serie extends ConteudoNetflix{

    public Serie(String titulo, double duracao) {
        super(titulo, duracao);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo a serie: " + this.titulo);
    }
}
