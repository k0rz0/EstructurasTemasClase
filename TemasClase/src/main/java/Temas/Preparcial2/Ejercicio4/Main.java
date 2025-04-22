package Temas.Preparcial2.Ejercicio4;

import Temas.Preparcial2.Ejercicio2.Pila;

public class Main {
    public static void main(String[] args) {
        int numero = 850;

        int binario = convertir_A_Binario(numero);

        System.out.println(binario);

    }

    private static int convertir_A_Binario(int numero) {
        String binario = "";
        Pila<Integer> pilaBinaria = new Pila<>();

        while (numero != 0 && numero != 1){
            int reciduo = numero % 2;
            pilaBinaria.push(reciduo);
            numero /= 2;
        }

        pilaBinaria.push(numero);

        while (!pilaBinaria.isEmpty()){
            binario = binario + pilaBinaria.pop();
        }

        return Integer.parseInt(binario);
    }
}
