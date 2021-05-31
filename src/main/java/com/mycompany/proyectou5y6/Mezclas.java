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
public class Mezclas {
    public void mezclaNatural(Alumno[] arreglo){
        int izquierda=0, izq=0,derecha=arreglo.length-1,der=derecha;
        boolean ordenado=false;
        do{
            ordenado=true;
            izquierda=0;
            while(izquierda<derecha){
                izq=izquierda;
                while(izq<derecha && arreglo[izq].getClave()<=arreglo[izq+1].getClave()){
                    izq++;
                }
                der=izq+1;
                while(der==derecha-1 || der<derecha && arreglo[der].getClave()<=arreglo[der+1].getClave()){
                    der++;
                }
                if(der<=derecha){
                    mezclaDirecta(arreglo);
                    ordenado=false;
                }
                izquierda=izq;
            }
        }while(!ordenado);
    }
    public void mezclaDirecta(Alumno[] arreglo){
        int i,j,k;
        if(arreglo.length>1){
             int nElementosIzq=arreglo.length/2;
             int nElementosDer=arreglo.length-nElementosIzq;
             Alumno arregloIzq[]=new Alumno[nElementosIzq];
             Alumno arregloDer[]=new Alumno[nElementosDer];
             for(i=0;i<nElementosIzq;i++){
                 arregloIzq[i]=arreglo[i];
             }
             for(i=nElementosIzq;i<nElementosIzq+nElementosDer;i++){
                 arregloDer[i-nElementosIzq]=arreglo[i];
             }
             mezclaDirecta(arregloIzq);
             mezclaDirecta(arregloDer);
             i=0;
             j=0;
             k=0;
             while(arregloIzq.length!=j && arregloDer.length!=k){
                 if(arregloIzq[j].getClave()<arregloDer[k].getClave()){
                     arreglo[i]=arregloIzq[j];
                     i++;
                     j++;
                 }else{
                     arreglo[i]=arregloDer[k];
                     i++;
                     k++;
                 }
             }
             while(arregloIzq.length!=j){
                 arreglo[i]=arregloIzq[j];
                 i++;
                 j++;
             }
             while(arregloDer.length!=k){
                 arreglo[i]=arregloDer[k];
                 i++;
                 k++;
             }
        }
        
    }
    public void busquedaBinaria(Alumno[] arreglo, int elemento){
        int centro,primero,ultimo,valorCentro;
        primero=0;
        boolean encontrado=false;
        ultimo=arreglo.length-1;
        while(primero<=ultimo){
            centro=(primero+ultimo)/2;
            valorCentro=arreglo[centro].getClave();
            if(elemento==valorCentro){
                encontrado=true;
                System.out.println("EL alumno con clave "+elemento+" es");
                System.out.println(arreglo[centro].toString());
                break;
            }else if(elemento<valorCentro){
                ultimo=centro-1;
            }else{
                primero=centro+1;
            }
        }
        if(encontrado==false){
            System.out.println("Error: El alumno con clave "+elemento+" no existe");
        }
    }
}
