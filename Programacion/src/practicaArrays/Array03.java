package practicaArrays;

import java.util.Scanner;

public class Array03 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      System.out.print("Introduzca un numero para el array > ");

      array[i] = s.nextInt();
    }
    for (int i = array.length - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }
  }

}
