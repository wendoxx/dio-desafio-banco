public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    private int numero;
    private double saldo;
    private Cliente cliente;
    private int agencia;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numero = SEQUENCIAL ++;
        this.agencia = AGENCIA_PADRAO; 
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;
        
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;        
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {
        saldo += valor;
        contaDestino.deposito(valor);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}

