package br.com.superbankmathe.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(){
        
    }
}