import br.unipar.ContaCorrente;

import br.unipar.ContaPoupanca;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;


public class ContaBancariaTeste {

    //Conta Corrente
    @Test
    public void testeDepositoContaCorrente(){
    ContaCorrente conta = new ContaCorrente();
    conta.depositar( 5000d);

    assertEquals(conta.obterSaldo(),5000);
    }

    @Test
    public void testeSaqueContaCorrente(){

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1000d);

        assertTrue(validacao);
        assertEquals(conta.obterSaldo(), 2000d);
    }

    @Test
    public void testeDepositoContaPoupanca(){

        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1200d);

        assertTrue(validacao);
        assertEquals(conta.obterSaldo(),1800);
    }

    @Test
    public void testeSaqueContaPoupanca(){
      ContaPoupanca conta = new ContaPoupanca();
      conta.depositar(3000d);
      boolean validacao = conta.saque(1400d);

      assertTrue(validacao);
      assertEquals(conta.obterSaldo(), 1600);

    }

    @Test
    public void testeSaqueMaiorContaPoupanca(){

        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
                boolean validacao = conta.saque(3000d);

        assertFalse(validacao);
        assertEquals(3000, conta.obterSaldo());
    }








    }
