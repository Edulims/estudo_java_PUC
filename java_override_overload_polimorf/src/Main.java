public class Main {
    public static void main(String[] args) {
        Veiculo carroDoVizinho = new Veiculo("Peugeot", "1.6 THP");
        Veiculo nossoCaminhao = new Caminhao( "Volvo", "Motor CHV 6.0", 8, 100);

        carroDoVizinho.getDetalhes();
        nossoCaminhao.getDetalhes();

        carroDoVizinho.getSom();
        nossoCaminhao.getSom();


    }
}