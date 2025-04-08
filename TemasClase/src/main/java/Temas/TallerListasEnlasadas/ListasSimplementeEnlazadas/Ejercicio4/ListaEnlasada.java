package Temas.TallerListasEnlasadas.ListasSimplementeEnlazadas.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ListaEnlasada<E extends Comparable> {

    private Nodo<E> cabeza;
    int size;

    ListaEnlasada() {
        this.cabeza = null;
        size = 0;
    }

    public void insertarFinal(E dato){

        Nodo<E> nuevo = new Nodo<>(dato);
        if (cabeza == null){
            cabeza = nuevo;
        }else {
            Nodo<E> actual = cabeza;

            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            size++;
        }
    }


   public void imprimirLista(){
        Nodo<E> actual = cabeza;
        while (actual != null){
            System.out.print(actual.getDato() + "->");
            actual = actual.getSiguiente();
        }
       System.out.println("Null");
   }

    public void dividirLista() {
        Nodo<E> actual = cabeza;
        int contador = size/2;

        List<E> posicionPares = new ArrayList<E>();
        List<E> posicionImpares = new ArrayList<E>();

        for (int i=0; i<=contador; i++){
            posicionPares.add(actual.getDato());

            if (actual.getSiguiente() != null){
                posicionImpares.add(actual.getSiguiente().getDato());
                actual = actual.getSiguiente().getSiguiente();
            }else{
                break;
            }

        }

        System.out.println(posicionPares);
        System.out.println(posicionImpares);

    }

}
