public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(1, "Frankstein", 59.90, "Mary Shelley", 270);
        Eletronico iphone = new Eletronico(2, "Iphone 16", 7899.99, "Apple", "ProMax");
        Roupa calca = new Roupa(3, "Calça Social Fit", 79.90, "M", "Cinza");

        System.out.println("Livro: " + livro.getNome() + ", Autor: " + livro.getAutor() + ", Preço: " + livro.getPreco());
        System.out.println("Eletronico: " + iphone.getNome() + ", Marca: " + iphone.getMarca() + ", Preço: " + iphone.getPreco());
        System.out.println("Roupa: " + calca.getNome() + ", Tamanho: " + calca.getTamanho() + ", Preço: " + calca.getPreco());
    }

}

