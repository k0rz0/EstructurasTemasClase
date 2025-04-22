package Temas.Preparcial2.Ejercicio1V2;

public class ListaSimple <E> {
    private Nodo<E> cabeza;
    private int size;

    public ListaSimple(){
        cabeza = null;
        size = 0;
    }

    public void push(E dato){

        Nodo<E> nuevo = new Nodo<>(dato);

        if(cabeza == null){
            cabeza = nuevo;
        }else{
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }

        size++;
    }

    public E peek(){
        if (cabeza == null) {
            return null; // Evitar el NullPointer si la lista está vacía
        }
        return cabeza.getDato();
    }

    public E pop(){
        if(cabeza == null){
            return null;
        }else{
            E dato = cabeza.getDato();
            cabeza = cabeza.getSiguiente();
            size--;
            return dato;
        }
    }

    public void imprimir(){
        Nodo<E> actual = cabeza;

        while (actual.getSiguiente() != null){
            System.out.print(actual.getDato() + "->");
            actual = actual.getSiguiente();
        }

        System.out.println(actual.getDato());
    }

}
