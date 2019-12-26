package com.kadama.aprendepatrones;

public class patrones {
    private String Titulo;
    private String dato;

    public patrones() {
    }

    public patrones(String titulo, String dato) {
        Titulo = titulo;
        this.dato = dato;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}
