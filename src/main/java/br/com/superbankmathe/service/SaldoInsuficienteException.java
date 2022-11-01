package br.com.superbankmathe.service;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String menssage ) {
        super(menssage);
    }
}