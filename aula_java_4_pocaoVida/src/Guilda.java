public class Guilda {
    public static void main(String[] args) {

        Aventureiro[] guilda = new Aventureiro[3];

        Aventureiro aventureiro1 = new Aventureiro("Aragorn" , "Guerreiro");
        Aventureiro aventureiro2 = new Aventureiro("Gandalf" , "Mago");
        Aventureiro aventureiro3 = new Aventureiro("Legolas" , "Arqueiro");

        guilda[0] = aventureiro1;
        guilda[1] = aventureiro2;
        guilda[2] = aventureiro3;

        for (int i = 0; i < guilda.length; i++) {
            guilda[i].apresentar();
        }

    }
}
