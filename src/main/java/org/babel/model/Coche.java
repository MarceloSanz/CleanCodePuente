package org.babel.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Coche {
    private int  peso;
    private int tiempoDeLlegada;
    private int tiempoRecorrerPuente;
    private int TiempoRecorrido;
}
