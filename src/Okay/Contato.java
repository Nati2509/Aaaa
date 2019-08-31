
package Okay;

/**
 *
 * @author natal
 */
public class Contato {
    
    private String email;
    
    public Contato(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "email=" + email + '}';
    }
}
