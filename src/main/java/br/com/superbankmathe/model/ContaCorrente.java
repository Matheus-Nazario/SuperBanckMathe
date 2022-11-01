package br.com.superbankmathe.model;

import br.com.superbankmathe.service.ContaService;

public class ContaCorrente extends ContaService {


    public void imprimirExtrato() {

        System.out.println("--------------------------------------");
        System.out.println("-------Extrato Conta Corrente--------");
        super.imprimirDadosConta();

    }

}