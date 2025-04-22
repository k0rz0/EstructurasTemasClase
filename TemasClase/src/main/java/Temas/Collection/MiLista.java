package Temas.Collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MiLista implements Iterator<String> {
    String[] array = {"Iterador0", "Iterador1", "Iterador2", "Iterador3", "Iterador4", "Iterador5", "Iterador6", "Iterador7"};
    private int indice = 0;
    private boolean puedeEliminar = false;
    private int tamaño = array.length;

    // Verifica si hay más elementos
    @Override
    public boolean hasNext() {
        return indice < tamaño;
    }

    // Devuelve el siguiente elemento
    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más elementos");
        }
        puedeEliminar = true;

        return array[indice];
    }

    // Elimina el último elemento devuelto por next()
    @Override
    public void remove() {
        if (!puedeEliminar) {
            throw new IllegalStateException("No se puede llamar a remove() sin next()");
        }
        // Desplazar los elementos restantes hacia la izquierda
        for (int i = indice - 1; i < tamaño - 1; i++) {
            array[i] = array[i + 1];
        }
        tamaño--;
        indice--;
        puedeEliminar = false; // Evitar múltiples llamadas a remove()
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}

class MiListaTest {
    public static void main(String[] args) {
        MiLista miLista = new MiLista();

        while (miLista.hasNext()) {
            System.out.println(miLista.next());

            int indice = miLista.getIndice() + 2;
            miLista.setIndice(indice);
        }
    }
}
