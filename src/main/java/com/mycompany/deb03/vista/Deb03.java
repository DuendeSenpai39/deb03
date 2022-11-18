/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.deb03.vista;

import com.mycompany.deb03.controlador.PeliculaControlador;
import com.mycompany.deb03.controlador.PersonajeControlador;

/**
 *
 * @author Jose
 */
public class Deb03 {

     public static void main(String[] args) {
    var vector =new String[5];
    vector[0]="Ken";
    vector[1]="Ryan Gosling";
    vector[2]="Secundario";
    vector[3]="Bello narcisista";
    vector[4]="8";
    var prueba1 =new PersonajeControlador();
    System.out.println(prueba1.crear(vector));
    System.out.println(prueba1.listar());
    
    var vector2 =new String[5];
    vector2[0]="Brad Pitt";
    vector2[1]="Bastardos sin gloria";
    vector2[2]="Protagonista";
    vector2[3]="Tanquero";
    vector2[4]="10";
    var prueba2 =new PersonajeControlador();
    System.out.println(prueba2.crear(vector2));
    System.out.println(prueba2.listar());
    
    var vector3 =new String[5];
    vector3[0]="Tom Hanks";
    vector3[1]="Matt Damon";
    vector3[2]="Antagonista";
    vector3[3]="Sin remordimiento";
    vector3[4]="9";
    var prueba3 =new PersonajeControlador();
    System.out.println(prueba3.crear(vector3));
    System.out.println(prueba3.listar());
    
    
    
   var vector4=new String[7];
    vector4[0]="Titanic";
    vector4[1]="4";
    vector4[2]="1997";
    vector4[3]="8";
    vector4[4]="10";
    vector4[5]="3";
    vector4[6]="Basado en hechos reales.";
  
    var vector5=new PersonajeControlador[3] ;
    vector5[0]=prueba1;
    vector5[1]=prueba2;
    vector5[2]=prueba3;
    var pelicula1=new PeliculaControlador();
    System.out.println(pelicula1.crear(vector4, vector5));
    System.out.println(pelicula1.listar());
    
    
    
}
     
}
