package String;

public class Main {
    public static void main(String[] args) {
        String ola = "Olá"; // Declara e instancia diretamente

        String nome1 = new String("Maria"); // Instancia com new
        String nome2 = new String("João"); // Instancia com new

        // Declara e instancia com a concatenação de strings
        String saudacao = ola + ", " + nome1 + "!\n\n";
        System.out.println(saudacao);

        // altera o valor de saudacao pela atribuição do valor de ola
        // não é preciso declarar saudacao novamente
        saudacao = ola;

        // altera o valor de saudacao, que recebe
        // o resultado da concatenacao de mais strings
        // String.concat(String s):
        saudacao = saudacao.concat(", " + nome2);
        saudacao = saudacao.concat("!\n\n");

        // Mais uma alternativa de concatenação
        System.out.println(saudacao + "fim");

    }
}
