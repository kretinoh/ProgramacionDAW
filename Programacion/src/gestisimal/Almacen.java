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
  private ArrayList<Articulo> almacen = new ArrayList<Articulo>();



  /**
   * Añadir Artículo al Almacén
   * 
   * @throws ArticuloExisteException
   * @throws EsNegativo 
   */
  void annadir(String descripcion, int num_unidades, double precio_compra, double precio_venta) throws ArticuloExisteException, EsNegativo{
    
    Articulo articulo = new Articulo(descripcion, num_unidades, precio_compra, precio_venta);
    if (!almacen.contains(articulo)) {
      almacen.add(articulo);
    }else {
      throw new ArticuloExisteException("El artículo ya existe en el almacén");
    }
  }
  
  void eliminar(int codigo) throws ArticuloNoExisteException {
    Articulo articulo = new Articulo(codigo);
    if (!almacen.contains(articulo)) {
      throw new ArticuloNoExisteException("El articulo no se puede borrar, pues no esxiste en este almacén");
    }else {
      almacen.remove(articulo);
    }
  }

}
