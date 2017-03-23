/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import Modelos.MyArrayList;
import Excepcion.ExcepcionIndiceFueraDelIntervaloValido;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mariano
 */
public class MiArrayListTest {
    
    MyArrayList<Integer> lista;
    
    @Before
    public void setUp()
    {
        lista = new MyArrayList();
    }
    
    @Test
    public void testListaVaciaRecienCreada() {
        assertEquals(true, lista.isEmpty());
    }
    
    @Test
    public void testListaNoVaciaConUnElemento() {
        lista.add(1);
        assertEquals(false, lista.isEmpty());
    }
    
    @Test
    public void testNoEstaVaciaListaConVariosElementos() {
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        assertEquals(false, lista.isEmpty());
    }    

    @Test
    public void testEstaVaciaListaConTodosLosElementosBorrados() {
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        lista.remove(8);
        lista.remove(2);
        lista.remove(8);
        lista.remove(7);
        assertEquals(true, lista.isEmpty());
    }    
    
    
    @Test
    public void testPrimerElementoListaConUnElemento() {
        lista.add(1);
        assertEquals(new Integer(1), lista.get(0));
    }

    @Test
    public void testTercerElementoLista() {
        lista.add(8);
        lista.add(7);
        lista.add(5);
        assertEquals(new Integer(5), lista.get(2));
    }
    
    @Test
    public void testBorradoElementoLista() {
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.remove(7);
        assertEquals(new Integer(5), lista.get(1));
    }

    @Test
    public void testBorradosVariosElementosLista() {
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        assertEquals(new Integer(8), lista.get(2));
    }

    @Test
    public void testBorraSoloLaPrimeraOcurrencia() {
        lista.add(3);
        lista.add(13);
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        lista.remove(8);
        lista.remove(2);
        lista.remove(13);
        assertEquals(new Integer(8), lista.get(2));
    }
    
    @Test
    public void testIntentoBorradoEltoQueNoEsta(){
        lista.add(3);
        lista.add(13);
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(1);
        assertEquals(new Integer(2), lista.get(6));
        
    }
    
    @Test
    public void testNoEstaElementoEnListaVacia()
    {
        assertEquals(false, lista.contains(new Integer(4)));
    }
    
    @Test
    public void testEstaElementoEnLista()
    {
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        assertEquals(true, lista.contains(new Integer(7)));
    }

    @Test
    public void testEstaSegundaOcurrenciaCuandoSeHaBorradoLaPrimera() {
        lista.add(3);
        lista.add(13);
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        lista.remove(8);
        lista.remove(2);
        lista.remove(13);
        assertEquals(true, lista.contains(new Integer(8)));
    }    

    @Test
    public void testTanannoListaVacia()
    {
        assertEquals(0, lista.size());
    }
    

    @Test
    public void testTamannoListaConElementos() {
        lista.add(3);
        lista.add(13);
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        lista.remove(8);
        lista.remove(2);
        lista.remove(13);
        assertEquals(3, lista.size());
    }    

    @Test
    public void testTamannoListaConTodosLosElementosBorrados() {
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        lista.remove(8);
        lista.remove(2);
        lista.remove(8);
        lista.remove(7);
        assertEquals(0, lista.size());
    }    
    
    @Test
    public void testComprobacionIndiceNegativoFueraDelIntervaloEnListaVacia() 
            throws ExcepcionIndiceFueraDelIntervaloValido
    {
        assertEquals(null, lista.get(-1));
    }

    @Test
    public void testComprobacionIndiceNegativoFueraDelIntervaloEnListaConEltos() 
            throws ExcepcionIndiceFueraDelIntervaloValido
    {
        lista.add(3);
        lista.add(13);
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        lista.remove(8);
        lista.remove(2);
        lista.remove(13);
        assertEquals(null, lista.get(-1));
    }
    
    
    @Test
    public void testComprobacionIndicePositivoFueraDelIntervaloEnListaVacia() 
            throws ExcepcionIndiceFueraDelIntervaloValido
    {
        assertEquals(null, lista.get(1));
    }
    
    @Test
    public void testComprobacionIndicePositivoFueraDelIntervaloEnListaConEltos() 
            throws ExcepcionIndiceFueraDelIntervaloValido
    {
        lista.add(3);
        lista.add(13);
        lista.add(8);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.remove(5);
        lista.remove(8);
        lista.remove(2);
        lista.remove(13);
        assertEquals(null, lista.get(3));
    }

    @Test
    public void testInsercionMasElementosDelTamannoOriginalDeLaLista()
    {
        for(int i = 0; i <= 100; i++)
        {
            lista.add(i);
        }
        
        assertEquals(new Integer(3), lista.get(3));
    }
    
}
