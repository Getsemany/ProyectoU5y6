/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectou5y6;

/**
 *
 * @author oswy
 */
public class Alumno {
    private int clave;
    private String nombre;
    private String apellido;
    private String carrera;

    public Alumno(int clave, String nombre, String apellido, String carrera) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "("+clave+")"+nombre+" "+apellido+", "+carrera; //To change body of generated methods, choose Tools | Templates.
    }
    
}
