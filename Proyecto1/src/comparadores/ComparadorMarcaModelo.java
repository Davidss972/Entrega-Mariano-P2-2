/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.Comparator;
import Modelos.Coche;

/**
 *
 * @author mariano
 */
public class ComparadorMarcaModelo implements Comparator<Coche> {

    @Override
    public int compare(Coche coche1, Coche coche2) {
        int comparacionPorMarca = coche1.getMarca().compareToIgnoreCase(coche2.getMarca());
        if (comparacionPorMarca != 0) return comparacionPorMarca;
        else return coche1.getModelo().compareToIgnoreCase(coche2.getModelo());
    }
    
}
