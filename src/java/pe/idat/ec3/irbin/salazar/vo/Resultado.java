/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.ec3.irbin.salazar.vo;

/**
 *
 * @author irbin
 */
public class Resultado {
    private int idResultado;
    private String resultado;

    public Resultado() {
    }

    public Resultado(int idResultado, String resultado) {
        this.idResultado = idResultado;
        this.resultado = resultado;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
