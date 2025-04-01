package Temas.TallerListasEnlasadas.Ejercicio3;

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

    public void eliminar(){

        if (cabeza == null){
            return;
        }

        Nodo<E> actual = cabeza;
        Nodo<E> iterador;
        Nodo<E> anterior = actual.getSiguiente();

        while (actual.getSiguiente() != null){

            iterador = actual.getSiguiente();
            while(iterador != null){

                if(actual.getDato() == iterador.getDato()){
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                    size--;
                    return;
                }

                iterador = iterador.getSiguiente();
            }
            actual = actual.getSiguiente();
        }
    }
}
