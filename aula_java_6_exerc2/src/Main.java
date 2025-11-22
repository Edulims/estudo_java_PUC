public class Main {
    static void main(String[] args) {
        Musica musica1 = new Musica();
        Podcast podcast1 = new Podcast();

        System.out.println("=== Player de Musica ===");
        musica1.play();
        musica1.pause();
        musica1.next();
        musica1.previous();

        System.out.println("\n=== Player Podcast ===");
        podcast1.play();
        podcast1.pause();
        podcast1.next();
        podcast1.previous();
    }
}
