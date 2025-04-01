package Temas.ListasEnlasadasCircular;

public class ListaEnlasadaCircular<E extends Comparable> {

    private Nodo<E> cabeza;
    int size;

    ListaEnlasadaCircular() {
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

    public void insertarInicio(E dato){

        Nodo<E> nuevo = new Nodo<>(dato);
        if(cabeza == null){
            cabeza = nuevo;
        }else{
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
            size++;
        }
    }

    public void insertarDespuesDato(E dato, E nuevoDato){

        Nodo<E> antiguo = new Nodo<>(dato);
        Nodo<E> nuevo = new Nodo<>(nuevoDato);

        if(cabeza == null){
            cabeza = nuevo;
        }else{

            if (cabeza.getDato() == antiguo.getDato()){
                nuevo.setSiguiente(cabeza.getSiguiente());
                cabeza.setSiguiente(nuevo);
                return;
            }

            Nodo<E> actual = cabeza;
            while (actual.getSiguiente() !=null ){
                if (actual.getDato() == antiguo.getDato()){
                    nuevo.setSiguiente(actual.getSiguiente());
                    actual.setSiguiente(nuevo);
                    size++;
                    break;
                }
                actual = actual.getSiguiente();
            }
        }
    }

    public void insertarAntesDato(E dato, E nuevoDato){

        Nodo<E> antiguo = new Nodo<>(dato);
        Nodo<E> nuevo = new Nodo<>(nuevoDato);

        if(cabeza == null){
            cabeza = nuevo;
        }else{

            if (cabeza.getDato() == antiguo.getDato()){
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
                return;
            }

            Nodo<E> actual = cabeza;
            while (actual.getSiguiente() !=null ){
                if (actual.getSiguiente().getDato() == antiguo.getDato()){
                    nuevo.setSiguiente(actual.getSiguiente());
                    actual.setSiguiente(nuevo);
                    size++;
                    break;
                }
                actual = actual.getSiguiente();
            }
        }
    }

    public void eliminar(E dato){

        if (cabeza == null){
            return;
        }

        Nodo<E> actual = cabeza;

        if(actual.getDato() == dato){
            cabeza = cabeza.getSiguiente();
            return;
        }

        while (actual.getSiguiente() != null){
            if(actual.getSiguiente().getDato() == dato){
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                size--;
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    public void sort(){
        boolean intercambio = true;

        while (intercambio){
            intercambio = false;
            Nodo<E> actual = cabeza;
            while (actual.getSiguiente() != null){
                if (comparar(actual.getDato(),actual.getSiguiente().getDato()) > 0){
                    E tmp = actual.getDato();
                    actual.setDato(actual.getSiguiente().getDato());
                    actual.getSiguiente().setDato(tmp);
                    intercambio = true;
                }
                actual = actual.getSiguiente();
            }
        }
    }

    public int comparar(E dato1, E dato2){
        
        return dato1.compareTo(dato2);
    }

    public boolean obtener(E dato){
        Nodo<E> actual = cabeza;

        while(actual != null){
            if (actual.getDato() == dato){
                return true;
            }else{
                actual = actual.getSiguiente();
            }
        }
        return false;
    }

    public int localizar(E dato){
        Nodo<E> actual = cabeza;
        int contador = 0;

        while (actual != null){
            if(actual.getDato() == dato){
                return contador;
            }
            contador++;
        }
        return 0;
    }

   public void imnprimirLista(){
        Nodo<E> actual = cabeza;
        while (actual != null){
            System.out.print(actual.getDato() + "->");
            actual = actual.getSiguiente();
        }
       System.out.println("Null");
   }

}
