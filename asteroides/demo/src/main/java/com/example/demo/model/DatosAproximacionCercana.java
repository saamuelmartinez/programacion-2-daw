package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatosAproximacionCercana {
    @JsonProperty("relative_velocity")
    private VelocidadRelativa velocidadRelativa;

    @JsonProperty("miss_distance")
    private DistanciaFallo distanciaFallo;

    public VelocidadRelativa getVelocidadRelativa() {
        return velocidadRelativa;
    }

    public void setVelocidadRelativa(VelocidadRelativa velocidadRelativa) {
        this.velocidadRelativa = velocidadRelativa;
    }

    public DistanciaFallo getDistanciaFallo() {
        return distanciaFallo;
    }

    public void setDistanciaFallo(DistanciaFallo distanciaFallo) {
        this.distanciaFallo = distanciaFallo;
    }

    public static class VelocidadRelativa {
        @JsonProperty("kilometers_per_hour")
        private String kilometrosPorHora;

        public String getKilometrosPorHora() {
            return kilometrosPorHora;
        }

        public void setKilometrosPorHora(String kilometrosPorHora) {
            this.kilometrosPorHora = kilometrosPorHora;
        }
    }

    public static class DistanciaFallo {
        @JsonProperty("kilometers")
        private String kilometros;

        public String getKilometros() {
            return kilometros;
        }

        public void setKilometros(String kilometros) {
            this.kilometros = kilometros;
        }
    }
}