/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tallerobjetosjava;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author LENOVO
 */
public class User {
   
    /**
    * Se declaran las propiedades de la clase User
    */
    
    private String name;
    public String lastName1;
    public String lastName2;
    public Calendar calendar = Calendar.getInstance();
    public String date;
    public float height;

    /**
     * Constructores para instanciar la clase User, uno por defecto y uno para crear
     * el objeto con los atributos ingresados.
     */
    public User() {
        this.name="";
        this.lastName1="";
        this.lastName2="";
        this.date=Integer.toString(calendar.get(Calendar.DATE))+"/"+Integer.toString(calendar.get(Calendar.MONTH))+"/"+Integer.toString(calendar.get(Calendar.YEAR));
        this.height=0;
    }

    public User(String name, String lastName1, String lastName2, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.height = height;
    }
    
    //Metodos get y Set para acceder y asignar valores al atributo name
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastName1=" + lastName1 + ", lastName2=" + lastName2 + ", date=" + date + ", height=" + height + '}';
    }
    
}
