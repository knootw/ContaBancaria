package ContaBancaria;

public class ContaPoupanca extends Conta{
    public void atualizaTaxa(double taxa){
        super.atualizaTaxa(taxa * 3);
    }
}