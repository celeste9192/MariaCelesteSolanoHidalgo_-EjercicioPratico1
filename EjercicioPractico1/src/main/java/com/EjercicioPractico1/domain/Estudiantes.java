/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "estudiantes")

/**
 *
 * @author MARÍA CELESTE
 */
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nombre;
    private String identificacion;
    private String nivel_cursando;
    private int edad;
    private double altura;
    private double peso;
    private String genero;

    public Estudiantes() {

    }

    public Estudiantes(Long id, String nombre, String identificacion, String nivel_cursando, int edad, double altura, double peso, String genero) {

        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nivel_cursando = nivel_cursando;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;

    }

}
