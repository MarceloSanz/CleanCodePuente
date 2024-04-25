package org.babel.service;

import org.babel.model.Coche;
import org.babel.model.Puente;

public interface ICocheService {

    boolean comprobarPuentePasado(Coche coche, int tiempoPuente);


    boolean esperandoPuente(Puente puente);

    int curzandoPuente(int segundosPuente, Coche coche);
}
