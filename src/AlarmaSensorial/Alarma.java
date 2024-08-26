package AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores;
    private Luz luz;
    private Timbre timbre;

    public Alarma() {
        this.sensores = new ArrayList<>();

    }
    public void addSensor(Sensor s) {
        this.sensores.add(s);
    }
    public void comprobar(){
        for (int i = 0; i < this.sensores.size(); i++) {
            if (sensores.get(i).isEncencido()){
                sonarAlarma(sensores.get(i));

            }
        }

    }
    public void sonarAlarma(Sensor s){
        System.out.println("Sensor encendido, en la zona: "+ s.getZona());
        timbre.sonarTimbre();
    }
}