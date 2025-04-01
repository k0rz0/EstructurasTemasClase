package Temas.Colection;

public class MultiplicacionArray {
    public static int multiplicar(int[] arr, int inicio, int fin) {
        if (inicio == fin) {
            return arr[inicio];
        }

        int medio = (inicio + fin) / 2;

        int izquierda = multiplicar(arr, inicio, medio);
        int derecha = multiplicar(arr, medio + 1, fin);

        return izquierda * derecha;
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int resultado = multiplicar(arreglo, 0, arreglo.length - 1);

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
