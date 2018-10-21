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
public class PaluguelModel extends VeiculoModel{
    float precoFixo;
    float precoPorKm;
    
    public PaluguelModel(int km, int situacao, String placa, String tipo, String modelo, String montadora, ArrayList<String> cor, float precoFixo, float precoPorKm) {
        this.km = km;
        this.situacao = situacao;
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
        this.montadora = montadora;
        this.cor = cor;
        this.precoFixo = precoFixo;
        this.precoPorKm = precoPorKm;
    }

    public float getPrecoFixo() {
        return precoFixo;
    }

    public void setPrecoFixo(float precoFixo) {
        this.precoFixo = precoFixo;
    }

    public float getPrecoPorKm() {
        return precoPorKm;
    }

    public void setPrecoPorKm(float precoPorKm) {
        this.precoPorKm = precoPorKm;
    }
    
    
}
