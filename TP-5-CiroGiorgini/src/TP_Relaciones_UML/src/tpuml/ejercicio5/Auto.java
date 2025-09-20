package tpuml.ejercicio5;
public class Auto {
    private String modelo;
    private Motor motor;
    public Auto(String modelo, int potenciaMotor) {
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor);
    }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
}