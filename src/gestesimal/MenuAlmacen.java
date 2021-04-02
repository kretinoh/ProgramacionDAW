package gestesimal;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Menu simple para Almacén
 * 
 * @author KR371N0H
 *
 */
public class MenuAlmacen {

  // ATRIBUTOS QUE TENDRA NUESTRO MENU
  public String titulo;
  private String[] opciones;

  public MenuAlmacen(String titulo, String... opciones) {
    this.titulo = titulo;
    this.opciones = new String[opciones.length];
    // Guardaremos en i los valores de cada una de las opciones
    for (int i = 0; i < opciones.length; i++) {
      this.opciones[i] = opciones[i];
    }
  }

  public int seleccionar() {
    System.out.println(this.titulo);
    System.out.println("------------------");
    for (int i = 0; i < this.opciones.length; i++) {
      System.out.println(i + 1 + "- " + this.opciones[i]);
    }

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la opción: ");
    int n = s.nextInt();
    s.nextLine();
    return n;
  }

  
  @Override
  public String toString() {
    return "MenuAlmacen [titulo=" + titulo + ", opciones=" + Arrays.toString(opciones) + "]";
  } 
}

