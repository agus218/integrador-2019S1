package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.*;

public class AgenciaDeViajesTest {
    AgenciaDeViajes agenciaDeViajes;
    @BeforeTest
    public void setup() {
        Paquete paquetePatagonia = new PaquetePatagonia();
        Paquete paqueteCuyo = new PaqueteCuyo();
        Paquete paqueteNOA = new PaqueteNOA();
        agenciaDeViajes = new AgenciaDeViajes();

    }

    @org.testng.annotations.Test
    public void testCatalogoDePaquetes() {
        agenciaDeViajes.catalogoDePaquetes();
    }
}