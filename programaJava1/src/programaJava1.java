public class programaJava1 { // Definição da classe principal

    public static void main(String[] args) { // Método principal onde o programa começa
    // Sintaxe e Estrutura do Código Java
        System.out.println("Olá Estudante..."); // Saída no console

        // Comentários
        // Este é um comentário de uma linha
        /* Comentario e multiplas linhas
        varias linhas */

        // tipos de Dados e variáveis
        System.out.println("tipos de dados e variáveis");
        int inteiro = 10;
        double decimal = 5.763;
        char caractere = 'a'; // aspas simples
        boolean booleano = true; // verdadeiro ou falso, 1 ou 0

        System.out.println("int: " + inteiro + ", double: " + decimal + ", char: " + caractere + ", boolean: " + booleano );


        // operadores Aritméticos e Booleanos
        System.out.println("Operadores Aritméticos e Booleanos");
        int soma = 5 + 3; // soma
        int subtracao = 5 - 3; // subtracao
        int multiplicacao = 5 * 3; // multiplicação
        int divisao = 5 / 3; // divisão

        boolean maiorQue = 5 > 3; // operador booleano (maior que)
        System.out.println("soma: " + soma + ", subtração: " + subtracao + ", multiplicação: " + multiplicacao + ", divisão: " + divisao + ", maior que: " + maiorQue );

        // Operadores Lógicos e Binários
        System.out.println("Operadores Lógicos e Binários");
        boolean eLogico = (5 > 3) && (3 > 1); // operador lógico E (&&)
        boolean ouLogico = (5 > 3) || (3 > 1); //operador lógico Ou (||)
        int binarioE = 5 & 3; // operador binário E (&)
        int binarioOu = 5 | 3; //operador binario Ou (|)

        System.out.println("E lógico: " + eLogico + ", Ou lógico: " + ouLogico + ", E binário: " + binarioE + ", OU binário: " + binarioOu);

        //estrutura de controle
        System.out.println("Estrutura de controle");
        int numero = 5;
        if (numero > 0) { // condicao if
            System.out.println("Número é positivo.");
        } else {
            System.out.println("O número é negativo");
        }

        switch (numero){ // estrutura switch
            case 2:
                System.out.println("Número é 2");
                break;
            case 5:
                System.out.println("Número é 5");
                break;
            default:
                System.out.println("Número não é 2 ou 5");
        }


        //casting e conversão de tipos
        System.out.println("casting e conversão de tipos");
        double valorDouble = 6.15;
        int valorInt = (int) valorDouble; // casting explícito de double para int
        System.out.println("Double: " + valorDouble + ", convertido para int: " + valorInt);

        //String e manipulação de texto
        System.out.println("string e manipulação de texto");
        String texto = "Programação Java"; //declarando uma String
        int comprimento = texto.length(); //obtendo o comprimento de uma string
        String minuscula = texto.toLowerCase(); //convertendo para minusculas
        String maiscula = texto.toUpperCase(); //convertendo para maíusculas
        System.out.println("Texto original: " + texto + ", Comprimento: " + comprimento + ", Minúscula: " + minuscula + ", Maiúscula: " + maiscula);

        //Arrays e estruturas de dados
        System.out.println("Arrays e estrutura de dados");
        int[] numeros = {6,7,8,9,10}; // definindo um arrays de inteiros
        for (int n : numeros) { //usando loop for each para iterar pelo array
            System.out.println(n + " "); //exibindo cada elemento do array
        }


    }

}
