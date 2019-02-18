package com.f.lib;

import javax.swing.*;
import java.util.Scanner;

public abstract class IO implements Mostrable{

    /**
     * Muestra un mensage por consola
     * 
     * @param msg String a ser mostrado por consola
     */
    @Override
    public abstract void output(String msg);

    /**
     * Devuelve un String introducido por consola
     *
     * @return String
     */
    public static String input() {
        return new Scanner(System.in).next();
    }

    /**
     * Muestra un mensaje por ventana solicitando introducir datos Devuelve un
     * String introducido en la ventana
     *
     * @param msg String a ser mostrado
     * @param title String a ser titulo de la ventana
     * @return String introducido
     */
    public static String input(String title, String msg) {
        return JOptionPane.showInputDialog(null, title, msg, 0);
    }

    /**
     * Comprueba si el argumento str es int
     * 
     * @param str String a ser comprobado
     * @return boolean true si es int
     * @exception NumberFormatException e si str no es int
     */
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * Comprueba si el parametro str es parseable a int, si lo es, devuelve 
     * el int, de lo contrario devuelve null
     * 
     * @param str string a parsear a int
     * @return str parseado a int
     */
    public static int stringToInt(String str) {
        return isInteger(str) ? Integer.parseInt(str) : null;
    }
    /**
     * Comprueba si el argumento str es float
     * 
     * @param str String a ser comprobado
     * @return boolean true si es float
     * @exception NumberFormatException e si str no es float
     */
    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * enumerador para determinar si esta clase se instancia haciendo referencia a salidas de texto por consola o por ventanas joptionpane
     */
    public enum Tipo{CONSOLA, VENTANA}
    /**
     * metodo que devuelve un objeto de la clase IO ya creado depende del tipo de salida que necesite quien utilice el metodo
     * @param tipo TIPO (CONSOLA, VENTANA)
     * @return instanceof IO
     */
    public static IO crearIO(Tipo tipo){
        IO io;
        switch(tipo){
            case CONSOLA:
                io = new ConsIO();
                break;
            case VENTANA:
                io = new VentIO();
                break;
            default:                
                io = new ConsIO();
                break;
        }
        return io;        
    }
}
