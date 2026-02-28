package com.example.demo.model;

public class Asteroide {
    private String nombre;
    private double diametroMaximo;
    private String distanciaMinima;
    private String velocidadRelativa;
    private boolean peligroso;

    public Asteroide() {
    }

    public Asteroide(String nombre, double diametroMaximo, String distanciaMinima, String velocidadRelativa, boolean peligroso) {
        this.nombre = nombre;
        this.diametroMaximo = diametroMaximo;
        this.distanciaMinima = distanciaMinima;
        this.velocidadRelativa = velocidadRelativa;
        this.peligroso = peligroso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiametroMaximo() {
        return diametroMaximo;
    }

    public void setDiametroMaximo(double diametroMaximo) {
        this.diametroMaximo = diametroMaximo;
    }

    public String getDistanciaMinima() {
        return distanciaMinima;
    }

    public void setDistanciaMinima(String distanciaMinima) {
        this.distanciaMinima = distanciaMinima;
    }

    public String getVelocidadRelativa() {
        return velocidadRelativa;
    }

    public void setVelocidadRelativa(String velocidadRelativa) {
        this.velocidadRelativa = velocidadRelativa;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }
}