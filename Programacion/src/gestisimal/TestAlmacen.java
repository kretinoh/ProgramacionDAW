package gestisimal;

import java.util.Scanner;

public class TestAlmacen {

  public static void main(String[] args)
      throws ArticuloExisteException, EsNegativo, ArticuloNoExisteException {
    // GENERAMOS UN ALMACEN
    Almacen almacen = new Almacen();

    // MENU
    MenuAlmacen menu = new MenuAlmacen("Opciones de gesti�n de almac�n", "A�adir art�culo.",
        "Eliminar Art�culo.", "Decrementar existencias.", "Incrementar existencias.",
        "Acceder al art�culo por el c�digo", "Listar almac�n", "Salir del programa");
    boolean out = false;
    do {
      switch (menu.seleccionar()) {
        case 1:
          almacen.annadir(articuloDescripcion(), articuloUnidades(), articuloPrecio(),
              articuloPrecio());
          System.out.println("");
          break;

        case 2:
          almacen.eliminar(seleccionarArticulo());
          System.out.println("");
          break;

        case 3:
          almacen.decrementar(seleccionarArticulo(), articuloUnidades());
          System.out.println("");
          break;

        case 6:
          System.out.println(almacen.toString());
          System.out.println("");
          break;
        default:
          System.out.println("");
          System.out.println("Introduzca una opci�n correcta.");
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
