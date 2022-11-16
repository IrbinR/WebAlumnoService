/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.ec3.irbin.salazar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.idat.ec3.irbin.salazar.bd.ConectarBD;
import pe.idat.ec3.irbin.salazar.vo.Alumno;

/**
 *
 * @author irbin
 */
public class AlumnoDao {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public List<Alumno> buscarPorNombre(String nombre){
        List<Alumno> alumnos = new ArrayList<>();
        try{
            con = ConectarBD.MySQL();
            String sql = "SELECT alumno.nombres, alumno.apellidos, alumno.edad, curso.nombre\n" +
                         "FROM alumno INNER JOIN curso INNER JOIN alumno_curso ON\n" +
                         "alumno.idalumno = alumno_curso.idalumno AND\n" +
                         "curso.idcurso = alumno_curso.idcurso\n" +
                         "WHERE curso.nombre = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setNombres(rs.getString("nombres"));
                alumno.setApellidos(rs.getString("apellidos"));
                alumno.setEdad(rs.getInt("edad"));
                alumnos.add(alumno);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return alumnos;
        
    }
    
    public List<Alumno> buscarPorNombre(String nombre, int limite){
        throw new UnsupportedOperationException("No soportado");
    }
    
    
}
