import java.util.ArrayList;

public class Playlist extends Midia{
    private ArrayList<Midia> listaDeMusica;

    public Playlist() {
        this.listaDeMusica = new ArrayList<Midia>();
    }

    public void adicionarMidia(Midia media) {
        this.listaDeMusica.add(media);
    }

    public void tocarPlaylist() {
        for (Midia media : listaDeMusica) {
            media.play();
        }
    }



}
