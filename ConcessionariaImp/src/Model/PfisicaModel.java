/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author guilhermemarx14
 */
public class PfisicaModel extends ClienteModel{
    String cpf;

    public PfisicaModel(){}
    
    public PfisicaModel(String telefone, String nome, String cep, String complemento, String numero, String numCartao, String numConta, String cpf) {
        this.telefone = telefone;
        this.nome = nome;
        this.cep = cep;
        this.complemento = complemento;
        this.numero = numero;
        this.numCartao = numCartao;
        this.numConta = numConta;
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
