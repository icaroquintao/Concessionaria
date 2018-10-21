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
public class RevisaoModel {
    int idRevisao;
    boolean efetivado;
    float valorConserto;
    DataModel dataRevisao;
    ClienteModel cliente;
    float valorRevisao;
    VeiculoModel veiculo;
    MecanicoModel mecanico;

    public RevisaoModel(){}
    
    public RevisaoModel(boolean efetivado, float valorConserto, DataModel dataRevisao, ClienteModel cliente, float valorRevisao, VeiculoModel veiculo, MecanicoModel mecanico) {
        this.efetivado = efetivado;
        this.valorConserto = valorConserto;
        this.dataRevisao = dataRevisao;
        this.cliente = cliente;
        this.valorRevisao = valorRevisao;
        this.veiculo = veiculo;
        this.mecanico = mecanico;
    }

    public int getIdRevisao() {
        return idRevisao;
    }

    public void setIdRevisao(int idRevisao) {
        this.idRevisao = idRevisao;
    }

    public boolean isEfetivado() {
        return efetivado;
    }

    public void setEfetivado(boolean efetivado) {
        this.efetivado = efetivado;
    }

    public float getValorConserto() {
        return valorConserto;
    }

    public void setValorConserto(float valorConserto) {
        this.valorConserto = valorConserto;
    }

    public DataModel getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(DataModel dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public float getValorRevisao() {
        return valorRevisao;
    }

    public void setValorRevisao(float valorRevisao) {
        this.valorRevisao = valorRevisao;
    }

    public VeiculoModel getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoModel veiculo) {
        this.veiculo = veiculo;
    }

    public MecanicoModel getMecanico() {
        return mecanico;
    }

    public void setMecanico(MecanicoModel mecanico) {
        this.mecanico = mecanico;
    }
    
    
}
