/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_java;

/**
 *
 * @author Luis Mendoza
 */
public class Proyecto_Java {

    public static void main(String[] args) {
        Prueba prueba1pepito = new Prueba();
        
        prueba1pepito.setCedula(4832894);
        
        int ceduladepepito ;
        
        ceduladepepito = prueba1pepito.getCedula();
        
        System.out.println("Esta es la cedula " + ceduladepepito + " cedula * 100 " + prueba1pepito.crearturno());
        
        
    }
}
