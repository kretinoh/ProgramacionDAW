package ficherosEjercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Quitar comentarios de un fichero
 * 
 * @author KR371N0H
 *
 * 
 *
 */
public class QuitaComentarios {

  public static void main(String[] args) {

    try {
      BufferedWriter destinationFile = new BufferedWriter(new FileWriter(args[1]));
      // Leemos todas las lineas del fichero pasado por parámetro y la guardamos en allLines
      List<String> allLines = Files.readAllLines(Paths.get(args[0]));

      // Guardamos cada linea del fichero en cada iteracion en la variable linea
      for (String linea : allLines) {
        if (!((linea.contains("/**")) || (linea.contains("//")))) {
          destinationFile.write(linea);
        } else if (linea.contains("//")) {
          // Con substring cogemos desde el inicio hasta donde se encuentra el simbolo "//"
          linea = linea.substring(0, linea.indexOf("//"));
          destinationFile.write(linea);
        } else if (linea.contains("/**")) {

        }
        // Salto de linea
        destinationFile.newLine();
      }
      destinationFile.close();

    } catch (Exception e) {
      System.out.println("No se ha podido abrir el archivo.");
    }

  }

}
