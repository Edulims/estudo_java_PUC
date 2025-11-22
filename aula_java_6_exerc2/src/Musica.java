public class Musica implements Midia{
    public void play() {
        System.out.println("Tocando música...");
    }

    public void pause() {
        System.out.println("Música pausada.");
    }

    public void next() {
        System.out.println("Tocando próxima música...");
    }

    public void previous() {
        System.out.println("Tocando música anterior...");
    }
}
