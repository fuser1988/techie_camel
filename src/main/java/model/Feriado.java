package model;

import java.time.LocalDate;

public class Feriado {
    
    private String descripcion;
    private String tipo;
    private String fecha;

    public Feriado(String descripcion, String tipo, String fecha) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fecha = fecha;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
}
