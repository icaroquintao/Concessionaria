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
public class TrocaModel {
    CompraVendaModel venda;
    CompraVendaModel compra;

    public TrocaModel(CompraVendaModel venda, CompraVendaModel compra) {
        this.venda = venda;
        this.compra = compra;
    }

    public CompraVendaModel getVenda() {
        return venda;
    }

    public void setVenda(CompraVendaModel venda) {
        this.venda = venda;
    }

    public CompraVendaModel getCompra() {
        return compra;
    }

    public void setCompra(CompraVendaModel compra) {
        this.compra = compra;
    }
    
    
}
