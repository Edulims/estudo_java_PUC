public class InventarioRPG {
    public static void main(String[] args) {

        // 1. Criando o vetor com 4 "slots" (índices 0, 1, 2, 3)
        int[] cintoDePocoes = new int[4];

        // 2. Preenchendo os slots, um por um
        cintoDePocoes[0] = 20;  // Slot 0
        cintoDePocoes[1] = 50;  // Slot 1
        cintoDePocoes[2] = 20;  // Slot 2
        cintoDePocoes[3] = 100; // Slot 3

        System.out.println("Conteúdo do Cinto de Poções:");

        // 3. Listando o conteúdo com um loop 'for'
        // 'cintoDePocoes.length' é 4. O loop vai rodar para i = 0, 1, 2 e 3.
        for (int i = 0; i < cintoDePocoes.length; i++) {

            // Acessamos o valor que está no slot [i]
            int hpDaPocao = cintoDePocoes[i];

            System.out.println("Slot [" + i + "]: Poção de " + hpDaPocao + " HP");
        }
    }
}