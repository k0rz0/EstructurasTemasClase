package Temas.Preparcial2.Ejercicio2;

public class Pila<E> {
    private Nodo<E> top;
    private int size;

    public Pila(){
        top = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void push(E dato){
        Nodo<E> nuevo = new Nodo<>(dato);
        if(isEmpty()){
            top = nuevo;
        }else{
            nuevo.setSiguiente(top);
            top = nuevo;
        }
        size++;
    }

    public <E> E pop(){
        E dato = null;
        if(!isEmpty()){
            dato = (E) top.getDato();
            top = top.getSiguiente();
        }
        size --;
        return dato;
    }

    public <E> E peek(){
        E dato = null;
        if(!isEmpty()){
            dato = (E) top.getDato();
        }
        return dato;
    }

    public void imprimir(){
        Nodo<E> actual = top;

        while (actual.getSiguiente() != null){
            System.out.print(actual.getDato() + "->");
            actual = actual.getSiguiente();
        }

        System.out.println(actual.getDato());
    }
}
