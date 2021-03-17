package ficherosEjercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EjercicioCaesar {

  public static void main(String[] args) {
    // Comprobar que num de parámetros sean correctos
    terminarSiErrorNumArgumentos(args);

    // Lectura del archivo
    List<String> allLines = getAllLines(args[0]);
    
    
    try (var destinationFile = new BufferedWriter(new FileWriter(args[1]))){
      
      for (String linea : allLines) {
        destinationFile.write(encriptar(linea));
        destinationFile.newLine();
      }
    } catch (IOException e) {
      System.err.println("No se ha podido escribir en "+ args[1]);
      System.exit(3);
    }

  }


  private static void terminarSiErrorNumArgumentos(String[] args) {
    if (args.length < 1 || args.length > 2) {
      System.err.println("Número de parámetros incorrectos");
      System.exit(1);
    }
  }
  
//  Obtiene las lineas del fichero
  private static List<String> getAllLines(String fichero) {
    List<String> allLines = null;
    try {
      allLines = Files.readAllLines(Paths.get(fichero));

    } catch (IOException e) {
      System.err.println("No se ha podido abrir el fichero " + fichero);
      System.exit(2);
    }
    return allLines;
  }
  
  //Encriptar lineas
  private static String encriptar(String linea) {
    // TODO Encriptar Linea
    return "ENCRIPTAR " + linea;
  }

}
