package org.example;

public class contoBancario {

    Double saldo;

    public void Preleva(Double prelievo) throws SaldoInsufficienteException{
        if (saldo-prelievo <0){
            throw new SaldoInsufficienteException(saldo, prelievo);
        }else{
            saldo = saldo-prelievo;
        }
    }
}
