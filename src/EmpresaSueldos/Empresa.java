package EmpresaSueldos;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    public void pagarAlEmpleado(){
        for(int i=0; i<empleados.size(); i++){
            System.out.println("Se le debe pagar al empleado: "+ empleados.get(i).getNombre() + ", el total de: "+empleados.get(i).getSueldo());
        }
    }
}
