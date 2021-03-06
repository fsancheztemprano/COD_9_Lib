/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f.lib;

/**
 * Interfaz a ser implementada por las clases que tequiran salida de texto por consola o ventana joptionpane
 * @author fsancheztemprano
 */
public interface Mostrable {
    /**
     * metodo abstracto para salida de texto implementable en otras clases
     * @param msg 
     */
    public void output(String msg);
    
    /**
     * metodo abstracto para entrada de texto implementable en otras clases
     */
    public abstract String input();

    /**
     * metodo abstracto para entrada de texto implementable en otras clases
     * que muestra un mensaje indicando al usuario lo que debe introducir
     *
     * @param msg String a ser mostrado
     * @return String introducido
     */
    public abstract String input(String msg);
}
