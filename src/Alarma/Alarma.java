public class Alarma {
    private boolean vidrio;
    private boolean puerta;
    private boolean ventana;
    private Timbre timbre;

    public Alarma() {
        this.vidrio = false;
        this.puerta = false;
        this.ventana = false;
    }
    public boolean comprobar(){
        if (this.vidrio == true || this.puerta == true || this.ventana == true){
            return true;
        }
        return false;
    }

    public boolean isPuerta() {
        return puerta;
    }
    public void setPuerta(boolean puerta) {
        this.puerta = puerta;
    }
    public boolean isVidrio() {
        return vidrio;
    }
    public void setVidrio(boolean vidrio) {
        this.vidrio = vidrio;
    }
    public boolean isVentana() {
        return ventana;
    }
    public void setVentana(boolean ventana) {
        this.ventana = ventana;
    }
    public void sonarAlarma(){
        if(comprobar()){
            timbre.sonarTimbre();
        }
    }
}
