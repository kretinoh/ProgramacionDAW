package ficherosEjercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * 
 * @author KR371N0H
 *
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    try (var file = new BufferedWriter(new FileWriter("primos.dat"))) {
      for (int i = 1; i <= 500; i++) {
        if (esPrimo(i)) {
          file.write(String.valueOf(i));
          file.newLine();
        }
      }
    } catch (Exception e) {
      System.out.println("No he podido crear el fichero");
    }

  }

  /**
   * Devuelve true si es primo
   * 
   */
  public static boolean esPrimo(int numero) {
    int contador = 2;
    boolean primo = true;
    while ((primo) && (contador != numero)) {
      if (numero % contador == 0)
        primo = false;
      contador++;
    }
    return primo;
  }
}
