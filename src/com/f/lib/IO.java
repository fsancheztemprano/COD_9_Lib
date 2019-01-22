package com.f.lib;

import javax.swing.*;
import java.util.Scanner;

public abstract class IO {

    /**
     * Muestra un mensage por consola
     * 
     * @param msg String a ser mostrado por consola
     */
    public static void output(String msg) {
        System.out.println(msg);
    }

    /**
     * Muestra un mensage por ventana de JOptionPane
     *
     * @param msg String a ser mostrado por ventana
     * @param title String a ser titulo de la ventana
     */
    public static void output(String title, String msg) {
        JOptionPane.showMessageDialog(null, msg, title, 0);
    }

    /**
     * Devuelve un String introducido por consola
     *
     * @return String
     */
    public static String input() {
        return new Scanner(System.in).next();
    }

    /**
     * Muestra un mensaje por consola solicitando introducir datos por consola
     * Devuelve un String introducido por consola
     * 
     * @param msg String a ser mostrado
     * @return String
     */
    public static String input(String msg) {
        output(msg);
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

    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}