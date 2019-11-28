package ar.edu.unahur.obj2.ejercicio3;

public class Principiante extends Vendedor {

    @Override
    public double comision(double montoVenta) {
        return 0.10 * montoVenta;
    }
}