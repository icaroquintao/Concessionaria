/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import static cliente.Cliente.banco;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmiinterfaces.ClienteBancoIdsInterface;
import rmiinterfaces.ClienteClienteInterface;

/**
 *
 * @author guilhermemarx14
 */
public class ClienteThread2  extends UnicastRemoteObject implements Runnable{
    static ClienteClienteInterface interf;
    static ClienteBancoIdsInterface banco;
    
    public ClienteThread2() throws Exception{
        super();
    }
    
    @Override
    public void run() {
        while(true){
        try{
            banco = (ClienteBancoIdsInterface) Naming.lookup("//localhost/BancoId");

        String mensagem;
        int idAtual;
        if(Cliente.idsMensagens.isEmpty())
            idAtual = 0;
        else
            idAtual = Cliente.idsMensagens.get(Cliente.idsMensagens.size()-1);
        
        if(idAtual == banco.getId()-1)
            continue;
        while( idAtual < banco.getId()-1){
            String nome = banco.getName(idAtual);
            interf = (ClienteClienteInterface) Naming.lookup("//localhost/"+nome);
            mensagem = interf.getScript(idAtual);
            System.out.println(mensagem);
            Cliente.idsMensagens.add(idAtual);
            Cliente.mensagens.add(mensagem);
            idAtual++;
            
        }
        
        
         }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
}
