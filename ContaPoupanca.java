package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria{

    @Override
    public boolean saque(Double valor) {

        if((saldo - 5d) >= valor){
            saldo -= valor;

            System.out.println("Saque Efetuado!");

            return true;
        } else {
            System.out.println("Saque Inválido :( ");
            return false;
        }
    }
}
