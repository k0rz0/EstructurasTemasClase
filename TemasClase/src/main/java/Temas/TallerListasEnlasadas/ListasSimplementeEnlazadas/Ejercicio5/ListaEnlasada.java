package Temas.TallerListasEnlasadas.ListasSimplementeEnlazadas.Ejercicio5;

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

            /*if(dato.equals(6)){
                nuevo.setSiguiente(cabeza); // Se agrega este codigo para probar si funciona validarCliclo()
            }*/
            size++;
        }
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

   public void imprimirLista(){
        Nodo<E> actual = cabeza;
        while (actual != null){
            System.out.print(actual.getDato() + "->");
            actual = actual.getSiguiente();
        }
       System.out.println("Null");
   }



}
