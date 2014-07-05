package ContaBancaria;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public double getSelic() {
        return selic;
    }

    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    public void aplicaTaxa(Conta c){
        imprimeSaldoAnterior(c);
        c.atualizaTaxa(this.selic);
        imprimeSaldoAtual(c);

        this.saldoTotal += c.getSaldo();
    }

    private void imprimeSaldoAtual(Conta c) {
        System.out.println("Saldo Final: " + c.getSaldo());
    }

    private void imprimeSaldoAnterior(Conta c) {
        System.out.println("Saldo Anterior: " + c.getSaldo());
    }

    public double getSaldoTotal(){
        return saldoTotal;
    }
}