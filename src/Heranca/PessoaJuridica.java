
package Heranca;

/**
 *
 * @author natal
 */
public class PessoaJuridica extends Pessoa {
    
    private int cnpj;
    
    public PessoaJuridica(String nome, int telefone, int idade, int cnpj){
        super(nome, telefone, idade);
        this.cnpj = cnpj;
    }
    
    public int getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    
    public String toString(){
        return "Cnpj: " + cnpj;
    }
    
}
