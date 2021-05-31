/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectou5y6;

import java.util.Scanner;

/**
 *
 * @author oswy
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Indica la cantidad de alumnos que ingresaras:");
        int can;
        for (;  ; ) {
            String num=leer.nextLine();
            
            try {
            can=Integer.parseInt(num);
            } catch (Exception e) {
            can=0;
            }
            if(can>0){
            break;
            }
        }
        Alumno arreglo[]=new Alumno[can];
        for (int i = 0; i < can; i++) {
            int clave=Integer.parseInt(leer.nextLine());
             String apeliido=leer.nextLine();
             String nombre=leer.nextLine();
             String carrera=leer.nextLine();
             arreglo[i]=new Alumno(clave, nombre, apeliido, carrera);
        }
        //System.out.println(arreglo[1].getNombre());
        System.out.println("Lista de alumnos ordenados");
        Mezclas obj=new Mezclas();
        obj.mezclaNatural(arreglo);
        for (Alumno arreglo1 : arreglo) {
            System.out.println(arreglo1.toString());
        }
        System.out.println("Ingresa la clave del alumno a buscar");
        int elemento=Integer.parseInt(leer.nextLine());
        obj.busquedaBinaria(arreglo, elemento);
        System.out.println("Ingresa la clave del siguiente alumno a buscar");
        elemento=Integer.parseInt(leer.nextLine());
        obj.busquedaBinaria(arreglo, elemento);
    }
}
