/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.ec3.irbin.salazar.vo;

/**
 *
 * @author irbin
 */
public class Alumno {
    private int idAlumno;
    private String nombres;
    private String apellidos;
    private int edad;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombres, String apellidos, int edad) {
        this.idAlumno = idAlumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
