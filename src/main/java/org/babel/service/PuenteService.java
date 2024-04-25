package org.babel.service;

import org.babel.model.Coche;

import java.util.List;

public class PuenteService implements IPuenteService {
    int maxNumCoches = 5;
    int maxPeso = 5000;
    List<Coche> cochesPuente;

    @Override
    public void agregarCoche(Coche coche) {
        if (cochesPuente.size() < maxNumCoches) {
            if (coche.getPeso() + maxPeso < maxPeso) {
                cochesPuente.add(coche);
            }
        }
    }

    @Override
    public void eliminarCoche(Coche coche) {
        cochesPuente.remove(coche);
    }



}
