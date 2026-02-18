package org.iesalandalus.programacion.cuatroenraya.modelo;

public enum Ficha {
    AZUL("A"),
    VERDE("V");

    private String simbolo;

    private Ficha(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return simbolo;
    }
}