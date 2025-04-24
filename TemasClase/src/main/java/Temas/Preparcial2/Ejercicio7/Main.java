package Temas.Preparcial2.Ejercicio7;

import Temas.ListasEnlasadasSimples.ListaEnlasada;
import Temas.Preparcial2.Ejercicio2.Pila;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        Pila<Integer> pila2 = new Pila<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(2);
        pila.push(-6);

        int suma = sumarlista(pila);
        System.out.println("Suma: " + suma);
        pila2 = insertarValor(pila);

    }

    private static Pila<Integer> insertarValor(Pila<Integer> pila) {
        return pila;
    }

    private static int sumarlista(Pila<Integer> pila) {

        if (pila.isEmpty()){
            return 0;
        }
        int dato = pila.peek();
        int suma = pila.pop();

        suma = suma + sumarlista(pila);
        pila.push(dato
        );
        return suma;
    }
}
