package AlarmaSensorial;

public class Sensor {
    private String zona;
    private boolean encencido;

    public Sensor(String zona) {
        this.zona = zona;
        this.encencido = false;
    }

    public boolean isEncencido() {
        return encencido;
    }
    public String getZona() {
        return zona;
    }
}
