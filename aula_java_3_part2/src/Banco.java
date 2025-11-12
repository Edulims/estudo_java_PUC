public class Banco {
    public static void main(String[] args) {
        // Cria objetos da classe Conta
        Conta cta1 = new Conta();
        Conta cta2 = new Conta();

        //código para alterar o saldo da cta1
        cta1.setSaldo(30.30);
        //código para alterar o nome do dono da cta1
        cta1.setDono("EduardoL");
        //código para alterar o saldo da cta2
        cta2.setSaldo(13.13);
        //código para alterar o nome do dono da cta2
        cta2.setDono("FabioL");
        System.out.println("Cta 1 - Correntista: " + cta1.getDono());
        System.out.println("Cta 1 - Saldo: " + cta1.getSaldo());

        System.out.println("Cta 2 - Correntista: " + cta2.getDono());
        System.out.println("Cta 2 - Saldo: " + cta2.getSaldo());
    }
}