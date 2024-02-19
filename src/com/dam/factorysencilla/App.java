package com.dam.factorysencilla;

/**
 * Calse principal que llama a la factoria
 * para crear los onjetos
 */
public class App {

    static IComun salida;
    public static void main(String[] args) {
        String msg = "Hola";
        //salida por impresora
        salida = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.IMPRESORA);
        salida.visualiza(msg);

        // salida por consola
        salida = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CONSOLA);
        salida.visualiza(msg);

        // salida
        salida = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.VENTANA);
        salida.visualiza(msg);


    }
}
