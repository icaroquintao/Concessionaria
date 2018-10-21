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
public class CompraVendaModel {
    int idCompraVenda;
    ClienteModel cliente;
    DataModel dataCompraVenda;
    VendedorModel vendedor;
    PvendaModel veiculo;

    public CompraVendaModel(){}
    
    public CompraVendaModel(ClienteModel cliente, DataModel dataCompraVenda, VendedorModel vendedor, PvendaModel veiculo) {
        this.cliente = cliente;
        this.dataCompraVenda = dataCompraVenda;
        this.vendedor = vendedor;
        this.veiculo = veiculo;
    }

    
    
    public int getIdCompraVenda() {
        return idCompraVenda;
    }

    public void setIdCompraVenda(int idCompraVenda) {
        this.idCompraVenda = idCompraVenda;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public DataModel getDataCompraVenda() {
        return dataCompraVenda;
    }

    public void setDataCompraVenda(DataModel dataCompraVenda) {
        this.dataCompraVenda = dataCompraVenda;
    }

    public VendedorModel getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorModel vendedor) {
        this.vendedor = vendedor;
    }

    public PvendaModel getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(PvendaModel veiculo) {
        this.veiculo = veiculo;
    }
    
    
}
