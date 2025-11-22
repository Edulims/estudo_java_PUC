public abstract class ConteudoNetflix {
    protected String titulo;
    protected double duracao;

    public ConteudoNetflix(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    abstract public void reproduzir();


}
