package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /**ARRAY LIST**/
        SeguridadSocial seguridadSocial = new SeguridadSocial();

        Persona jose = new Persona("39425364H", "111111111", "Jose", "Tomás", 35, 45000.00);
        Persona maria =  new Persona("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);
        Persona carlos = new Persona("39425355Q", "22222222", "Carlos", "Torres", 22, 23000.00);
        Persona anna = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);


        seguridadSocial.altaPersona(jose);
        seguridadSocial.altaPersona(maria);
        seguridadSocial.altaPersona(carlos);
        seguridadSocial.altaPersona(anna);
        System.out.println("Altas a la seguridad social: " + seguridadSocial.obtenerTodas());


        System.out.println("Baja a la seguridad social: " + anna);
        seguridadSocial.bajaPersona(anna.getDni());


        System.out.println("Lista de afiliados a la S.S.: " + seguridadSocial.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + seguridadSocial.obtenerPersonaPorDNI(jose.getDni()));

        System.out.println("obtenerPersonaPorNumSS: " + seguridadSocial.obtenerPersonaPorNumSS(maria.getNumSeguridadSocial()));

        System.out.println("obtenerPersonasRangoSalarial: " + seguridadSocial.obtenerPersonasRangoSalarial(23000.00, 45000.00));

        System.out.println("obtenerPersonasMayoresQue: " + seguridadSocial.obtenerPersonasMayoresQue(25));

        /**HasMaps**/
        SeguridadSocial seguridadSocialMapDni = new SeguridadSocial();
        SeguridadSocial seguridadSocialMapSS = new SeguridadSocial();

        seguridadSocialMapDni.altaPersona(jose);
        seguridadSocialMapDni.altaPersona(maria);
        seguridadSocialMapDni.altaPersona(carlos);
        seguridadSocialMapDni.altaPersona(anna);

        seguridadSocialMapSS.altaPersona(jose);
        seguridadSocialMapSS.altaPersona(maria);
        seguridadSocialMapSS.altaPersona(carlos);
        seguridadSocialMapSS.altaPersona(anna);

        System.out.println("Altas a la seguridad social: " + seguridadSocialMapDni.obtenerTodas());

        System.out.println("Baja a la seguridad social: " + anna);
        seguridadSocialMapDni.bajaPersona(anna.getDni());

        System.out.println("Lista de afiliados a la S.S.: " + seguridadSocialMapDni.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + seguridadSocialMapDni.obtenerPersonaPorDNI(jose.getDni()));

        System.out.println("obtenerPersonaPorNumSS: " + seguridadSocialMapSS.obtenerPersonaPorNumSS(maria.getNumSeguridadSocial()));

        System.out.println("obtenerPersonasRangoSalarial: " + seguridadSocialMapDni.obtenerPersonasRangoSalarial(23000.00, 45000.00));

        System.out.println("obtenerPersonasMayoresQue: " + seguridadSocialMapDni.obtenerPersonasMayoresQue(25));

    }
}
