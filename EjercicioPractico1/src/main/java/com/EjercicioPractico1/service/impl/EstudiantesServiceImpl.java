/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;


import com.EjercicioPractico1.dao.EstudiantesDao;
import com.EjercicioPractico1.domain.Estudiantes;
import com.EjercicioPractico1.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesServiceImpl implements EstudiantesService {

    @Autowired
    private EstudiantesDao estudiantesDao;

    @Override
    public List<Estudiantes> getAllEstudiantes() {
        return estudiantesDao.findAll();
    }

    @Override
    public Estudiantes getEstudiantesById(Long id) {
        return estudiantesDao.findById(id).orElse(null);
    }

    @Override
    public void saveEstudiantes(Estudiantes estudiantes) {
        estudiantesDao.save(estudiantes);
    }

    @Override
    public void updateEstudiantes(Estudiantes estudiantes) {
        estudiantesDao.save(estudiantes);
    }

    @Override
    public void deleteEstudiantes(Long id) {
        estudiantesDao.deleteById(id);
    }
}
