/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Estudiantes;
import com.EjercicioPractico1.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/estudiantes")
public class EstudiantesController {

    @Autowired
    private EstudiantesService estudiantesService;

    @GetMapping("/listado")
    public String listadoEstudiantes(Model model) {
        List<Estudiantes> estudiantes = estudiantesService.getAllEstudiantes();
        model.addAttribute("estudiantes", estudiantes);
        return "listado"; // Esto se asume que tienes una vista llamada "listado.html"
    }

    @GetMapping("/nuevo")
    public String formularioNuevoEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiantes());
        return "formulario"; // Esto se asume que tienes una vista llamada "formulario.html"
    }

    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute Estudiantes estudiante) {
        estudiantesService.saveEstudiantes(estudiante);
        return "redirect:/estudiantes/listado";
    }

    @GetMapping("/editar/{id}")
    public String editarEstudiante(@PathVariable Long id, Model model) {
        Estudiantes estudiante = estudiantesService.getEstudiantesById(id);
        model.addAttribute("estudiante", estudiante);
        return "formulario"; // Esto se asume que tienes una vista llamada "formulario.html"
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable Long id) {
        estudiantesService.deleteEstudiantes(id);
        return "redirect:/estudiantes/listado";
    }
}
