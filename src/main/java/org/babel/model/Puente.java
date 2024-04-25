package org.babel.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class Puente {
    private List<Coche> coches;
    private int pesoTotal;
}
/*
Coche
Peso
TiempoDeLlegada
TiempoRecorrerPuente
TiempoRecorrido

Puente
Coches
Peso
Contador
 */