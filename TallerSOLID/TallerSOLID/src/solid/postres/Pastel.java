/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.postres;


import java.util.ArrayList;
import solid.Aderezo;
import solid.operaciones.Precio;

/**
 *
 * @author Israel
 */
public class Pastel implements Postre {
     private String sabor;
     private double price;
    private ArrayList<Aderezo> aderezos;
    
    public Pastel(String sabor){
        
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }
    
     @Override
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + new Precio(this).calcularPrecioFinal() + ", aderezos=" + aderezos + '}';
    }

    @Override
    public double getPrecio() {
        return this.price;
    }
}
