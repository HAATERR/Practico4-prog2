package SeleccionFutbol;

import java.time.LocalDateTime;

public class Futbolista extends Persona {
    private String piernaBuena;
    private String posicion;
    private int cantGoles;

    public Futbolista(String nombre, String apellido, int numPasaporte, LocalDateTime fechaNacimiento, String estado, String piernaBuena, String posicion, int cantGoles) {
        super(nombre, apellido, numPasaporte, fechaNacimiento, estado);
        this.piernaBuena = piernaBuena;
        this.posicion = posicion;
        this.cantGoles = cantGoles;
    }

    public String getPiernaBuena() {
        return piernaBuena;
    }

    public void setPiernaBuena(String piernaBuena) {
        this.piernaBuena = piernaBuena;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }

}