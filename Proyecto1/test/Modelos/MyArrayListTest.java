//Copyright [2017] [David S�nchez Sim�n]
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//http://www.apache.org/licenses/LICENSE-2.0
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
package Modelos;

import Excepcion.ExcepcionIndiceFueraDelIntervaloValido;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Excepcion.ExcepcionIndiceFueraDelIntervaloValido;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gokud
 */
public class MyArrayListTest {
    
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
        lista.Vaciar();
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
        //lista.Vaciar();
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
