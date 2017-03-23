/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import Modelos.Coche;
import Modelos.MyArrayList;
import comparadores.ComparadorMarcaModelo;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author mariano
 */
public class MiArrayListOrdenacionTest extends MiArrayListTest {
    @Test
    public void testOrdenacionMiArrayListVacio() {
        lista.sort(null);
        assertEquals(true, lista.isEmpty());
    }    

    @Test
    public void testOrdenacionMiArrayDosEnteros() {
        lista.add(2);
        lista.add(1);
        lista.sort(null);
        MyArrayList<Integer> listaEsperada = new MyArrayList<>();
        listaEsperada.add(1);
        listaEsperada.add(2);
        assertEquals(true, Arrays.equals(listaEsperada.array, lista.array));
    }    
    
    @Test
    public void testOrdenacionMiArrayDiezEnteros() {
        lista.add(10);
        lista.add(9);
        lista.add(8);
        lista.add(7);
        lista.add(6);
        lista.add(5);
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);
        lista.sort(null);
        MyArrayList<Integer> listaEsperada = new MyArrayList<>();
        listaEsperada.add(1);
        listaEsperada.add(2);
        listaEsperada.add(3);
        listaEsperada.add(4);
        listaEsperada.add(5);
        listaEsperada.add(6);
        listaEsperada.add(7);
        listaEsperada.add(8);
        listaEsperada.add(9);
        listaEsperada.add(10);
        assertEquals(true, Arrays.equals(listaEsperada.array, lista.array));
    }

    @Test
    public void testOrdenacionMiArrayDiezCochesPorId() {
        MyArrayList<Coche> listaCoches = new MyArrayList<>();
        Coche coche10 = new Coche(10, "Marca 10", "Modelo 10");
        Coche coche9 = new Coche(9, "Marca 9", "Modelo 9");
        Coche coche8 = new Coche(8, "Marca 8", "Modelo 8");
        Coche coche7 = new Coche(7, "Marca 7", "Modelo 7");
        Coche coche6 = new Coche(6, "Marca 6", "Modelo 6");
        Coche coche5 = new Coche(5, "Marca 5", "Modelo 5");
        Coche coche4 = new Coche(4, "Marca 4", "Modelo 4");
        Coche coche3 = new Coche(3, "Marca 3", "Modelo 3");
        Coche coche2 = new Coche(2, "Marca 2", "Modelo 2");
        Coche coche1 = new Coche(1, "Marca 1", "Modelo 1");
        
        listaCoches.add(coche10);
        listaCoches.add(coche9);
        listaCoches.add(coche8);
        listaCoches.add(coche7);
        listaCoches.add(coche6);
        listaCoches.add(coche5);
        listaCoches.add(coche4);
        listaCoches.add(coche3);
        listaCoches.add(coche2);
        listaCoches.add(coche1);
        listaCoches.sort(null);
        MyArrayList<Coche> listaEsperada = new MyArrayList<>();
        listaEsperada.add(coche1);
        listaEsperada.add(coche2);
        listaEsperada.add(coche3);
        listaEsperada.add(coche4);
        listaEsperada.add(coche5);
        listaEsperada.add(coche6);
        listaEsperada.add(coche7);
        listaEsperada.add(coche8);
        listaEsperada.add(coche9);
        listaEsperada.add(coche10);
        assertEquals(true, Arrays.equals(listaEsperada.array, listaCoches.array));
    }  
    @Test
    public void testOrdenacionMiArrayDiezCochesPorMarcaModelo() {
        MyArrayList<Coche> listaCoches = new MyArrayList<>();
        Coche coche10 = new Coche(10, "Marca 10", "Modelo 10");
        Coche coche9 = new Coche(9, "Marca 9", "Modelo 9");
        Coche coche8 = new Coche(8, "Marca 8", "Modelo 8");
        Coche coche7 = new Coche(7, "Marca 7", "Modelo 7");
        Coche coche6 = new Coche(6, "Marca 6", "Modelo 6");
        Coche coche5 = new Coche(5, "Marca 5", "Modelo 5");
        Coche coche4 = new Coche(4, "Marca 4", "Modelo 4");
        Coche coche3 = new Coche(3, "Marca 3", "Modelo 3");
        Coche coche2 = new Coche(2, "Marca 2", "Modelo 2");
        Coche coche1 = new Coche(1, "Marca 1", "Modelo 1");
        
        listaCoches.add(coche10);
        listaCoches.add(coche9);
        listaCoches.add(coche8);
        listaCoches.add(coche7);
        listaCoches.add(coche6);
        listaCoches.add(coche5);
        listaCoches.add(coche4);
        listaCoches.add(coche3);
        listaCoches.add(coche2);
        listaCoches.add(coche1);
        listaCoches.sort(new ComparadorMarcaModelo());
        MyArrayList<Coche> listaEsperada = new MyArrayList<>();
        listaEsperada.add(coche1);
        listaEsperada.add(coche10);
        listaEsperada.add(coche2);
        listaEsperada.add(coche3);
        listaEsperada.add(coche4);
        listaEsperada.add(coche5);
        listaEsperada.add(coche6);
        listaEsperada.add(coche7);
        listaEsperada.add(coche8);
        listaEsperada.add(coche9);
        assertEquals(true, Arrays.equals(listaEsperada.array, listaCoches.array));
    }  

}
