public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("==========Conta Poupanca==========");
        super.imprimirInformacoes();
    }

    
}
