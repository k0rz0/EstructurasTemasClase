package Temas.Preparcial.Ejecicio2;

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

        ordenarPrimos(pila);
    }

    public static void ordenarPrimos( Pila <Integer> pila){

        for(int i = 0; i < pila.getSize(); i++){

            int num1 = pila.pop();

            if(validarPrimo(num1) || num1 == 1){
                int num2 = pila.pop();
                num1 = pila.pop();

                pila.push(num2);
                pila.push(num1);
            }else{
                pila.push(num1);
            }

        }
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
