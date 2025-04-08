package Temas.TallerListasEnlasadas.ListasCirculares.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        ListaEnlazadaCircular<Integer> lista = new ListaEnlazadaCircular<>();
        lista.insertarFinal(7);
        lista.insertarFinal(20);
        lista.insertarFinal(10);
        lista.insertarFinal(5);

        System.out.println("¿La lista es circular? "+ lista.validarCliclo());

    }
}
