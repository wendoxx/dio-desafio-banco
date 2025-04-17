public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("==========Conta Corrente==========");
        super.imprimirInformacoes();
    }
}
