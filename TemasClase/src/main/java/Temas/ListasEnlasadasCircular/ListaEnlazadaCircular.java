package Temas.ListasEnlasadasCircular;

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

    public void insertarInicio(E dato){
        Nodo<E> nuevo = new Nodo<>(dato);
        if(cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
            cola.setSiguiente(cabeza);
        }else{
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
            cola.setSiguiente(cabeza);
        }
        size++;
    }

    public void insertarDespuesDato(E dato, E nuevoDato) {
        if (cabeza == null) return;
        Nodo<E> actual = cabeza;
        do {
            if (actual.getDato().equals(dato)) {
                Nodo<E> nuevo = new Nodo<>(nuevoDato);
                nuevo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nuevo);
                if (actual == cola) cola = nuevo;
                size++;
                return;
            }
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public void insertarAntesDato(E dato, E nuevoDato) {
        if (cabeza == null) return;
        Nodo<E> nuevo = new Nodo<>(nuevoDato);
        Nodo<E> actual = cabeza;
        Nodo<E> previo = cola;
        do {
            if (actual.getDato().equals(dato)) {
                nuevo.setSiguiente(actual);
                previo.setSiguiente(nuevo);
                if (actual == cabeza) cabeza = nuevo;
                size++;
                return;
            }
            previo = actual;
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public void eliminar(E dato) {
        if (cabeza == null) return;

        Nodo<E> actual = cabeza;
        Nodo<E> previo = cola;

        do {
            if (actual.getDato().equals(dato)) {
                if (actual == cabeza) cabeza = cabeza.getSiguiente();
                if (actual == cola) cola = previo;
                previo.setSiguiente(actual.getSiguiente());
                size--;
                return;
            }
            previo = actual;
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }
    public void sort() {
        if (cabeza == null || cabeza.getSiguiente() == cabeza) return;
        boolean intercambio;
        do {
            intercambio = false;
            Nodo<E> actual = cabeza;
            do {
                Nodo<E> siguiente = actual.getSiguiente();
                if (comparar(actual.getDato(), siguiente.getDato()) > 0) {
                    E tmp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(tmp);
                    intercambio = true;
                }
                actual = actual.getSiguiente();
            } while (actual.getSiguiente() != cabeza);
        } while (intercambio);
    }

    public int comparar(E dato1, E dato2){
        return dato1.compareTo(dato2);
    }

    public boolean obtener(E dato) {
        if (cabeza == null) return false;
        Nodo<E> actual = cabeza;
        do {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        } while (actual != cabeza);
        return false;
    }
    public int localizar(E dato) {
        if (cabeza == null) return -1;
        Nodo<E> actual = cabeza;
        int contador = 0;
        do {
            if (actual.getDato().equals(dato)) return contador;
            contador++;
            actual = actual.getSiguiente();
        } while (actual != cabeza);
        return -1;
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
