class Post {
    // 1. Atributos (Os dados que um Post armazena)
    private String texto; // private: Só a própria classe Post pode mexer diretamente
    private int quantidadeDeCurtidas;
    private int quantidadeDeCompartilhamentos;

    // 2. Construtor (O "portal de criação")
    // É chamado automaticamente quando você usa "new Post(...)"
    public Post(String texto) {
        this.texto = texto; // Salva o texto que foi recebido
        // Um novo post sempre começa com 0 curtidas e 0 compartilhamentos
        this.quantidadeDeCurtidas = 0;
        this.quantidadeDeCompartilhamentos = 0;
    }

    // 3. Métodos (As "ações" que um Post pode fazer)

    // Ação de curtir: Aumenta o contador interno em 1
    public void curtir() {
        this.quantidadeDeCurtidas++; // "++" é um atalho para "aumentar em 1"
    }

    // Ação de compartilhar: Aumenta o contador interno em 1
    public void compartilhar() {
        this.quantidadeDeCompartilhamentos++;
    }

    // 4. Método Especial: toString
    // Converte o objeto Post em um texto (String) legível.
    // É chamado automaticamente quando você tenta imprimir um objeto Post.
    public String toString() {
        return "Post: " + texto + "\nCurtidas: " + quantidadeDeCurtidas +
                "\nCompartilhamentos: " + quantidadeDeCompartilhamentos;
    }
}