package Temas.TallerListasEnlasadas.ListasCirculares.Ejercicio4;

public class ListaEnlazadaCircular<E extends Comparable> {
    private Nodo<E> cabeza;
    private Nodo<E> cola;
    private int size;

    public ListaEnlazadaCircular() {
        this.cabeza = null;
        this.cola = null;
        this.size = 0;
    }

    public void insertarFinal(E dato){
        Nodo<E> nuevo = new Nodo<>(dato);
        if (cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
            cola.setSiguiente(cabeza);
        }else {
            cola.setSiguiente(nuevo);
            cola = nuevo;
            nuevo.setSiguiente(cabeza);
        }
        size++;
    }

    public boolean validarCliclo(){
        Nodo<E> tortoise = cabeza;
        Nodo<E> hare = cabeza;

        while (tortoise.getSiguiente() != null &&
                hare.getSiguiente().getSiguiente() != null ){

            tortoise = tortoise.getSiguiente();
            hare = hare.getSiguiente().getSiguiente();

            if(tortoise == hare){
                return true;
            }
        }
        return false;
    }

    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo<E> actual = cabeza;
        do {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        } while (actual != cabeza);
        System.out.println("(Inicio)");
    }

}
