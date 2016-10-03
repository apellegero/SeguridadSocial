package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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




}
