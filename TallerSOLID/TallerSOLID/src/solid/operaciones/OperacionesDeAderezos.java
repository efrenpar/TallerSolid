/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.operaciones;


import Postres.Helado;
import Postres.Pastel;
import solid.Aderezo;
import solid.postres.Postre;

/**
 *
 * @author Israel
 */
public class OperacionesDeAderezos {
     public static void anadirAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    }
    
  
    
}
