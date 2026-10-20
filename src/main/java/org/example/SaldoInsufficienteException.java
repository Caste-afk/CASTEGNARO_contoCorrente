package org.example;

public class SaldoInsufficienteException extends Exception {

    Double saldo;
    Double prelievo;


    public SaldoInsufficienteException(Double saldo, Double prelievo) {
        super("Saldo insufficiente!");
        this.saldo = saldo;
        this.prelievo = prelievo;
    }

    public Double getSaldo(){ return saldo;}
    public Double getPrelievo(){ return prelievo;}
}
