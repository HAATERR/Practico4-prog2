package EmpresaSueldos;

public class EmpleadoXHorasExtras extends Empleado {
    private int horasExtras;
    private double montoExtra;

    public EmpleadoXHorasExtras(String nombre, String apellido, int edad,double sueldo, int dni, int horasExtras, double montoExtra) {
        super(nombre, apellido, edad, sueldo, dni);
        this.horasExtras = horasExtras;
        this.montoExtra = montoExtra;
    }
    public int getHorasExtras() {
        return horasExtras;
    }
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    public double getMontoExtra() {
        return montoExtra;
    }
    public void setMontoExtra(double montoExtra) {
        this.montoExtra = montoExtra;
    }
    @Override
    public double getSueldo(){
        return super.getSueldo() + calcularMonto();
    }

    public double calcularMonto(){
        double total = 0;
        return total = horasExtras * montoExtra;
    }
}
