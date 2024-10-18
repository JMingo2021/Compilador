/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNPA.Compilador.EL;

import java.sql.Date;

/**
 *
 * @author jose_
 */
public class Asignatura {
    private int idA;
    private String nombreDelCurso;
    private int profesor;
    private String dependenciaDeEducacionSuperior;
    private String programaEducativo;
    private String nivel;
    private Date fechaDeInicioDelCurso;
    private int numAlumnosInscritos;
    private int duracionEnSemanas; 
    
    /**
     * @return the idA
     */
    public int getIdA() {
        return idA;
    }

    /**
     * @param idA the idA to set
     */
    public void setIdA(int idA) {
        this.idA = idA;
    }

    /**
     * @return the nombreDelCurso
     */
    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    /**
     * @param nombreDelCurso the nombreDelCurso to set
     */
    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    /**
     * @return the profesor
     */
    public int getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the dependenciaDeEducacionSuperior
     */
    public String getDependenciaDeEducacionSuperior() {
        return dependenciaDeEducacionSuperior;
    }

    /**
     * @param dependenciaDeEducacionSuperior the dependenciaDeEducacionSuperior to set
     */
    public void setDependenciaDeEducacionSuperior(String dependenciaDeEducacionSuperior) {
        this.dependenciaDeEducacionSuperior = dependenciaDeEducacionSuperior;
    }

    /**
     * @return the programaEducativo
     */
    public String getProgramaEducativo() {
        return programaEducativo;
    }

    /**
     * @param programaEducativo the programaEducativo to set
     */
    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the fechaDeInicioDelCurso
     */
    public Date getFechaDeInicioDelCurso() {
        return fechaDeInicioDelCurso;
    }

    /**
     * @param fechaDeInicioDelCurso the fechaDeInicioDelCurso to set
     */
    public void setFechaDeInicioDelCurso(Date fechaDeInicioDelCurso) {
        this.fechaDeInicioDelCurso = fechaDeInicioDelCurso;
    }

    /**
     * @return the numAlumnosInscritos
     */
    public int getNumAlumnosInscritos() {
        return numAlumnosInscritos;
    }

    /**
     * @param numAlumnosInscritos the numAlumnosInscritos to set
     */
    public void setNumAlumnosInscritos(int numAlumnosInscritos) {
        this.numAlumnosInscritos = numAlumnosInscritos;
    }

    /**
     * @return the duracionEnSemanas
     */
    public int getDuracionEnSemanas() {
        return duracionEnSemanas;
    }

    /**
     * @param duracionEnSemanas the duracionEnSemanas to set
     */
    public void setDuracionEnSemanas(int duracionEnSemanas) {
        this.duracionEnSemanas = duracionEnSemanas;
    }
}
