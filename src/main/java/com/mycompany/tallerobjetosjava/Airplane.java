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
public class Airplane {
    
   /**
    * Se declaran los atributos de la clase Airplane
    */ 
   private int numberOfPassangers;
   public String pilot;
   public String copilot;
   protected String course;
   
   /**
    * Constructor por defecto de la clase Airplane
    */
   public Airplane(){
       this.numberOfPassangers=50;
       this.pilot="Pedro";
       this.copilot="Juan";
       this.course="Miami";
   }
   
   /**
    * Se definen los parametros del constructor de la clase Airplane
    * @param numberOfPassangers
    * @param pilot
    * @param copilot
    * @param course 
    */
    public Airplane(int numberOfPassangers, String pilot, String copilot, String course) {
        this.numberOfPassangers = numberOfPassangers;
        this.pilot = pilot;
        this.copilot = copilot;
        this.course = course;
    }
    
    //Metodos get y set para acceder al atributo numberOfPassangers
    /**
     * @return the numberOfPassangers
     */
    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    /**
     * @param numberOfPassangers the numberOfPassangers to set
     */
    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }
   
    /**
     * Metodo para imprimir el curso del avion
     */
    public void curso(){
        System.out.println("Avion en curso a "+this.course);
    }
    //Metodo para imprimir el objeto
    @Override
    public String toString() {
        return "Airplane{" + "numberOfPassangers=" + numberOfPassangers + ", pilot=" + pilot + ", copilot=" + copilot + ", course=" + course + '}';
    }
  
}
