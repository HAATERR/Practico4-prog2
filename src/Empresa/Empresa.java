import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> personas;
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }
    public void removePersona(Persona persona) {
        this.personas.remove(persona);
    }
    public void mostrarPersonas() {
        for(int i = 0; i < this.personas.size(); i++) {
            System.out.println(this.personas.get(i).getInfo() + "\n");
        }
    }

}
