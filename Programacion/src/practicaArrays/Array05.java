package practicaArrays;

import java.util.Scanner;

public class Array05 {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);

    int[] array = new int[10];
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;

    System.out.println("Introduce 10 numeros para el array > ");

    for (int i = 0; i < 10; i++) {

      array[i] = s.nextInt();

      if (array[i] < maximo) {
        maximo = array[i];
      }
      if (array[i] > minimo) {
        minimo = array[i];
      }
    }
    
    System.out.println();

    for (int i = 0; i < 10; i++) {

      System.out.print(array[i]);

      if (array[i] == maximo) {
        System.out.print(" máximo");
      }
      if (array[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }

  }

}
