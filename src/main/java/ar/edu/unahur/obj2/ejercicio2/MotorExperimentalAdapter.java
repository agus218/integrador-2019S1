package ar.edu.unahur.obj2.ejercicio2;

public class MotorExperimentalAdapter implements Motor {
    private MotorExperimental motor;

    public MotorExperimentalAdapter(MotorExperimental motor) {
        this.motor = motor;
    }

    @Override
    public boolean encendido() {
        return motor.encendido();
    }

    @Override
    public long rpm() {
        return motor.rpm();
    }

    @Override
    public void encender() {
        motor.encender();
    }

    @Override
    public void apagar() {
        motor.apagar();
    }

    @Override
    public void acelerar(long i) {
        motor.acelerar(i);
    }

    @Override
    public void frenar(long l) {
        motor.frenar(l);
    }
}
