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
public class DataModel {
    int dia, mes, ano;
    
    
    public DataModel(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String toString(){
        return "" + dia + "/" + mes + "/" + ano;
    }
    
    public static DataModel toData(String data){
        return new DataModel(Integer.parseInt(data.substring(0,1)), Integer.parseInt(data.substring(3,4)), Integer.parseInt(data.substring(6,9)));
    }
}
