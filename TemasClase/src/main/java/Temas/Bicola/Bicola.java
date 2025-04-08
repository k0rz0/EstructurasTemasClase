package Temas.Bicola;

public class Bicola<E extends Comparable> {

    private Nodo<E> cabeza;
    private Nodo<E> cola;
    int size;

    public Bicola() {
        this.cabeza = null;
        size = 0;
    }

    public void encolarFinal(E dato){

        Nodo<E> nuevo = new Nodo<>(dato);
        if (cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
        }else {
            cola.setSiguiente(nuevo);
            cola = nuevo;
        }
            size++;
    }

    public void encolarInicio(E dato){

        Nodo<E> nuevo = new Nodo<>(dato);
        if (cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
        }else {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
        size++;
    }

    public void desencolarInicio(){

        if (cabeza == null){
            return;
        }
        cabeza = cabeza.getSiguiente();
    }

    public void desencolarFinal(){

        if (isVacio()){
            return;
        }

        Nodo<E> actual = cabeza;
        while (actual.getSiguiente() != cola){
            actual = actual.getSiguiente();
        }
        cola = actual;
        actual.setSiguiente(null);
    }

    public boolean isVacio(){
        return size == 0;
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
