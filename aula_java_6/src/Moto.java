public class Moto extends Veiculo implements FuncoesUsuario, RegistroSistema {
    private int cilindradas;

    public Moto(String marca, String motor, int cilindradas) {
        super(marca, motor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    // override: o metodo da classe pai, é modificada pela classe filho
    public String imprimir() {
        // chama o método da classe pai e acrescenta
        return super.imprimir() + " de " + getCilindradas() + " cilindradas.";
    }

    @Override
    public void getDetalhes() {
        System.out.println("A moto tem " + this.cilindradas + " cilindradas");
    }

    @Override
    public void mostrarResumoVeiculo() {
        System.out.println("Esta é uma mensagem de resumo do veiculo");
    }

    public int mostrarIdadeVeiculo() {
        System.out.println("Mostra a idade do veiculo");
        return 1;
    }

    public String retornarMensagemResumoVeiculo() {
        return "Mensagem";
    }

    @Override
    public void mostrarMensagemConfirmacaoCadastroVeiculoSistema() {
        System.out.println("MSG aleatoria");
    }

    @Override
    public void mostrarLogCadastroVeiculoSistema() {
        System.out.println("Texto de log");
    }
}