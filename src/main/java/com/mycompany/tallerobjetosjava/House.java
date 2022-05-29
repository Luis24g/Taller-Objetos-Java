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
public class House {
    /**
     * Se declararan los atributos de la clase House
     */
    private String adress;
    public int numberOfRooms;
    protected boolean forSale;
    
    /**
     * Constructor por defecto para la clase House
     */
    public House(){
        this.adress="Calle falsa 123";
        this.numberOfRooms=4;
        this.forSale=true;
    }
    /**
     * Se definen los parametros del constructor de la clase House
     * @param adress
     * @param numberOfRooms
     * @param forSale 
     */
    public House(String adress, int numberOfRooms, boolean forSale) {
        this.adress = adress;
        this.numberOfRooms = numberOfRooms;
        this.forSale = forSale;
    }
    
    //Metodos get y set para acceder al parametro adress
    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }
    /**
     * Metodo para saber si la casa esta a la venta
     */
    public void isForSale(){
        if(this.forSale==true){
        System.out.println("La casa esta a la venta");
        }else{
        System.out.println("La casa no esta a la venta");
        }
    }

    @Override
    public String toString() {
        return "House{" + "adress=" + adress + ", numberOfRooms=" + numberOfRooms + ", forSale=" + forSale + '}';
    }
    
}
