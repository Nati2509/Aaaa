/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author natal
 */
public class VolumeQuadrado extends Quadrado{
    
     private double lateral;
    
    public VolumeQuadrado(){
        super();
        lateral = 4;
    }

    public VolumeQuadrado(double area, double lateral){
        super();
        this.lateral = lateral;
    }
    
    public double getLateral(){
        return lateral;
    }
    public void setLateral(double lateral){
        this.lateral = lateral;
    }
    
    public double getVolume(){
        return lateral * Area();
    }
   
    public String toString(){
        return "Lateral: " + lateral + "area: " + Area();
    }
    
    
}
