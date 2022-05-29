/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tallerobjetosjava;

/**
 *
 * @author LENOVO
 */
public class Vehicle {
    /**
     * Se declaran los atributos de la clase Vehicle
     */
    private int ID;
    private String driver;
    private int wheels;
    
    /**
     * Constructor por defecto para la clase Vehicle
     */
    public Vehicle() {
        this.ID=12345;
        this.driver="Felipe";
        this.wheels=6;
    }

     /**
     * se definen los parametros del constructor del objeto Vehicle
     * @param ID
     * @param driver
     * @param wheels 
     */
    public Vehicle(int ID, String driver, int wheels) {
        this.ID = ID;
        this.driver = driver;
        this.wheels = wheels;
    }

   

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the wheels
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * @param wheels the wheels to set
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    /**
     * Metodo para imprimir que el vehiculo esta listo
     */
   public void ready(){
       System.out.println("The vehicle is ready");
   }

    @Override
    public String toString() {
        return "Vehicle{" + "ID=" + ID + ", driver=" + driver + ", wheels=" + wheels + '}';
    }
    
    
    
}
