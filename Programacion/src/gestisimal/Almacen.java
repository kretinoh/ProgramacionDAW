package gestisimal;

import java.util.ArrayList;

/**
 * 
 * @author KR371N0H
 * 
 *         -Realizar el alta -Realizar baja -Realizar modificaci�n -Entrada de mercanc�a(incrementa
 *         unidades) -Salida de mercancia(disminuir unidades)
 * 
 *         -- ESTADO -- ARRAYLIST de Art�culos (Envoltorio de ArrayList)
 * 
 *         -- COMPORTAMIENTO -- A�adir art�culos(no puede haber 2 iguales) Eliminar Art�culos
 *         Incrementar Existencias de Art�culos (Se delega en la clase Art�culo) Decrementa las
 *         existencias de Art�culos (nunca por debajo de 0, se delega en la clase Art�culo) Devolver
 *         un articulo (para mostrarlo) Para listar el almac�n puede devolver una cadena con todos
 *         los art�culos del almacen (toString)
 *
 */

public class Almacen {
  /**
   * Almac�n de Articulos
   */
  private ArrayList<Articulo> almacen;
  
  /**
   * Constructor
   */
  protected Almacen() {
    this.almacen = new Arraylist<>();
  }

  
  /**
   * A�adir Art�culo al Almac�n
   * @throws ArticuloExisteException 
   */
  void annadir(int codigo, String descripcion, int num_unidades, int stock_seguridad,
      int stock_maximo, double precio_compra, double precio_venta) throws Exception {
    
    Articulo articulo = new Articulo(codigo, descripcion, num_unidades, stock_seguridad, stock_maximo, precio_compra, precio_venta);
    if (!almacen.contains(articulo)) {
      almacen.add(articulo); 
    }else {
      throw new ArticuloExisteException("El coche ya existe en el Almac�n");
    }
  }

}
