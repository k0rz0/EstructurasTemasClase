package Temas.Preparcial2.Ejercicio1V2;

public class Nodo<E> {
    private E dato;
    private Nodo<E> siguiente;

    public Nodo(E dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public void setDato(E dato){
        this.dato = dato;
    }

    public E getDato(){
        return this.dato;
    }

    public void setSiguiente(Nodo<E> nodo){
        this.siguiente = nodo;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }


}
