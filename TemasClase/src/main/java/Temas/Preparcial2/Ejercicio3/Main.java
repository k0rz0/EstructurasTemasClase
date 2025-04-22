package Temas.Preparcial2.Ejercicio3;

import Temas.Bicola.Bicola;

public class Main {
    public static void main(String[] args) {

        Bicola<Persona> cola = new Bicola<Persona>();

        cola.encolarFinal(new Persona("Carlos", 35, "M"));
        cola.encolarFinal(new Persona("Ana", 28, "F"));
        cola.encolarFinal(new Persona("Luis", 45, "M"));
        cola.encolarFinal(new Persona("Sofía", 40, "F"));
        cola.encolarFinal(new Persona("Pedro", 25, "M"));

        filtrarCola(cola).imprimirLista();

    }

    private static Bicola filtrarCola(Bicola<Persona> cola) {
        Bicola<Persona> colaFiltrada = new Bicola<>();

        while (!cola.isVacio()){
            Persona p = cola.desencolarInicio();

            if(!(p.getSexo() == "M" && p.getEdad() >= 30 && p.getEdad() <= 50)){
               colaFiltrada.encolarFinal(p);
            }
        }

        return colaFiltrada;
    }
}
