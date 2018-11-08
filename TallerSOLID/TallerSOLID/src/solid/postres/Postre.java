/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.postres;


import java.util.ArrayList;
import solid.Aderezo;

/**
 *
 * @author Israel
 */
public interface Postre {
 
   
    public abstract double getPrecio();
    public abstract ArrayList<Aderezo> getAderezos();
    
}
