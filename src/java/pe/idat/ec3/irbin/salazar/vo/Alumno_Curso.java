/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.ec3.irbin.salazar.vo;

/**
 *
 * @author irbin
 */
public class Alumno_Curso {
    private int idAlumno_Curso;
    private Alumno idAlumno;
    private Curso idCurso;

    public Alumno_Curso() {
    }

    public Alumno_Curso(int idAlumno_Curso, Alumno idAlumno, Curso idCurso) {
        this.idAlumno_Curso = idAlumno_Curso;
        this.idAlumno = idAlumno;
        this.idCurso = idCurso;
    }

    public int getIdAlumno_Curso() {
        return idAlumno_Curso;
    }

    public void setIdAlumno_Curso(int idAlumno_Curso) {
        this.idAlumno_Curso = idAlumno_Curso;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }
    
    
}
