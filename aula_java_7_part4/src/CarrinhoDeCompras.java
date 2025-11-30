class CarrinhoDeCompras {
    private static int maximo = 10;
    private static int quantidade = 0;
    private static int inseridos = 0;
    private static int removidos = 0;
    private static double preco_unitario = 10.00;

    public static void inserir() {
        assert (quantidade < maximo); // PRÉ-CONDIÇÃO
        quantidade++;
        inseridos++;
        assert (quantidade == inseridos - removidos); // INVARIANTE
    }

    public static void remover() {
        assert (quantidade > 0); // PRÉ-CONDIÇÃO
        quantidade--;
        removidos++;
        assert (quantidade >= 0); // PÓS-CONDIÇÃO
        assert (quantidade == inseridos - removidos); // INVARIANTE
    }
}