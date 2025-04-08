package Temas.TallerListasEnlasadas.ListasSimplementeEnlazadas.Ejercicio1;

public class ListaEnlasada<E extends Comparable> {

    private Nodo<E> cabeza;
    private int size;

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

    public void intercalar(ListaEnlasada<E> lista1, ListaEnlasada<E> lista2) {

        int tamanioCiclo;

        if (lista1.size >= lista2.size){
            tamanioCiclo = lista1.size;
        }else{
            tamanioCiclo = lista2.size;
        }

        Nodo<E> actual1 = lista1.cabeza;
        Nodo<E> actual2 = lista2.cabeza;

        cabeza = actual1;
        actual1 = actual1.getSiguiente();
        Nodo<E> actual = cabeza;

        for(int i=0; i<= tamanioCiclo;){

            if(actual2 != null){
                actual.setSiguiente(actual2);
                actual2 = actual2.getSiguiente();
                actual = actual.getSiguiente();
            }

            if(actual1 != null){
                actual.setSiguiente(actual1);
                actual1 = actual1.getSiguiente();
                actual = actual.getSiguiente();
            }

            i++;
        }
    }
}
