package org.iesalandalus.programacion.cuatroenraya.modelo;

public class Tablero {
    private Casilla[][] casillas;

    public static final int FILAS = 6;
    public static final int COLUMNAS = 7;
    public static final int FICHAS_CONSECUTIVAS = 4;

    public Tablero() {
        casillas = new Casilla[FILAS, COLUMNAS];
    }

    private boolean columnaVacia(int columna) {
        return casillas[FILAS][columna].estaOcupada();
    }

    public boolean estaVacio()
}
