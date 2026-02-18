package org.iesalandalus.programacion.cuatroenraya.modelo;

import java.util.Objects;

public class Casilla {
    private Ficha ficha;

    public Casilla() {
        ficha = null;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        Objects.requireNonNull(ficha, "No se puede poner una ficha nula.");
        if (estaOcupada()) {
            throw new CuatroEnRayaExcepcion("La casilla ya contiene una ficha.");
        }
        this.ficha = ficha;
    }

    public boolean estaOcupada() {
        ficha = getFicha();
        return (ficha != null);
    }

    @Override
    public String toString() {
        return String.format("%s", (ficha == null) ? " " : ficha.toString());
    }
}
