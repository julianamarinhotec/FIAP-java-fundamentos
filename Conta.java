public class Conta {

	private double saldo;
    private int numero;
    private String clienteNome;
    private int idade;

    public static void main(String[] args) {
        String clienteNome;
        byte idade, numero;
        double saldo;

		Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.50;
        contaCorrente.clienteNome = "Leandro";
        contaCorrente.idade = 36;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30.87;
        contaPoupanca.clienteNome = "Joaquim";
        contaPoupanca.idade = 52;

        contaInvestimento.numero= 48;
        contaInvestimento.saldo = 70.92;
        contaInvestimento.clienteNome = "Ana";
        contaInvestimento.idade= 34;

        System.out.println("\nOlá! Sejam Bem vindos ao Banco Lindo!\n ");
        System.out.println("Cliente: " + contaCorrente.clienteNome);
        System.out.println("Número da conta:  " + contaCorrente.numero);
        System.out.println("Saldo CC: R$ " + contaCorrente.saldo);
        System.out.println("Idade correntista: " + contaCorrente.idade + " anos");

        System.out.println("\nCliente: " + contaPoupanca.clienteNome);
        System.out.println("Número da conta:  " + contaPoupanca.numero);
        System.out.println("Saldo CC: R$ " + contaPoupanca.saldo);
        System.out.println("Idade correntista: " + contaPoupanca.idade + " anos" );

        System.out.println("\nCliente: " + contaInvestimento.clienteNome);
        System.out.println("Número da conta:  " + contaInvestimento.numero);
        System.out.println("Saldo CC: R$ " + contaInvestimento.saldo);
        System.out.println("Idade correntista: " + contaInvestimento.idade + " anos");


    }
}