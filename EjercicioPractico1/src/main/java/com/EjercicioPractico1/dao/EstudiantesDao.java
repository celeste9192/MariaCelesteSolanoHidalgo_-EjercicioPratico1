/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.dao;

import com.EjercicioPractico1.domain.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author MARÍA CELESTE
 */
public interface EstudiantesDao extends JpaRepository<Estudiantes, Long> {
    
}
