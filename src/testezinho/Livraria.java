/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testezinho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natal
 */
public class Livraria {
    
    ArrayList<Livro> livros = new ArrayList();
    private Object t;

    public Livraria(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    public ArrayList<Livro> getLivros() {
        return (ArrayList<Livro>) livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = (ArrayList<Livro>) livros;
    }
    @Override
    public String toString() {
        return "Livraria{" + "livros=" + livros + '}';
    }
    
    //adicionar na lista de livros um livro recebido por parametro
    public void adicionaLivro(ArrayList<Livro> t){
      // this.t.add(new Livro("HP", 1212));
    }
    
    //retornar valor logico indicando se o nome do livro recebido por parametro esta contifo na lista de livros da livraria
    public boolean pesquisaLivro(String titulo){
        for (Livro livro : livros) {
           if (livro.getTitulo().equals(titulo))
               return true;
        }
        return false;
    }
    
}
