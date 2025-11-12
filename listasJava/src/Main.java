import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList<String> carros = new ArrayList<String>(); // criando uma lista dp tipo string, com nome de carros
    carros.add("Fiat"); // adicionando elementos na lista carros
    carros.add("Ford");
    carros.add("VW");
    carros.add("Chevrolet");

    for (String i : carros) // percorre a lista carros com o elemento i
    System.out.println(i); // imprime o i que esta percorrendo a lista

    System.out.println(carros.size()); //tamanho da lista

    carros.set(0, "Ferrari"); // acessa um indice da lista e troca por um novo valor

    System.out.println(carros.get(0)); // acessar um indice, no caso imprime o indice acessado

    carros.clear(); // limpa a lista, elimina todos os elementos da lista
    System.out.println(carros.size()); // ver o tamanho da lista apos limpar


}