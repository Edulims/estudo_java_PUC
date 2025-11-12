package usuarios;
import postagens.Postagem;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Usuario{
    // atributos
    private String nome;

    // Usuario cria postagens. Postagens feitas por Usuario.
    // associação: Ligação/conexão entre classes.
    // agregação: Usuario TEM VÁRIAS postagens.
    // composição (agregação nivel 2): Postagem PERTENCE a um Usuario.
    //                                 Postagem NÃO PODE EXISTIR sem um Usuario.
    private List<Postagem> listaPostagens;

    // Usuario possui um usuarioFavorito. usuarioFavorito é o preferido do usuario.
    // associação: Ligação/conexão entre classes.
    // agregação: Usuario TEM um Usuario favorito
    // NÃO É UMA COMPOSIÇÃO: usuarioFavorito EXISTE SEM O USUARIO.
    private Usuario usuarioFavorito;

    public  String getNome() {
        return this.nome;
    }

    public List<Postagem> getListaPostagens() {
        return this.listaPostagens;
    }

    // Construtor
    public Usuario(String nomeUsuario){
        this.nome = nomeUsuario;
        this.listaPostagens = new ArrayList<Postagem>();
    }

    public boolean criarPostagem() {
        listaPostagens.add(new Postagem());
        return true;
    }

    public void mostrarPostagens() {
        if (listaPostagens.isEmpty()){ // mesmo que colocar listaPostagens.size() == 0
            System.out.println("Lista de postagem vazia!");
            return;
        }

        // Faz o mesmo que o for padrao
        for (Postagem post: listaPostagens){
            post.setCurtidas(-10000);
            post.mostrarCurtidas();
        }

    }

    public void curtirPostagem(Postagem postagemAleatoria) {
        System.out.println("Usuário curtiu a postagem.");
        postagemAleatoria.adicionarCurtida();
        postagemAleatoria.mostrarCurtidas();
    }
}
