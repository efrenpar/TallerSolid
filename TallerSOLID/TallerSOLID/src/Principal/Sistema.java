/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import solid.postres.*;
//import Procesos.*;

import solid.Aderezo;
import solid.Crema;
import solid.Frutilla;
import solid.gestionDeLeche.*;



import solid.postres.Postre;
import solid.operaciones.OperacionesDeAderezos;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
//        // Producir Helado
//        Helado helado_vainilla = new Helado("Vainilla");
//        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.CREMA);
//        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.FRUTILLA);
//        System.out.println(helado_vainilla);
//        
//        // Producir Pastel
//        Pastel pastel_chocolate = new Pastel("Chocolate");
//        OperacionesAderezo.quitarAderezoPastel(pastel_chocolate, Aderezo.CREMA);
//        OperacionesAderezo.anadirAderezoPastel(pastel_chocolate, Aderezo.FRUTILLA);
//        System.out.println(pastel_chocolate);
        Postre postre1 =  new Helado("vainilla");
        OperacionesDeAderezos.anadirAderezo(new Helado("vainilla"), new Crema());
        OperacionesDeAderezos.anadirAderezo(new Helado("vainilla"), new Frutilla());
        System.out.println(postre1);
        
        Postre postre2 = new Pastel("Chocolate");
        OperacionesDeAderezos.anadirAderezo(postre2, new Crema());
        OperacionesDeAderezos.anadirAderezo(postre2, new Frutilla());
        System.out.println(postre2);
        
        new CambioLeche(new LecheDescremada()).cambiarTipoLeche();
        
        new CambioLeche(new LecheDeslactosada()).cambiarTipoLeche();
        
    }
}
