package com.company;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Albert on 28/09/2016.
 */
public class SeguridadSocialMap {

    Map<String, Persona> personaMapDni = new HashMap<>();
    Map<String, Persona> personaMapNumSS = new HashMap<>();

    public void altaPersona(Persona persona){

        if(!personaMapDni.containsKey(persona.getDni()) && !personaMapNumSS.containsKey(persona.getNumSeguridadSocial())){
            personaMapDni.put(persona.getDni(), persona);
            personaMapNumSS.put(persona.getNumSeguridadSocial(), persona);
        }
    }

    public Collection<Persona> obtenerTodas() {
        return personaMapDni.values();
    }

    public void bajaPersona(String dni){
        Persona persona = personaMapDni.get(dni);
        personaMapDni.remove(persona.getDni());
        personaMapNumSS.remove(persona.getNumSeguridadSocial());
    }

    public Persona obtenerPersonaPorDNI(String dni){
        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String nSS){
        return personaMapNumSS.get(nSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        return personaMapDni.values().stream().filter(persona -> persona.getSalario() >= min && persona.getSalario() <=max).collect(Collectors.toList());
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        return personaMapDni.values().stream().filter(persona -> persona.getEdad() > edad).collect(Collectors.toList());
    }


}
