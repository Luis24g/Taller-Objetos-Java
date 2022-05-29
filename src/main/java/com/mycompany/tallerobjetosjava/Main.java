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
public class Main {
    public static void main(String[] args) {
        /**
         * Ejemplos rapidos para instanciar las clases
         */
        
        Airplane airplane = new Airplane();
        BankAccount bankAccount = new BankAccount();
        Fruit fruit = new Fruit();
        House house = new House();
        User user = new User();
        Vehicle vehicle = new Vehicle();
        
        /**
         * Se imprimen los objetos con su constructor por defecto
         */
        
        System.out.println(airplane);
        System.out.println(bankAccount);
        System.out.println(fruit);
        System.out.println(house);
        System.out.println(user);
        System.out.println(vehicle);
        
        /**
         * Algunos ejemplos de metodos en las clases creadas
         */
        
        airplane.curso();
        bankAccount.isActivated();
        fruit.getColors();
        house.isForSale();
        user.getName();
        vehicle.ready();
        
    }
}
