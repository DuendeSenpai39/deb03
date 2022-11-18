/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03.service;

import com.mycompany.deb03.modelo.Personaje;
import java.util.List;

/**
 *
 * @author Jose
 */
public interface PersonajeService {
    
    public abstract void crear(Personaje personaje);
    public abstract List<Personaje> listar();
    public abstract void modificar(String nombrePersonaje,Personaje personaje);
    public abstract void eliminar(String nombre);
}

