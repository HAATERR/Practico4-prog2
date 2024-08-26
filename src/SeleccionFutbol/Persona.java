package SeleccionFutbol;

import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private String apellido;
    private int numPasaporte;
    private LocalDateTime fechaNacimiento;
    private String estado;

    public Persona(String nombre, String apellido, int numPasaporte, LocalDateTime fechaNacimiento, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numPasaporte = numPasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getNumPasaporte() {
        return numPasaporte;
    }
    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getEstado() {
        return estado;
    }
    public boolean estaDisponible(){
        if(this.estado == "En pais de origen"){
            return true;
        }
        return false;
    }
}

