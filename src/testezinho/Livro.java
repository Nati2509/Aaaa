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
public class Livro {
    
    //protected static numero_livros [0];
    protected String titulo;
    protected String autor;
    protected int isbn;
    
    
    
    public Livro(String titulo, String autor, int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    Livro(String hp, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    public String toString(){
        return "Titulo: " + titulo + "Autor: " + autor + "Isbn: " + isbn;   
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
        
        final Livro other = (Livro)obj;
        if (this.titulo != other.getTitulo()){
            return false;
        }
        return true;
        }

        
   }

