package Temas.Pila2;

public class PilaAritmetica<E> {
    private Nodo<E> top;
    private int size;

    public PilaAritmetica(){
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


}
