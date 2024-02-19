package com.dam.factorysencilla;

import javax.swing.JOptionPane;

/**
 * Esta clase es un producto
 */
public class Ventana implements IComun {

    public Ventana() {
    }

    /**
     * Visualizamos mensaje por consola
     */
    @Override
    public void visualiza(String msg){
        JOptionPane.showMessageDialog(null,"Sale por un ventana " + msg);
    }
}
