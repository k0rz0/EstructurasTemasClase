package Temas.TallerListasEnlasadas.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        ListaEnlasada<Integer> lista = new ListaEnlasada<>();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        lista.insertarFinal(4);
        lista.insertarFinal(4);

        lista.eliminarDuplicados();
        lista.imprimirLista();
    }
}
