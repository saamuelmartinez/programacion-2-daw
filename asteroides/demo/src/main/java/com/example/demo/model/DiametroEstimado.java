package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DiametroEstimado {
    @JsonProperty("meters")
    private Metros metros;

    public Metros getMetros() {
        return metros;
    }

    public void setMetros(Metros metros) {
        this.metros = metros;
    }

    public static class Metros {
        @JsonProperty("estimated_diameter_max")
        private double diametroEstimadoMaximo;

        public double getDiametroEstimadoMaximo() {
            return diametroEstimadoMaximo;
        }

        public void setDiametroEstimadoMaximo(double diametroEstimadoMaximo) {
            this.diametroEstimadoMaximo = diametroEstimadoMaximo;
        }
    }
}