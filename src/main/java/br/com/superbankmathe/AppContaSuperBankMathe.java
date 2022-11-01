package br.com.superbankmathe;

import br.com.superbankmathe.model.ContaCorrente;
// import br.com.superbankmathe.service.ContaService;

public class AppContaSuperBankMathe {
    public static void main(String[] args) throws Exception {
        
        /**
         * criação de contas
         */

         ContaCorrente contaUser01 = new ContaCorrente();

        contaUser01.cadastrarCliente();
        contaUser01.depositar(100);
        contaUser01.sacar(50);
        contaUser01.imprimirExtrato();

        ContaCorrente contaUser02 = new ContaCorrente();

        contaUser02.cadastrarCliente();
        contaUser02.depositar(100);
        contaUser02.sacar(50);
        contaUser02.imprimirExtrato();

        ContaCorrente contaUser03 = new ContaCorrente();

        contaUser03.cadastrarCliente();
        contaUser03.depositar(100);
        contaUser03.transferir(10, contaUser02);
        contaUser03.sacar(50);
        contaUser03.imprimirExtrato();


    }
}
