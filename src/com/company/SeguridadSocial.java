package com.company;

import java.util.*;
import java.util.stream.Collectors;

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

    public Optional<Persona> obtenerPersonaPorDNI(String dni){
        return persones.stream().filter(persona -> persona.getDni().equals(dni)).findFirst();
    }

    public Optional<Persona> obtenerPersonaPorNumSS(String nSS){
        return persones.stream().filter(persona -> persona.getNumSeguridadSocial().equals(nSS)).findFirst();
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        return persones.stream().filter(persona -> persona.getSalario() >= min && persona.getSalario() <= max).collect(Collectors.toList());
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        return persones.stream().filter(persona -> persona.getEdad() > edad).collect(Collectors.toList());
    }
}
