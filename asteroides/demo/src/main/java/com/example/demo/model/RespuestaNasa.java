package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public class RespuestaNasa {
    @JsonProperty("near_earth_objects")
    private Map<String, List<ObjetoCercanoTierra>> objetosCercanosTierra;

    public Map<String, List<ObjetoCercanoTierra>> getObjetosCercanosTierra() {
        return objetosCercanosTierra;
    }

    public void setObjetosCercanosTierra(Map<String, List<ObjetoCercanoTierra>> objetosCercanosTierra) {
        this.objetosCercanosTierra = objetosCercanosTierra;
    }
}