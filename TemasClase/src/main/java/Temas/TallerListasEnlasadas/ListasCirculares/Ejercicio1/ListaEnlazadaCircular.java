package Temas.TallerListasEnlasadas.ListasCirculares.Ejercicio1;

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

    public <E> E obtenerTurnoActual(){
        return (E) cabeza.getDato();
    }

    public void siguienteTurno(){
        cabeza = cabeza.getSiguiente();
    }

    public void eliminarJugador(){
        Nodo<E> actual = cabeza;

        Nodo<E> iterador = cola;
        while (iterador.getSiguiente() != actual){
            iterador = iterador.getSiguiente();
        }

        iterador.setSiguiente(actual.getSiguiente());
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
