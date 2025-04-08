package Temas.Bicola;

public class Main {
    public static void main(String[] args) {

        Bicola<Integer> lista = new Bicola<>();
        lista.encolarFinal(7);
        lista.encolarFinal(20);
        lista.encolarFinal(10);
        lista.encolarFinal(5);

        lista.imprimirLista();
        //lista.sort();
        lista.imprimirLista();

    }
}
