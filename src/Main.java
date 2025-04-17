public class Main {
    public static void main(String[] args) {
        Cliente wendel = new Cliente();
		wendel.setNome("Wendel");
		
		Conta cc = new ContaCorrente(wendel);
		Conta poupanca = new ContaPoupanca(wendel);

		cc.deposito(100);
		cc.transferencia(100, poupanca);
		
		cc.imprimirInformacoes();
		poupanca.imprimirInformacoes();
    }
}