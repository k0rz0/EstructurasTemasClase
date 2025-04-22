package Temas.Preparcial2.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Pila<Integer> pila = new Pila<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        pila.push(8);

        ordenarPrimos(pila).imprimir();
    }

    public static Pila<Integer> ordenarPrimos( Pila <Integer> pila){
        Pila<Integer> pilaPrimos = new Pila<>();
        int size = pila.getSize();
        for(int i = 0; i < size; i++){
            int num = pila.pop();
            if(validarPrimo(num) || num == 1){
                pilaPrimos.push(num);
            }
        }
        return pilaPrimos;
    }


    private static boolean validarPrimo(int dato) {
        int contador = 0;
        float reciduo = 0;
        for(int i = 1; i <= dato; i++){
            reciduo = dato%i;
            if (reciduo == 0){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }
        return false;
    }
}
