package Alarma;

public class AlarmaLuminosa extends Alarma {
    private Luz luz;
    private Timbre timbre;

    public AlarmaLuminosa(Timbre timbre, Luz luz) {
        super();
        this.luz = luz;
        this.timbre = timbre;

    }
    public Luz getLuz() {
        return luz;
    }
    public void setLuz(Luz luz) {
        this.luz = luz;
    }
    public Timbre getTimbre() {
        return timbre;
    }
    public void setTimbre(Timbre timbre) {
        this.timbre = timbre;
    }
    public boolean comprobar(){
        if (super.comprobar()){
            super.sonarAlarma();
            luz.encender();
            timbre.sonarTimbre();
            return true;
        }
        return false;
    }
}
