package Temas.Preparcial2.Ejercicio1V2;

public class Main {
    public static void main(String[] args) {

        ListaSimple<Integer> lista = new ListaSimple<>();

        lista.push(1);
        lista.push(2);
        lista.push(3);
        lista.push(4);
        lista.push(5);

        lista.imprimir();

        invertirLista(lista).imprimir();
    }

    private static ListaSimple<Integer> invertirLista(ListaSimple<Integer> lista) {
        ListaSimple<Integer> listaInvertida = new ListaSimple<>();

        while (lista.peek() != null) {
            listaInvertida.push(lista.pop());
        }

        return listaInvertida;
    }

}
