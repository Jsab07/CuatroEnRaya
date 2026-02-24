package org.iesalandalus.programacion.cuatroenraya.modelo;

public class Tablero {
    public static final int FILAS = 6;
    public static final int COLUMNAS = 7;
    public static final int FICHAS_CONSECUTIVAS = 4;

    private Casilla[][] casillas;

    public Tablero() {
        casillas = new Casilla[FILAS, COLUMNAS]; //mal
    }

    private boolean columnaVacia(int columna) {
        return !casillas[0][columna].estaOcupada();
    }

    public boolean estaVacio(){

    }
}
