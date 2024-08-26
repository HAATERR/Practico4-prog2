package SeleccionFutbol;

import java.time.LocalDateTime;

public class Entrenador extends Persona {
    private int idFederacion;

    public Entrenador(String nombre, String apellido, int numPasaporte, LocalDateTime fechaNacimiento, String estado, int idFederacion) {
        super(nombre,apellido,numPasaporte,fechaNacimiento,estado);
        this.idFederacion = idFederacion;
    }
    public int getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
}
