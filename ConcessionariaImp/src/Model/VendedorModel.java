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
public class VendedorModel extends FuncionarioModel{
    int porcentagemComissao;

    public VendedorModel(String cpfFuncionario, float salarioFixo, String nome, String telefone, int porcentagemComissao) {
        this.cpfFuncionario = cpfFuncionario;
        this.salarioFixo = salarioFixo;
        this.nome = nome;
        this.telefone = telefone;
        this.porcentagemComissao = porcentagemComissao;
    }
    
    public int getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(int porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }
    
    
}
