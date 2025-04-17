public interface IConta {
    void saque(double saldo);
    void deposito(double saldo);
    void transferencia(double valor, Conta contaDestino);
    void imprimirInformacoes();

}
