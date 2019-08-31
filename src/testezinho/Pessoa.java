
package testezinho;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public abstract class Pessoa {
    
    protected ArrayList <Contato> contato;
    protected String nome;
    protected int telefone;
    
    public boolean adicionaContato(Contato c){
        return this.contato.add(c);
    }
    public boolean removeContato(Contato c){
        return this.contato.remove(c);
    }
    public boolean pesquisaContato(Contato c){
        return this.contato.contains(c);
    }
    public boolean apagaContato(Contato c){
        this.contato.clear();
        return false;
    }
    
    public Pessoa(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getTelefone(){
        return telefone;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public String toString(){
        return "Nome: " + nome + "Telefone: " + telefone;
    }
    
    public boolean equals(Object obj){
        if(this == obj){
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
            return false;
        }
        return true;
    }
}
