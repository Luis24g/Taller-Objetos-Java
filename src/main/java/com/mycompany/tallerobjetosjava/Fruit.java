/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tallerobjetosjava;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Fruit {
    /**
     * Se declaran las propiedades de la clase Fruit
     */
    
    public String name;
    private float averageWeight;
    private ArrayList<String> colors = new ArrayList<String>();
    
    /**
     * Constructores para instanciar la clase Fruit, uno por defecto y uno para crear
     * el objeto con los atributos ingresados.
     */
    public Fruit() {
        this.name="Manzana";
        this.averageWeight=1.2f;
        this.colors.add("Roja");
        this.colors.add("Verde");
    }

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    //Metodos get y Set para acceder y asignar valores al atributo color
    /**
     * @return the colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * @param colors the colors to set
     */
    public void setColors(String color) {
        this.colors.add(color);
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", averageWeight=" + averageWeight + ", colors=" + colors + '}';
    }
    
}
