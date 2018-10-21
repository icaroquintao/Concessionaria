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
public class MecanicoModel extends FuncionarioModel {
    float comissaoPorRevisao;
    
    public MecanicoModel(String cpfFuncionario, float salarioFixo, String nome, String telefone, float comissaoPorRevisao) {
        this.cpfFuncionario = cpfFuncionario;
        this.salarioFixo = salarioFixo;
        this.nome = nome;
        this.telefone = telefone;
        this.comissaoPorRevisao = comissaoPorRevisao;
    }

    public float getComissaoPorRevisao() {
        return comissaoPorRevisao;
    }

    public void setComissaoPorRevisao(float comissaoPorRevisao) {
        this.comissaoPorRevisao = comissaoPorRevisao;
    }
    
    
}
