package br.com.superbankmathe.model;

/**
 * Classe que representa o modelo dos atributos no SuperBank Mathe.
 *
 * @author Matheus Nazario
 * @version 0.1
 */


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Conta {

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;
    private int totalNumeroConta;
    

    private static int total = 0;
    private static int agenciaPadrao = 0;
    private static int sequancial = 0;


    public Conta() {
        Conta.total++;
        Conta.agenciaPadrao++;
        Conta.sequancial++;
        this.setTotalNumeroConta(total);
        this.setAgencia(agenciaPadrao);
        this.setNumero(sequancial);
        this.setSaldo(0); 
    }


}