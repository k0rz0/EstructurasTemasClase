package Temas.ListasEnlasadasCircular;

public class Main {
    public static void main(String[] args) {

        ListaEnlazadaCircular<Integer> lista = new ListaEnlazadaCircular<>();
        lista.insertarFinal(7);
        lista.insertarFinal(20);
        lista.insertarFinal(10);
        lista.insertarFinal(5);

        lista.imprimirLista();
        lista.sort();
        lista.imprimirLista();

    }
}
