package com.example.demo.service;

import com.example.demo.model.Asteroide;
import com.example.demo.model.ObjetoCercanoTierra;
import com.example.demo.model.RespuestaNasa;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ServicioAsteroide {

    @Value("${nasa.api.key}")
    private String claveApi;

    private final RestTemplate plantillaRest = new RestTemplate();

    public List<Asteroide> obtenerAsteroidesPeligrosos(String fecha) {
        String url = "https://api.nasa.gov/neo/rest/v1/feed?start_date=" + fecha + "&end_date=" + fecha + "&api_key=" + claveApi;
        RespuestaNasa respuesta = plantillaRest.getForObject(url, RespuestaNasa.class);
        List<Asteroide> peligrosos = new ArrayList<>();

        if (respuesta != null && respuesta.getObjetosCercanosTierra() != null) {
            Map<String, List<ObjetoCercanoTierra>> datosDiarios = respuesta.getObjetosCercanosTierra();
            List<ObjetoCercanoTierra> asteroidesDelDia = datosDiarios.get(fecha);

            if (asteroidesDelDia != null) {
                for (ObjetoCercanoTierra oct : asteroidesDelDia) {
                    if (oct.isPotencialmentePeligroso()) {
                        Asteroide asteroide = new Asteroide(
                                oct.getNombre(),
                                oct.getDiametroEstimado().getMetros().getDiametroEstimadoMaximo(),
                                oct.getDatosAproximacionCercana().get(0).getDistanciaFallo().getKilometros(),
                                oct.getDatosAproximacionCercana().get(0).getVelocidadRelativa().getKilometrosPorHora(),
                                oct.isPotencialmentePeligroso()
                        );
                        peligrosos.add(asteroide);
                    }
                }
            }
        }
        return peligrosos;
    }
}