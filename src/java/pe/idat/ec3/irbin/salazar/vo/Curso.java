/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.ec3.irbin.salazar.vo;

/**
 *
 * @author irbin
 */
public class Curso {
    private int idCurso;
    private String nombre;

    public Curso() {
    }

    public Curso(int idCurso, String nombre) {
        this.idCurso = idCurso;
        this.nombre = nombre;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
