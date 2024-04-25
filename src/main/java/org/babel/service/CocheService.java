package org.babel.service;

import org.babel.model.Coche;
import org.babel.model.Puente;

public class CocheService implements ICocheService {

    @Override
    public boolean comprobarPuentePasado(Coche coche, int tiempoPuente) {
        if (coche.getTiempoRecorrerPuente() == tiempoPuente)
            return true;

        return false;
    }

    @Override
    public boolean esperandoPuente(Puente puente) {
        if (puente.getCoches().size() == 5)
            return true;

        return false;
    }

    @Override
    public int curzandoPuente(int segundosPuente, Coche coche) {
        return coche.getTiempoRecorrido()-segundosPuente;
    }
}
