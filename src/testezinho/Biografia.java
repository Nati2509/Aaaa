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
public class Biografia extends Livro {
    
    private String nome;

    public Biografia(String titulo, String autor, int isbn, String nome){
        super(titulo, autor, isbn);
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Biografia{" + "nome=" + nome + '}';
    }
}
