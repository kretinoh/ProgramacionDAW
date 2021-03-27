package gestisimal;

import java.util.Scanner;

public class TestAlmacen {

  public static void main(String[] args)
      throws ArticuloExisteException, EsNegativo, ArticuloNoExisteException {
    // GENERAMOS UN ALMACEN
    Almacen almacen = new Almacen();

    // MENU
    MenuAlmacen menu = new MenuAlmacen("Opciones de gestión de almacén", "Añadir artículo.",
        "Eliminar Artículo.", "Decrementar existencias.", "Incrementar existencias.",
        "Acceder al artículo por el código", "Listar almacén", "Salir del programa");
    boolean out = false;
    do {
      switch (menu.seleccionar()) {
        // AÑADIR ARTÍCULOS
        case 1:
          almacen.annadir(articuloDescripcion(), articuloUnidades(), articuloPrecio(),
              articuloPrecio());
          System.out.println("");
          break;

        // ELIMINAR ART�CULO
        case 2:
          almacen.eliminar(seleccionarArticulo());
          System.out.println("");
          break;

        // DECREMENTAR EXISTENCIAS
        case 3:
          almacen.decrementar(seleccionarArticulo(), articuloUnidades());
          System.out.println("");
          break;

        // INCREMENTAR EXISTENCIAS
        case 4:
          almacen.incrementar(seleccionarArticulo(), articuloUnidades());
          break;
        
//          LISTAR UN ARTICULO POR EL CÓDIGO
        case 5:
          almacen.mostrar(seleccionarArticulo());
          break;

        // LISTAR ALMACEN
        case 6:
          System.out.println(almacen.toString());
          System.out.println("");
          break;
          
        case 7:
          out = true;
          System.out.println("Hasta la próxima.");
          break;
          
        default:
          System.out.println("");
          System.out.println("Introduzca una opción correcta.");
          escribirCadena();
          break;
      }
    } while (!out);

  }



  /**
   * 
   * @return
   */
  private static int seleccionarArticulo() {
    System.out.println("Introduzca el codigo del articulo: ");
    int valor = escribirEntero();
    return valor;
  }


  /**
   * Dar descripci�n de un art�culo
   * 
   * @return
   */
  private static String articuloDescripcion() {
    System.out.println("Introduce la descripci�n del art�culo.");
    String valor = escribirCadena();
    return valor;
  }


  /**
   * Dar unidades de un art�culo
   * 
   * @return
   */
  private static int articuloUnidades() {
    System.out.println("Introduce las unidades del art�culo.");
    int valor = escribirEntero();
    return valor;
  }


  /**
   * Dar el precio de un art�culo
   * 
   * @return
   */
  private static double articuloPrecio() {
    System.out.println("Introduce precio de compra o precio de venta.");
    double valor = escribirDouble();
    return valor;
  }


  /**
   * Para escribir un String
   * 
   * @return
   */
  public static String escribirCadena() {
    Scanner s = new Scanner(System.in);
    String cadena = s.nextLine();
    return cadena;
  }


  /**
   * Para escribir int y ahorrar lineas en el switch
   * 
   * @return
   */
  public static int escribirEntero() {
    Scanner s = new Scanner(System.in);
    int cadena = s.nextInt();
    return cadena;
  }

  /**
   * Para escribir double y ahorrarnos lineas en el switch
   * 
   * @return
   */
  public static double escribirDouble() {
    Scanner s = new Scanner(System.in);
    double cadena = s.nextDouble();
    return cadena;
  }

}
