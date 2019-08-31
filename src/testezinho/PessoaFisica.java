/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testezinho;

/**
 *
 * @author natal
 */
public class PessoaFisica extends Pessoa {
    
    private int cpf;
    
    public PessoaFisica(String nome, int telefone, int cpf){
        super(nome, telefone);
        this.cpf = cpf;
    }
    
    public int getCpf(){
        return cpf;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public String toString(){
        return "Cpf: " + cpf;
    }
    
}
