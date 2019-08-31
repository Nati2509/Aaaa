
package Musica;

import java.util.ArrayList;
import testezinho.Livro;

/**
 *
 * @author natal
 */
public class Musica {
    
    protected ArrayList <Compositor> compositor = new ArrayList();
    protected String nome;
    protected int duracao;
    
    public boolean adicionaCompositor(Compositor c){
        return this.compositor.add(c);
    }
    
    public boolean removeCompositor(Compositor c){
        return this.compositor.remove(c);
    }
     public boolean pesquisaCompositor(String nome){
         for (Compositor compositor : compositor) {
           if (compositor.getNome().equals(nome))
               return true;
        }
        return false;
     }
     
    
    public Musica(String nome, int duracao){
        this.nome = nome;
        this.duracao = duracao;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
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
        final Musica other = (Musica)obj;
        if(this.nome != other.getNome()){
            return false;
        }
        return true;
        
    }
    
    public String toString(){
        return "Nome: " + nome + "Duracao: " + duracao;
    }
}
