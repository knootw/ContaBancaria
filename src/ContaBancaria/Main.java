package ContaBancaria;

public class Main {
    public static void main(String[] args){
        Conta c  = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.aplicaTaxa(c);
        adc.aplicaTaxa(cc);
        adc.aplicaTaxa(cp);

        System.out.println("Total Banco: " + adc.getSaldoTotal());
    }
}