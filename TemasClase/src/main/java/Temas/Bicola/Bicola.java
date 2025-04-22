package Temas.Bicola;

public class Bicola<E> {

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

    public <E> E desencolarInicio(){
        E dato = null;
        if(!isVacio()){
            dato = (E) cabeza.getDato();
            cabeza = cabeza.getSiguiente();
        }
        size --;
        return dato;
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
