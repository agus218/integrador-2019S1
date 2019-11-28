package ar.edu.unahur.obj2.ejercicio3;

public class Senior extends Vendedor {

    @Override
    public double comision(double montoVenta) {
        return 0.20 * montoVenta;
    }
}