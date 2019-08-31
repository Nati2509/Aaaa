package Okay;

/**
 *
 * @author natal
 */
public class PessoaFisica extends Pessoa{
    
    private int cpf;
    
    public PessoaFisica(String nome, int telefone, int cpf){
        super(nome, telefone);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + '}';
    }
    
    
}
