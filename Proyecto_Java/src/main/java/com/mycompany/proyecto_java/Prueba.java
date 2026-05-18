/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_java;

/**
 *
 * @author Luis Mendoza
 */
public class Prueba {

    int cedula;
    char C;
    
    public int crearturno(){
        return this.getCedula() * 100;
    }
    
    public Prueba(int cedula, char C) {
        this.cedula = cedula;
        this.C = C;
    }
    
    public Prueba() {
        this.cedula = cedula;
        this.C = C;
    }
    
    public Prueba(int cedula) {
        this.cedula = cedula;
    }
    
    public int getCedula() {
        return cedula;
    }

    public char getC() {
        return C;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setC(char C) {
        this.C = C;
    }
}
