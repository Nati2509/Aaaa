
package Interface;

/**
 *
 * @author natal
 */
public class Quadrado implements IArea {
    
    protected double base;
    protected double altura;
    
    public Quadrado (){
        base = 2;
        altura = 3;
    }
    
    public double Area (){
        return base * altura;
    }
    
    public Quadrado (double area, double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }
   
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return "Base: " + base + "Altura: " + altura;
    }
    
    
 
    
}
