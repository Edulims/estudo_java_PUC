import java.util.ArrayList;

public class Usuario {
    // 1. Atributo (O dado que o Usuário armazena)
    // Esta é a parte mais importante!
    // É uma lista (ArrayList) que SÓ pode guardar objetos do tipo "Post".
    private ArrayList<Post> feedNoticias;

    // Construtor
    public Usuario() {
        // MUITO IMPORTANTE: Quando um novo usuário é criado,
        // sua lista de posts deve ser inicializada (criada e vazia).
        this.feedNoticias = new ArrayList<Post>();
    }

    // Ação de criar um novo post
    public void postar(String texto) {
        // 1. Cria um NOVO objeto Post usando o construtor da classe Post
        Post novoPost = new Post(texto);
        // 2. Adiciona esse novo post à lista (feed) do usuário
        this.feedNoticias.add(novoPost);
    }

    // Ação de curtir um post no feed
    public void curtirPost(int index) {
        // "index" é a posição do post na lista (começa em 0)
        // 1. Verifica se a posição é válida (existe na lista)
        if (index >= 0 && index < feedNoticias.size()) {
            // 2. Pega o post específico da lista
            Post postParaCurtir = feedNoticias.get(index);
            // 3. Pede para o PRÓPRIO post executar sua ação "curtir()"
            postParaCurtir.curtir();
        }
    }

    // Ação de compartilhar (mesma lógica de "curtirPost")
    public void compartilharPost(int index) {
        if (index >= 0 && index < feedNoticias.size()) {
            // Pega o post e manda ele se compartilhar
            feedNoticias.get(index).compartilhar();
        }
    }

    // Ação de mostrar o feed inteiro no console
    public void imprimirFeed() {
        // "for (Post post : feedNoticias)" é um "for-each loop".
        // Ele "visita" cada post dentro da lista "feedNoticias".
        for (Post post : feedNoticias) {
            // 1. Para cada post, ele tenta imprimir o objeto
            // 2. O Java automaticamente chama o método "toString()" do post
            System.out.println(post);
            System.out.println(); // Adiciona uma linha em branco para separar
        }
    }

    public static void main(String[] args) {
        // 1. Cria um NOVO objeto Usuario.
        // O construtor do Usuario é chamado, criando um feedNoticias vazio.
        Usuario usuario = new Usuario();

        // 2. O usuário faz três postagens.
        // Cada chamada a "postar" cria um novo objeto "Post"
        // e o adiciona na lista "feedNoticias".
        usuario.postar("Primeiro post!"); // Posição (index) 0
        usuario.postar("Outro post interessante!"); // Posição (index) 1
        usuario.postar("Gosto muito quando o código finalmente funciona!"); // Posição (index) 2

        // 3. O usuário interage com os posts.

        // Curte o post na posição 0 ("Primeiro post!")
        // O contador de curtidas desse post vai de 0 para 1.
        usuario.curtirPost(0);

        // Compartilha o post na posição 1 ("Outro post interessante!")
        // O contador de compartilhamentos desse post vai de 0 para 1.
        usuario.compartilharPost(1);

        // 4. O usuário visualiza seu feed.
        // O método "imprimirFeed" vai percorrer a lista e
        // imprimir cada post usando seu método "toString()".
        usuario.imprimirFeed();
    }
}

