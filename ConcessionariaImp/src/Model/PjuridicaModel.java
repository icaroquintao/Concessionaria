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
public class PjuridicaModel extends ClienteModel{
    String cnpj;

    public PjuridicaModel(){}
    
    public PjuridicaModel(String telefone, String nome, String cep, String complemento, String numero, String numCartao, String numConta, String cnpj) {
        this.telefone = telefone;
        this.nome = nome;
        this.cep = cep;
        this.complemento = complemento;
        this.numero = numero;
        this.numCartao = numCartao;
        this.numConta = numConta;
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
