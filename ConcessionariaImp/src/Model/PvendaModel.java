/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author guilhermemarx14
 */
public class PvendaModel extends VeiculoModel{
    float precoVenda;

    public PvendaModel(int km, int situacao, String placa, String tipo, String modelo, String montadora, ArrayList<String> cor, float precoVenda) {
        this.km = km;
        this.situacao = situacao;
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
        this.montadora = montadora;
        this.cor = cor;
        this.precoVenda = precoVenda;
    }
    
    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
}
