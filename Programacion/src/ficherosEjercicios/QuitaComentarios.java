package ficherosEjercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Quitar comentarios de un fichero
 * 
 * @author KR371N0H
 *
 * 
 */
public class QuitaComentarios {

  public static void main(String[] args) {
    String linea;
    boolean comentarioBloque = false;

    /**
     * Comprobamos que se nos pasen 2 parámetros en el programa
     */
    if (args.length != 2) {
      System.err.println("Error en el numero de parámetros");
      System.exit(1);
    }

    try {
      // Abrimos lectura del fichero 0
      BufferedReader file = new BufferedReader(new FileReader(args[0]));

      // Creamos escritura argumento 1
      BufferedWriter destinationFile = new BufferedWriter(new FileWriter(args[1]));

      while ((linea = file.readLine()) != null) {
        // Buscamos comentarios de bloque
        if (linea.indexOf("/*") != -1) {
          comentarioBloque = true;
        }

        // Buscamos el final del comentario
        if (linea.indexOf("*/") != -1) {
          comentarioBloque = false;
          linea = linea.substring(linea.indexOf("/") + 1, linea.length());
        }

        // Buscamos comentarios de linea
        if (linea.indexOf("//") != -1) {
          linea = linea.substring(0, linea.indexOf("/") - 1);
        }

        if (!comentarioBloque) {
          destinationFile.write(linea);
          destinationFile.newLine();
        }
      }
      file.close();
      destinationFile.close();
    } catch (IOException e) {
      
      System.out.println("No se ha podido abrir el archivo o no se encontró el fichero.");
    }

  }


}
