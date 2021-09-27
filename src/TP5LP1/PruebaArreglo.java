
package TP5LP1;

import java.lang.reflect.Array;

public class PruebaArreglo {

    public static void main(String[] args) {

        int[] arregloNumerosUnid = {3,2,8,20};
        
        int[][]  arregloNumerosBidi = new int[][] {{109,2,39,4},{5,6,7},{8,9}};
        
        
        //Probamos el método sumarLista (que muestra la suma de la lista)
        Arreglo.sumarLista(arregloNumerosUnid);
       
        //Probamos el método buscarMayor (que retorna el entero más grande del arreglo)
        System.out.println("El numero mayor del arreglo bidimensional es: " + Arreglo.buscarMayor(arregloNumerosBidi));
              
        //Probamos el método cuentaVocales (que retorna la cantidad de vocales en un string)          
        System.out.println("La cantidad de vocales en la cadena es: " + Arreglo.cuentaVocales("Hola que tal..."));
       
        //Probamos el método cuentaCaracter (que retorna la cantidad de veces que se repite un caracter determinado en un string)
        System.out.println("La cantidad de caracteres buscados en la cadena es: " + Arreglo.cuentaCaracter("Hola que tal...", 'l'));
              
        
    }
    
}
