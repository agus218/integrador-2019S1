package ar.edu.unahur.obj2.ejercicio3;

public class Experto extends  Vendedor {
    @Override
    public double comision(double montoVenta) {
        return 0.40 * montoVenta;
    }
}
