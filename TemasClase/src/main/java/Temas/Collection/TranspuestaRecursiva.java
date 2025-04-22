package Temas.Collection;

public class TranspuestaRecursiva {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2},
                {4, 5},
                {7, 8}
        };

        int [][] transpuesta = {
                {0, 0, 0},
                {0, 0, 0}
        };

        transponerMatriz(matriz, transpuesta, 0, 0);

        imprimirMatriz(transpuesta);
    }

    private static void transponerMatriz(int[][] matriz, int[][] transpuesta, int i, int j) {

        if (i < matriz.length) {
            if (j < matriz[0].length) {
                transpuesta[j][i] = matriz[i][j];

                if (i == matriz.length - 1) {
                    transponerMatriz(matriz, transpuesta, 0, j+1);
                }else{
                    transponerMatriz(matriz, transpuesta, i+1, j);
                }
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

}
