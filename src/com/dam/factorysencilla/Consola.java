package com.dam.factorysencilla;

/**
 * Esta clase es un producto
 */
public class Consola implements IComun {
    //Adolfito El Grande es un nombre muy sus

    /**
     * Constructor
     * @param msg mensaje que queremos imprimir
     */
    public Consola(){
    };

    /**
     * Visualizamos mensaje por consola
     */
    @Override
    public void visualiza(String msg){
        System.out.println("Sale por la consola " + msg);
    }
}
