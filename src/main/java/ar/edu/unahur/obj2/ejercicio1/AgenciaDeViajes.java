package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class AgenciaDeViajes {
    List<Paquete> paquetes = new ArrayList<Paquete>();

    public AgenciaDeViajes() {
        this.paquetes = paquetes;
    }

    public void catalogoDePaquetes() {
       paquetes.stream().forEach(paquete -> paquete.iterador());

    }

    public void addPaquete(Paquete paquete){
        paquetes.add(paquete);
    }

    public void removePaquete(Paquete paquete){
        paquetes.remove(paquete);
    }

}
