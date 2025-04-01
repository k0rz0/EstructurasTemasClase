package Temas.ListasEnlasadasCircular;

public class Main {
    public static void main(String[] args) {

        ListaEnlasadaCircular<Integer> lista = new ListaEnlasadaCircular<>();
        lista.insertarFinal(7);
        lista.insertarFinal(20);
        lista.insertarFinal(10);
        lista.insertarFinal(5);

/*        lista.insertarInicio(0);

        lista.eliminar(0);

        lista.insertarDespuesDato(2, 54);
        lista.insertarAntesDato(0, 47);*/


        lista.imnprimirLista();
        lista.sort();
        lista.imnprimirLista();

    }
}
