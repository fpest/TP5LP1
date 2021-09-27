package TP5LP1;

import java.lang.reflect.Array;

public class Arreglo {

    static int resultado;

    public static void sumarLista(int[] arregloNumeros) {
        resultado = 0;
        for (int i = 0; i < arregloNumeros.length; i++) {
            resultado = resultado + arregloNumeros[i];
        }
        if (arregloNumeros.length != 0) {
            System.out.println("La suma de los numeros del arreglo unidimensional es: " + resultado);
            System.out.println("El promedio de los numeros del arreglo unidimensional es: " + (double) resultado / arregloNumeros.length);
        } else {
            System.out.println("No hay numeros en el arreglo unidimensional...");
        }
    }

    public static int buscarMayor(int[][] arregloBidNumeros) {

        resultado = 0;
        for (int i = 0; i < arregloBidNumeros.length; i++) {
            for (int j = 0; j < arregloBidNumeros[i].length; j++) {

                if (arregloBidNumeros[i][j] > resultado) {
                    resultado = arregloBidNumeros[i][j];
                }
            }
        }
        return resultado;
    }

    public static int cuentaVocales(String cadena) {
        resultado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    resultado++;
            }
        }
        return resultado;
    }

    public static int cuentaCaracter(String cadena, char caracter) {

        resultado = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                resultado++;
            }
        }
        return resultado;
    }
;
}
