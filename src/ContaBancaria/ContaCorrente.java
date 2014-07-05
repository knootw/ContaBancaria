package ContaBancaria;

public class ContaCorrente extends Conta{
    public void atualizaTaxa(double taxa){
        super.atualizaTaxa(taxa * 2);
    }

    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}