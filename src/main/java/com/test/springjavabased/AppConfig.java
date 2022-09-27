/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.springjavabased;

import com.test.beans.Ciudad;
import com.test.beans.Pais;
import com.test.beans.Persona;
import com.test.beans.Piso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Daniel Casado
 */

@Configuration
public class AppConfig {
    
    @Bean
    public Persona persona1() {
        
        return new Persona();
    }
    
    @Bean
    public Piso piso() {
        
        return new Piso();
    }
    
    @Bean
    public Ciudad ciudad() {
        
        return new Ciudad();
    }
    
    @Bean
    public Pais pais() {
        
        return new Pais();
    }
}
