package Temas.TallerListasEnlasadas.Ejercicio2;

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

    public void reverse() {
        Nodo<E> actual = cabeza;
        Nodo<E> anterior = null;
        Nodo<E> siguienteTmp = null;

        while (actual != null){

            siguienteTmp = actual.getSiguiente();

            if (actual == cabeza){
                actual.setSiguiente(null);
            }else{
                actual.setSiguiente(anterior);
            }

            anterior = actual;
            actual = siguienteTmp;
        }

        cabeza = anterior;
    }
}
