package com.dam.factorysencilla;

/**
 * Fabrica encargada de devolver el producto
 * que elegimos según el tipo
 */
public class FactoriaDeSalidas {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;
    public static final int IMPRESORA = 3;
    /**
     * Devuelve producto del tipo de la Interface
     * @param type 1: consola, 2:ventana
     * @param msg string a imprimir
     * @return producto segun el tipo
     */
    public static IComun getProducto(int type) {
        switch (type) {
            // tipo consola
            case CONSOLA:
                return new Consola();
            // tipo ventana
            case VENTANA:
                return new Ventana();
            // otro tipo
            case IMPRESORA:
                return new Impresora();
            default:
                return null;
        }
    }
}
