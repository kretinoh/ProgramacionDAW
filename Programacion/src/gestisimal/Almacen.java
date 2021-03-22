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
  private ArrayList<Articulo> almacen = new ArrayList<Articulo>();



  /**
   * A�adir Art�culo al Almac�n
   * 
   * @throws ArticuloExisteException
   * @throws EsNegativo 
   */
  void annadir(String descripcion, int num_unidades, double precio_compra, double precio_venta) throws ArticuloExisteException, EsNegativo{
    
    Articulo articulo = new Articulo(descripcion, num_unidades, precio_compra, precio_venta);
    if (!almacen.contains(articulo)) {
      almacen.add(articulo);
    }else {
      throw new ArticuloExisteException("El art�culo ya existe en el almac�n");
    }
  }
  
  void eliminar(int codigo) throws ArticuloNoExisteException {
    Articulo articulo = new Articulo(codigo);
    if (!almacen.contains(articulo)) {
      throw new ArticuloNoExisteException("El articulo no se puede borrar, pues no esxiste en este almac�n");
    }else {
      almacen.remove(articulo);
    }
  }

}
