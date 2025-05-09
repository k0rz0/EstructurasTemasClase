package Temas.TallerListasEnlasadas.ListasCirculares.Ejercicio3;

public class Nodo<E> {
    private E dato;
    private Nodo<E> siguiente;

    public Nodo(E dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }
}
