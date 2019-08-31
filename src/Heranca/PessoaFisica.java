
package Heranca;

/**
 *
 * @author natal
 */
public class PessoaFisica extends Pessoa {
    
    private int cpf;
    
    public PessoaFisica(String nome, int telefone, int idade, int cpf) {
        super(nome, telefone, idade);
        this.cpf = cpf;
    }
    
    public int getCpf(){
        return cpf;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public String toString() {
        return "Nome: " + nome;
    }
}
