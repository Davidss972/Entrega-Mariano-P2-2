/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Objects;

/**
 *
 * @author mariano
 */
public class Coche implements Comparable {
    private int id;
    private String marca;
    private String modelo;

    public Coche(int id, String marca, String modelo)
    {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int compareTo(Object o) {
        Coche coche = (Coche) o;
        if (this.id > coche.id) return 1;
        else if (this.id == coche.id) return 0;
        else return -1;
//        return this.id.compareTo(((Coche) o).id);
    }
    
    @Override
    public boolean equals(Object o)
    {
        boolean eq = Objects.equals(this.id, ((Coche) o).id);
        return eq;
    }    
}
