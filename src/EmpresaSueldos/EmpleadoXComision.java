public class EmpleadoXComision extends Empleado{
    private double comision;
    private int cantVentas;

    public EmpleadoXComision(String nombre, String apellido, double comision,int edad, int dni, double sueldo, int cantVentas) {
        super(nombre, apellido, edad, sueldo, dni);
        this.comision = comision;
        this.cantVentas = cantVentas;
    }

    @Override
    public double getSueldo(){
        return super.getSueldo() + (super.getSueldo() * calcularPorcentaje() / 100);
    }

    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }
    public int getCantVentas() {
        return cantVentas;
    }
    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
    public double calcularPorcentaje(){
        double contador = 0;
        for (int i = 0; i < cantVentas; i++) {
            contador += comision;
        }
        return contador;
    }
}
