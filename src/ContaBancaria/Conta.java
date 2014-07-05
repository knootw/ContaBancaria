package ContaBancaria;

public class Conta {
    protected double saldo;

    public void atualizaTaxa(double taxa){
        this.saldo += this.saldo * taxa;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }
}