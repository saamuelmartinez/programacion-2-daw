package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ObjetoCercanoTierra {
    @JsonProperty("name")
    private String nombre;

    @JsonProperty("estimated_diameter")
    private DiametroEstimado diametroEstimado;

    @JsonProperty("is_potentially_hazardous_asteroid")
    private boolean potencialmentePeligroso;

    @JsonProperty("close_approach_data")
    private List<DatosAproximacionCercana> datosAproximacionCercana;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DiametroEstimado getDiametroEstimado() {
        return diametroEstimado;
    }

    public void setDiametroEstimado(DiametroEstimado diametroEstimado) {
        this.diametroEstimado = diametroEstimado;
    }

    public boolean isPotencialmentePeligroso() {
        return potencialmentePeligroso;
    }

    public void setPotencialmentePeligroso(boolean potencialmentePeligroso) {
        this.potencialmentePeligroso = potencialmentePeligroso;
    }

    public List<DatosAproximacionCercana> getDatosAproximacionCercana() {
        return datosAproximacionCercana;
    }

    public void setDatosAproximacionCercana(List<DatosAproximacionCercana> datosAproximacionCercana) {
        this.datosAproximacionCercana = datosAproximacionCercana;
    }
}