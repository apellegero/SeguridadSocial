package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Albert on 19/09/2016.
 */
public class SeguridadSocial {
ArrayList<Persona> persones = new ArrayList<Persona>() ;

    public void altaPersona(Persona persona){
        persones.add(persona);
    }

    public String obtenerTodas() {
        String resposta = null;
        for (Persona str : persones) {
            resposta += str.toString();
        }
        return resposta;
    }

    public void bajaPersona(String dni){
        persones.remove(dni);
    }

    Map<String, Persona> dni = new HashMap<>();

}
