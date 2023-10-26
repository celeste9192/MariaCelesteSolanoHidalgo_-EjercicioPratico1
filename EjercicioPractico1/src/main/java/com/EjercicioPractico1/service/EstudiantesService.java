/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Estudiantes;
import java.util.List;

/**
 *
 * @author MARÍA CELESTE
 */
public interface EstudiantesService {

    List<Estudiantes> getAllEstudiantes();

    Estudiantes getEstudiantesById(Long id);

    void saveEstudiantes(Estudiantes estudiantes);

    void updateEstudiantes(Estudiantes estudiantes);

    void deleteEstudiantes(Long id);
}
