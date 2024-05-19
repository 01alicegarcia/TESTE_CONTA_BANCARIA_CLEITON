package br.unipar;

public class ContaCorrente extends HerancaContaBancaria {

    @Override
    public boolean saque(Double valor) {


        if (saldo >= valor) {
            saldo -= valor;


            return true;
        } else {

            System.out.println("Seu saque precisa ser menor do que o saldo para ser realizado!");
            return false;
        }
    }
}
