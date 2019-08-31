/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Musica;

import java.util.ArrayList;
import testezinho.Contato;

/**
 *
 * @author natal
 */
public class Compositor {
    
    protected ArrayList <Compositor> compositor;
    private int cpf;
    
    
    
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public String toString(){
        return "Cpf: " + cpf;
    }

    Object getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
