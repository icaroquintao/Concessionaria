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
public class AluguelModel {
    PaluguelModel veiculo;
    ClienteModel cliente;
    VendedorModel vendedor;
    RevisaoModel revisao;
    float valorTotal;
    int kmRodados;
    DataModel dataFim;
    DataModel dataInicio;
    float multaAtraso;
    boolean finalizado;

    public AluguelModel(PaluguelModel veiculo, ClienteModel cliente, VendedorModel vendedor, RevisaoModel revisao, float valorTotal, int kmRodados, DataModel dataFim, DataModel dataInicio, float multaAtraso, boolean finalizado) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.revisao = revisao;
        this.valorTotal = valorTotal;
        this.kmRodados = kmRodados;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
        this.multaAtraso = multaAtraso;
        this.finalizado = finalizado;
    }

    public PaluguelModel getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(PaluguelModel veiculo) {
        this.veiculo = veiculo;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public VendedorModel getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorModel vendedor) {
        this.vendedor = vendedor;
    }

    public RevisaoModel getRevisao() {
        return revisao;
    }

    public void setRevisao(RevisaoModel revisao) {
        this.revisao = revisao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public DataModel getDataFim() {
        return dataFim;
    }

    public void setDataFim(DataModel dataFim) {
        this.dataFim = dataFim;
    }

    public DataModel getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(DataModel dataInicio) {
        this.dataInicio = dataInicio;
    }

    public float getMultaAtraso() {
        return multaAtraso;
    }

    public void setMultaAtraso(float multaAtraso) {
        this.multaAtraso = multaAtraso;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    
    
    
}
