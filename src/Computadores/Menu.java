
package Computadores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author natal
 
public class Menu {
    
    ArrayList<Computadores> c = new ArrayList();
    
    //pegar oq o usuario comentar
    //System.out.println("Nome?");
    // String nome = in.nextLine(); //in.nextInt() para inteiro
    
    //percorrer
    public static void percorre(Computadores []c){
        System.out.println("n");
        for (Computadores i : c){
            if( i != null){
                System.out.println(i.toString() + "n\n");
            }
        }
    }
    
    // contar 
    public static int quantosCasados(Pessoa []p){
        int cont = 0;
        for(int i =0; i<p.size; i++){
            if(p[i] != null){
                Pessoa pessoa = p[i];
                if(pessoa getEstadoCivil().equals("Casado")){
                cont +=1;
            }
            }
        }
        System.out.println("O numero de casados e" + cont);
        boolean n;
        System.out.println(n);
        return cont;
    }
    
    //atualizar
    
    public static void mudarPessoa(Pessoa p[]){
        Scanner in = new Scanner(System.in);
        int pess, mud;
        System.out.println("qual a posicao da pessoa q vc deseja mudar?");
        pess = in.nextInt();
        System.out.println("Oq vc deseja mudar na pessoa?"
                + "nome"
                + "sobrenome"
                + "cpf"
                + "idade"
                + "estado civil");
        
        System.out.println("oq deseja mudar?");
        mud = in.nextInt();
        Scanner so = new Scanner(System.in);
        
        switch(mud){
            Scanner.out.println("infirme o novo nome");
            String a = sn.nextLine();
            p[pess].setNome(a);
            break;
        }
        
    }
    
    
    
}
*/