
package Okay;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Pessoa {
    
    protected ArrayList<Contato> contatos = new ArrayList();
    protected String nome;
    protected int telefone;
    
    public boolean adicionar(Contato c){
        return this.contatos.add(c);
    }
    public boolean remover(Contato c){
        return this.contatos.remove(c);
    }
    public boolean pesquisa(Contato c){
        return this.contatos.contains(c);
    }
    
    public boolean apagatudo(Contato c){
        this.contatos.clear();
        return false;
    }
    
    public Pessoa (String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return  nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public int getTelefone(){
        return  telefone;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        
        if (getClass() != obj.getClass()){
            return false;
        }
        final Pessoa other = (Pessoa)obj;
        if (this.nome != other.getNome()){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return "nome: " + nome + "telefone: " + telefone;
    }
    
}
