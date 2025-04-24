package Temas.Preparcial2.Ejercicio5;

import Temas.Preparcial2.Ejercicio2.Pila;

public class Main {
    public static void main(String[] args) {
        String cadena = "[()]";

        boolean balanceada = validarBalanceada(cadena);

        System.out.println("La cadena esta balanceada? : " + balanceada);

    }

    private static boolean validarBalanceada(String cadena){
        Pila<String> pila = new Pila<>();
        for(String caracter: cadena.split("")){
            if(caracter.equals("(") || caracter.equals("{") || caracter.equals("[")){
                pila.push(caracter);
            } else if (caracter.equals(")") || caracter.equals("}") || caracter.equals("]")) {
                if (pila.isEmpty()){
                    return false;
                }

                String dato = pila.pop();
                if( caracter.equals(")") && !dato.equals("(") ||
                    caracter.equals("}") && !dato.equals("{") ||
                    caracter.equals("]") && !dato.equals("[") ){
                    return false;
                }
            }

        }
        return pila.isEmpty();
    }

    private static boolean validarBalanceada2(String cadena){

        Pila<String> pila = new Pila<>();
        for(String caracter : cadena.split("")){
            pila.push(caracter);
        }

        int parAbrir = 0;
        int corAbrir = 0;
        int llaAbrir = 0;
        int parCerrar = 0;
        int corCerrar = 0;
        int llaCerrar = 0;

        while (!pila.isEmpty()){
            String dato = pila.pop();

            switch (dato){
                case "(":
                    parAbrir++;
                    break;
                case ")":
                    parCerrar++;
                    break;
                case "[":
                    corAbrir++;
                    break;
                case "]":
                    corCerrar++;
                    break;
                case "{":
                    llaAbrir++;
                    break;
                case "}":
                    llaCerrar++;
                    break;
            }

        }

        if(parAbrir == parCerrar && corAbrir == corCerrar && llaAbrir == llaCerrar){
            return true;
        }else {
            return false;
        }
    }
}
