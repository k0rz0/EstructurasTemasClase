package Temas.TallerListasEnlasadas.ListasSimplementeEnlazadas.Ejercicio5;

public class Main {
    public static void main(String[] args) {

        ListaEnlasada<Integer> lista = new ListaEnlasada<>();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        lista.insertarFinal(5);
        lista.insertarFinal(6);

        System.out.println("¿La lista contiene un ciclo? " + lista.validarCliclo());
        //lista.imprimirLista();
    }
}
