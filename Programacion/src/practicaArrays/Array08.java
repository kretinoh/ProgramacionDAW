package practicaArrays;

import java.util.Scanner;

/**
 * 
 * @author Kretinoh
 * 
 *         EJERCICIO 8 Realiza un programa que pida la temperatura media que ha hecho en cada mes de
 *         un determinado año y que muestre a continuación un diagrama de barras horizontales con
 *         esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier
 *         otro carácter.
 *
 *
 *         pedir 12 temperaturas
 *
 */
public class Array08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] temperaturas = new int[12];

    System.out.println("Introduce la media de temperatura de cada mes separados por 'INTRO' > ");
    for (int i = 0; i < temperaturas.length; i++) {
      temperaturas[i] = s.nextInt();
    }
    System.out.println();

    for (int i = 0; i < temperaturas.length; i++) {
      System.out.println("Temperaturas del mes");
      for (int j = 0; j < temperaturas[i]; j++) {

        System.out.print("*");
      }
      System.out.println("");
    }

  }

}
