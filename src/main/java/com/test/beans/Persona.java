/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.beans;

import com.text.interfaces.IVivienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author Daniel Casado
 */

public class Persona {
    
    @Value("1")
    private int id;
    
    @Value("Daniel")
    private String nombre;
    
    @Autowired
    @Qualifier("piso")
    private IVivienda vivienda;
    
    @Autowired
    private Ciudad ciudad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IVivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(IVivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}

