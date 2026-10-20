package org.example;

public class contoBancario {

    Double saldo;

    public contoBancario(Double saldo){
        this.saldo = saldo;
    }

    public void Preleva(Double prelievo) throws SaldoInsufficienteException, ImportoNonValidoException{
        if(prelievo <0){
            throw new ImportoNonValidoException();
        }
        else if (saldo-prelievo <0){
            throw new SaldoInsufficienteException(saldo, prelievo);
        }else{
            saldo = saldo-prelievo;
        }
    }
}
