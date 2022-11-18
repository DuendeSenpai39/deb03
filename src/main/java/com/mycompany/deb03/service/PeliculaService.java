/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03.service;

import com.mycompany.deb03.modelo.Pelicula;
import java.util.List;

/**
 *
 * @author Jose
 */
public interface PeliculaService {
    public abstract void crear(Pelicula pelicula);
    public abstract List<Pelicula> listar();
    public abstract void modificar(String nombre,Pelicula pelicula);
    public abstract void eliminar(String nombre);
}
