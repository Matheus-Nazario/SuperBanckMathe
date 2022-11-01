package br.com.superbankmathe.service;

import br.com.superbankmathe.model.Cliente;
import br.com.superbankmathe.model.Conta;

import javax.swing.*;
import java.util.ArrayList;

public abstract class ContaService {


	Conta contaModelo = new Conta();
    Cliente clienteModelo = new Cliente();
    
    ArrayList<String> ListaCliente = new ArrayList<>();

    /**
     * Cadastrar os dados do titular da conta em uma lista
     * 
     */
    public void cadastrarCliente() {
        System.out.println();
        System.out.println("Criação da conta e dados do usuario");
        String nomeDoTitular = JOptionPane.showInputDialog("Nome do Titular: ");
        clienteModelo.setNome(nomeDoTitular);
        String profissaoDoTitular = JOptionPane.showInputDialog("Profissao do Titular: ");
        clienteModelo.setProfissao(profissaoDoTitular);
        String cpfDoTitular = JOptionPane.showInputDialog("CPF do Titular:: ");
        clienteModelo.setCpf(cpfDoTitular);

        System.out.println("nome do titular: " + nomeDoTitular );
        System.out.println("Profissao do titular: " + profissaoDoTitular );
        System.out.println("CPF do titular: " + cpfDoTitular );
        System.out.println();
        String[] ListaC = {nomeDoTitular, profissaoDoTitular, cpfDoTitular};

        ListaCliente.add(ListaC.toString());
    }

    /**
     * Para conseguir sacar o valor precisa ser maior do que o saldo.
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public  void sacar(double valor) throws SaldoInsuficienteException{
        if(contaModelo.getSaldo() < valor) {
            throw new SaldoInsuficienteException("Saldo: " + contaModelo.getSaldo()  + ", Valor: " + valor);
        } 
        
        contaModelo.setSaldo((contaModelo.getSaldo() - valor));       
    }
    
    /**
     * Depositar o valor na conta 
     * 
     * @param valor
     * 
     */
    public void depositar(double valor){
        try{
            double novoValor = valor + contaModelo.getSaldo();
            contaModelo.setSaldo(novoValor);
        }catch(NullPointerException e){
        }
    }


    /**
     * Transferir o valor de o valor de uma conta para a outra 
     * e o valor precisa ser maior do que o saldo.
     * @param valor
     * @param destino
     * @throws SaldoInsuficienteException
     */
    public void transferir(double valor, ContaService destino) throws SaldoInsuficienteException{
        this.sacar(valor);
        destino.depositar(valor);
    }

    /**
     * Imprimir dados da conta
     */
    public void imprimirDadosConta() {
        System.out.println();
        System.out.println(String.format("Titular da conta: %s", contaModelo.getTitular()));
        System.out.println(String.format("Agencia: %d", contaModelo.getAgencia()));
        System.out.println(String.format("numero: %d", contaModelo.getNumero()));
        System.out.println(String.format("saldo: %.2f", contaModelo.getSaldo()));
    }

    @Override
	public String toString() {
		return "Numero: " + contaModelo.getNumero() + ", Agencia: " + contaModelo.getAgencia();
	}

    
}