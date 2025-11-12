public class esquadraoEstrelar {
    public static void main(String[] args) {

        // 1. e 2. Criando e preenchendo o vetor de nomes
        String[] esquadrao = new String[5];
        esquadrao[0] = "Luke";
        esquadrao[1] = "Han";
        esquadrao[2] = "Leia";
        esquadrao[3] = "Luke";
        esquadrao[4] = "Chewie";

        // 3. Criando o contador
        int totalDeLukes = 0;

        System.out.println("Inspecionando o esquadrão...");

        // 4. Fazendo o loop
        for (int i = 0; i < esquadrao.length; i++) {

            // Pegamos o nome do soldado no slot [i]
            String nomeDoSoldado = esquadrao[i];

            // 5. Verificando o nome
            if (nomeDoSoldado.equals("Luke")) {
                // Encontramos! Aumenta o contador
                totalDeLukes++; // Isso é o mesmo que totalDeLukes = totalDeLukes + 1;
                System.out.println("Encontrei um Luke no slot " + i);
            }
        }

        // 6. Imprimindo o resultado final
        System.out.println("Inspeção completa. Total de soldados 'Luke': " + totalDeLukes);
    }
}