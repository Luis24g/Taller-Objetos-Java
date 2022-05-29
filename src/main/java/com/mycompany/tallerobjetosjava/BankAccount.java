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
public class BankAccount {
   
    /**
     * Se declaran las propiedades de la clase BankAccount
     */
     
    private int accountNumber;
    protected boolean activated;
    
    /**
     * Constructores para instanciar la clase BankAccount uno por defecto y uno para crear
     * el objeto con los atributos ingresados.
     */
    
    public BankAccount(){
        this.accountNumber=0;
        this.activated=false;
    }
    
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    
    //Metodos get y Set para acceder y asignar valores al atributo activated
    /**
     * @return the activated
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * @param activated the activated to set
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    //Metodo para imprimir el objeto
    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", activated=" + activated + '}';
    }
    
    
    
}
