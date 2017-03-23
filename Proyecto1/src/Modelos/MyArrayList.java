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

public class MyArrayList<i> implements Comparable<Object>
{
    private int tamMax = 10;// tamaño maximo de elementso 
    private Object elementos[];// conjunto de elementos de una lista
    private int nElementos; // numero de elementos en una lista
    
    public MyArrayList()
    {
        elementos = new Object[tamMax];
        nElementos = 0;
        
    }
    public MyArrayList(int i)
    {
        elementos = new Object[i*2];
        nElementos = i;
    }
    
    public void Vaciar()
    {
        nElementos = 0;
    }
    public int size()
    {
        return nElementos;
    }
    
    public boolean isEmpty() {
        return nElementos == 0;
    }  
    
    public boolean add(Object ele)
    {
        if (nElementos >= tamMax)
        {
            replicarArray();
        }
        elementos[nElementos++] = ele;
        return true;
    }
    
    private void replicarArray()
    {
        tamMax = tamMax * 2;
        Object[] nuevoArray = new Object[tamMax];
        copiarArray(nuevoArray, elementos, 0);
        elementos = nuevoArray;
    }
    
    private void copiarArray(Object[] arrayDestino, Object[] arrayOrigen, int indice)
    {
        if (indice == arrayOrigen.length -  1)
        {
            arrayDestino[indice] = arrayOrigen[indice];
        }
        else{
            arrayDestino[indice] = arrayOrigen[indice];
            copiarArray(arrayDestino, arrayOrigen, indice + 1);
        }
    }
    
    public void remove(Object index) 
    {
        if (nElementos >= 1) 
        {
            int posicion;
            boolean encontrado = false;
            
            posicion = 0;
            
            while(posicion < nElementos && !encontrado)
            {
                if(elementos[posicion] == index)
                {
                    encontrado = true;
                }
                else
                {
                    posicion++;
                }
                
            }
            
            if(encontrado)
            {
                while(posicion < nElementos-1)
                {
                    elementos[posicion] = elementos[posicion+1];
                    posicion++;
                }
                nElementos--;
            }
        } 
    }
    
    public Object get(int index)
    {
       if(index >= 0 && index < nElementos)
       {
           return elementos[index]; 
       } 
       return null;
    }
    
    public boolean contains(Object o)
    {
        boolean ok = false;
        int i = 0;
        while(i < nElementos && !ok)
        {
            if(elementos[i].equals(o))
            {
                ok = true;
            }
            i++;
        }
        return ok;        
    }

     public void sort(Object o)
    {
        
         int i, j;
         Object aux = new Object();
         for(i=0;i<nElementos-1;i++)
              for(j=0;j<nElementos-i-1;j++)
                if(elementos[j+1] < (elementos[j]))
                {
                    aux=elementos[j+1];
                    elementos[j+1]=elementos[j];
                    elementos[j]=aux;
                }
    }

    public int compareTo(Object o) 
    {
    
    }




}

