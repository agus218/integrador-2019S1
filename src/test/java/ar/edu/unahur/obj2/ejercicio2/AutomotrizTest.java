package ar.edu.unahur.obj2.ejercicio2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class AutomotrizTest {

    private List<Motor> motores;
    private Automotriz automotriz;

    @BeforeMethod
    public void setUp() {
        Motor motorCarburador = new MotorCarburador();
        Motor motorInyeccion = new MotorInyeccion();
        Motor motorExperimental = new MotorExperimentalAdapter(new MotorExperimental());
        motores = new ArrayList<Motor>();
        motores.add(motorCarburador);
        motores.add(motorInyeccion);
        motores.add(motorExperimental);
        automotriz = new Automotriz();
    }

    @Test
    public void testProbarEncender() {
        motores.forEach(m -> {
            automotriz.probarEncender(m);
            assertTrue(m.encendido());
        });
    }

    @Test
    public void testProbarApagar() {
        motores.forEach(m -> {
            automotriz.probarApagar(m);
            assertFalse(m.encendido());
        });
    }

    @Test
    public void testProbarAceleracion() {
        motores.forEach(m -> {
            automotriz.probarAceleracion(m, 100);
            assertEquals(m.rpm(), 100);
        });
    }

    @Test
    public void testProbarFrenado() {
        motores.forEach(m -> {
            automotriz.probarFrenado(m, 100, 50);
            assertEquals(m.rpm(), 50);
        });
    }
}