/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.operaciones;

import solid.Aderezo;
import solid.postres.Postre;

/**
 *
 * @author Israel
 */
public class Precio {
    private double valorPostre;
    private double totalAderezos;
    
    public Precio(Postre postre){
        
        this.valorPostre = postre.getPrecio();
        this.totalAderezos = this.calcularPrecioAderezos(postre);        
        
    
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }
    
    
    
    public double calcularPrecioAderezos(Postre postre){
            double total=0;
        
            for(Aderezo a:postre.getAderezos()){
                total += a.getPrice();
            }
            return total;
        
    }
    
    public double calcularPrecioFinal(){
    
        return this.valorPostre+(this.valorPostre*0.12)+this.totalAderezos;
    }
    
}
