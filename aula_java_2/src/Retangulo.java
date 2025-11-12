/*
public class Retangulo {
    // atributos
    float altura;
    float comprimento;

    // metodos
    Retangulo(float alturaInicial) { // Construtor - criando um valor padrão para comprimento
        this.altura = alturaInicial;
        this.comprimento = 10.0f;
    }

    Retangulo(float alturaInicial, float comprimentoInicial) { // Construtor - valores obrigatorios
        this.altura = alturaInicial;
        this.comprimento = comprimentoInicial;
    }

    float calcPerimetro () {
        return (2*altura) + (2*comprimento);
    }

    float calcArea() {
        return altura * comprimento;
    }

    void imprimirDados() {
        float p;
        p = calcPerimetro();
        System.out.println("Retângulo: ");
        System.out.println("- altura: " + altura);
        System.out.println("- largura: " + comprimento);
        System.out.println("- perímetro: " + p);
    }

    // ponto de partida do código
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao mundo dos retângulos!");

        // usou o contrutor - informou os valores obrigatorios
        Retangulo ret1 = new Retangulo(5.2f, 12.5f);
        System.out.println(ret1.calcPerimetro());
        System.out.println(ret1.calcArea());

        // usou o contrutor com valor padrão de altura, pq não informou altura
        Retangulo ret2 = new Retangulo(10.3f);
        System.out.println(ret2.calcPerimetro());
        System.out.println(ret2.calcArea());
        ret2.imprimirDados();

    }

}
 */

public class Retangulo {
    // Atributos da classe = ESTADO da classe
    float altura;
    float largura;

    public Retangulo (float alt, float larg) { // Define o método construtor
        altura = alt;
        largura = larg;
    }
    // Métodos da classe = COMPORTAMENTO da classe
    float calcularPerimetro() {
        float pm;                 // variável local
        pm = 2 * altura + 2 * largura;
        return pm;
    }
    void imprimirDados() {
        float p;                   // variável local
        p = calcularPerimetro();   // calcula o perímetro do retângulo
        System.out.println("Retângulo: ");
        System.out.println("- altura:    " + altura);
        System.out.println("- largura:   " + largura);
        System.out.println("- perimetro: " + p);
    }
    // Método principal - início de execução do programa
    public static void main(String[] args) {
        System.out.println("Mundo dos retângulos");

        // Objeto de Retangulo retg1
        Retangulo retg1;         // referência de objeto da classe Retangulo
        retg1 = new Retangulo(10, 20); // instanciação da classe
        retg1.imprimirDados();   // invocação de método do objeto

        // Objeto de Retangulo retg2
        Retangulo retg2;         // referência de objeto da classe Retangulo
        retg2 = new Retangulo(5, 15); //instanciação
        retg2.imprimirDados();   // invocação de método do objeto
    }
}