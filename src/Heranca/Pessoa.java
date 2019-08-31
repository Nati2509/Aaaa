
package Heranca;

import java.util.ArrayList;

// prova: interface? menu? questoes de assinalar?

public class Pessoa {
    
    protected ArrayList <Contato> contato;
    protected String nome;
    protected int telefone;
    protected int idade;
    
    public boolean adicionaContato(Contato c){
        return this.contato.add(c);
    }
    
    public boolean removeContato(Contato c){
        return this.contato.remove(c);
    }
    public boolean existeContato(Contato c){
        return this.contato.contains(c);
    }
    public boolean apagaContatos(Contato c){
        this.contato.clear();
        return false;
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
   
   public int getIdade(){
       return idade;
   }
   public void setIdade(int idade){
       this.idade = idade;
   }
   
   public Pessoa(String nome, int telefone, int idade){
       this.nome = nome;
       this.telefone = telefone;
       this.idade = idade;
       
   }
   
    @Override
   public String toString() {
    return "Nome: " + nome + "Telefone: " + telefone + "Idade: " + idade;
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
       if(this.nome != other.getNome()){
           return false;
       }
       return true;
    }
}
  

   
        
    
    
    
