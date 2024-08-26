import java.time.LocalDateTime;

public class Masajista extends Persona{
    private String titulo;
    private int aniosExp;

    public Masajista(String nombre, String apellido, int numPasaporte, LocalDateTime fechaNacimiento, String estado, String titulo, int aniosExp) {
        super(nombre, apellido, numPasaporte, fechaNacimiento, estado);
        this.titulo = titulo;
        this.aniosExp = aniosExp;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAniosExp() {
        return aniosExp;
    }
    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }


}
