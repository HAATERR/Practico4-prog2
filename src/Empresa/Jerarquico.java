import java.util.ArrayList;

public class Jerarquico extends Empleado{
  private  ArrayList<Empleado> empleados;

  public Jerarquico(String nombre, String apellido, int edad, double sueldo, int nroLegajo){
      super(nombre, apellido, edad, sueldo, nroLegajo);
      empleados = new ArrayList<>();
  }
  public ArrayList<Empleado> getEmpleados() {
      return empleados;
  }
  public void setEmpleados(ArrayList<Empleado> empleados) {
      this.empleados = empleados;
  }
  public void addEmpleado(Empleado empleado){
      empleados.add(empleado);
  }
  public void removeEmpleado(Empleado empleado){
      empleados.remove(empleado);
  }
  @Override
    public String getInfo(){
      return super.getInfo();
  }
}
