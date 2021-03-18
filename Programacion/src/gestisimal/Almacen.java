package gestisimal;

import java.util.ArrayList;

/**
 * 
 * @author KR371N0H
 * 
 *         -Realizar el alta -Realizar baja -Realizar modificación -Entrada de mercancía(incrementa
 *         unidades) -Salida de mercancia(disminuir unidades)
 * 
 *         -- ESTADO -- ARRAYLIST de Artículos (Envoltorio de ArrayList)
 * 
 *         -- COMPORTAMIENTO -- Añadir artículos(no puede haber 2 iguales) Eliminar Artículos
 *         Incrementar Existencias de Artículos (Se delega en la clase Artículo) Decrementa las
 *         existencias de Artículos (nunca por debajo de 0, se delega en la clase Artículo) Devolver
 *         un articulo (para mostrarlo) Para listar el almacén puede devolver una cadena con todos
 *         los artículos del almacen (toString)
 *
 */

public class Almacen {
  /**
   * Almacén de Articulos
   */
  private ArrayList<Articulo> almacen;
  
  /**
   * Constructor
   */
  protected Almacen() {
    this.almacen = new Arraylist<>();
  }

  
  /**
   * Añadir Artículo al Almacén
   * @throws ArticuloExisteException 
   */
  void annadir(int codigo, String descripcion, int num_unidades, int stock_seguridad,
      int stock_maximo, double precio_compra, double precio_venta) throws Exception {
    
    Articulo articulo = new Articulo(codigo, descripcion, num_unidades, stock_seguridad, stock_maximo, precio_compra, precio_venta);
    if (!almacen.contains(articulo)) {
      almacen.add(articulo); 
    }else {
      throw new ArticuloExisteException("El coche ya existe en el Almacén");
    }
  }

}
