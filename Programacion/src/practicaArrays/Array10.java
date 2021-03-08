package practicaArrays;

import java.util.Scanner;

/**
 * 
 * @author Kretinoh
 *
 *  Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 *  y que los almacene en un array. El programa debe ser capaz de pasar todos
 *  los números pares a las primeras posiciones del array (del 0 en adelante) y
 *  todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 *  necesario.
 *
 *
 *
 */

public class Array10 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    int[] array = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];
    
    int par = 0;
    int impar = 0;
    
//    LLENAMOS EL ARRAY
    for (int i = 0; i < array.length; i++) {
   // Numero entero entre M y N con M menor que N ambos incluidos
      array[i] = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
      
      /**
       * Metemos los pares y los impares en distintos arrays
       */
      if (array[i] % 2 == 0) {
        pares[par++] = array[i];
      } else {
        impares[impar++] = array[i];
      }
    }
    
    /**
     * Mostramos el array principal
     */
    
    System.out.println("Array principal");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i] + " ");
    }
    System.out.println("\n");
    
    /**
     * Metemos al inicio del array los numeros pares
     */
    for (int i = 0; i < par; i++) {
      array[i] = pares[i];
    }
    
    /**
     * Metemos los impares detrás de estos
     */
    for (int i = par; i < array.length; i++) {
      array[i] = impares[i - par];
    }
    
    /**
     * Mostramos el array principal
     */
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]+ " ");
    }

  }

}
