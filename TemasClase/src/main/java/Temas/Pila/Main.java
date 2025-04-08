package Temas.Pila;

public class Main {
    public static void main(String[] args) {


        PilaAritmetica<String> pila = new PilaAritmetica<>();
        String polacaPre = "-*56/84";
        agregarPolacaAPila(pila, polacaPre);

        // Evaluamos la expresión prefija
        float resultado = evaluarExpresion(pila);
        System.out.println("Resultado final: " + resultado);
    }

    private static void agregarPolacaAPila(PilaAritmetica<String> pila, String polacaPre) {
        String[] arrPolaca = polacaPre.split("");

        for (int i = arrPolaca.length - 1; i >= 0; i--) {
            pila.push(arrPolaca[i]);
        }
    }

    private static float evaluarExpresion(PilaAritmetica<String> pila) {
        String dato = pila.pop();

        if (!esOperador(dato)) {
            return Float.parseFloat(dato);
        }

        float num1 = evaluarExpresion(pila);
        float num2 = evaluarExpresion(pila);

        float resultado = operar(num1, num2, dato);
        System.out.println("Operación: " + num1 + " " + dato + " " + num2 + " = " + resultado);
        return resultado;
    }


    private static boolean esOperador(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private static float operar(float num1, float num2, String operador) {
        switch (operador) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return num1 / num2;
            default: throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}
