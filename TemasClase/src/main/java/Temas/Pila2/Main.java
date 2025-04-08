package Temas.Pila2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> expresionIn = new ArrayList<>();
        List<String> expresionPost = new ArrayList<>();

        evaluar("(a+b+c)-d");


    }

    public static StringBuilder evaluar(String expresion){
        StringBuilder resultado = new StringBuilder();
        PilaAritmetica<Character> pila = new PilaAritmetica<>();



        return resultado;
    }


}
