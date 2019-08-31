
package Computadores;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Computadores {
    
    protected ArrayList <Computadores> c = new ArrayList();
    protected String nome;
    protected int cod;
    protected float preco;
    
    public Computadores(String nome, int cod, float preco){
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCod(){
        return cod;
    }
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.nome = nome;
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
        final Computadores other = (Computadores)obj;  
        if (this.cod != other.getCod()){
            return false;
        }
        return true;
            
        }
        
    public String toString(){
        return "nome: " + nome + "cod: " + cod + "Preco: " + preco;
    }
}
