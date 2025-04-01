package Temas.TallerListasEnlasadas.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ListaEnlasada<Integer> lista1 = new ListaEnlasada<>();
        ListaEnlasada<Integer> lista2 = new ListaEnlasada<>();
        ListaEnlasada<Integer> lista3 = new ListaEnlasada<>();

        lista1.insertarFinal(1);
        lista1.insertarFinal(3);
        lista1.insertarFinal(5);

        lista2.insertarFinal(2);
        lista2.insertarFinal(4);
        lista2.insertarFinal(6);

        lista3.intercalar(lista1, lista2);

        lista3.imprimirLista();

    }
}
