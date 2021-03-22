package gestisimal;

import java.util.Scanner;

public class TestAlmacen {

  public static void main(String[] args) throws ArticuloExisteException, EsNegativo {
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
          almacen.annadir(articuloDescripcion(), articuloUnidades(), articuloPrecio(), articuloPrecio());
          System.out.println("");
          break;
          
        case 6:
          System.out.println(almacen.toString());
          System.out.println("");
        default:
          break;
      }
    }while(!out);
    
  }
  
  private static String articuloDescripcion() {
    System.out.println("Introduce la descripci�n del art�culo.");
    String valor = escribirCadena(); 
    return valor;
  }
  
  private static int articuloUnidades() {
    System.out.println("Introduce las unidades del art�culo.");
    int valor = escribirEntero();
    return valor;
  }
  
  private static double articuloPrecio() {
    System.out.println("Introduce precio de compra o precio de venta.");
    double valor = escribirDouble();
    return valor;
  }
  
  public static String escribirCadena() {
    Scanner s = new Scanner(System.in);
    String cadena = s.nextLine();
    return cadena;
  }
  
  public static int escribirEntero() {
    Scanner s = new Scanner(System.in);
    int cadena = s.nextInt();
    return cadena;
  }
  
  public static double escribirDouble() {
    Scanner s = new Scanner(System.in);
    double cadena = s.nextDouble();
    return cadena;
  }

}
