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
 *         -- COMPORTAMIENTO -- A�adir art�culos(no puede haber 2 iguales) Eliminar Art�culos
 *         Incrementar Existencias de Artículos (Se delega en la clase Artículo) Decrementa las
 *         existencias de Artículos (nunca por debajo de 0, se delega en la clase Artículo) Devolver
 *         un articulo (para mostrarlo) Para listar el almac�n puede devolver una cadena con todos
 *         los artículos del almacen (toString)
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
   * @throws EsNegativoException
   */
  void annadir(String descripcion, int num_unidades, double precio_compra, double precio_venta)
      throws ArticuloExisteException, EsNegativoException {

    Articulo articulo = new Articulo(descripcion, num_unidades, precio_compra, precio_venta);
    if (!almacen.contains(articulo)) {
      almacen.add(articulo);
    } else {
      throw new ArticuloExisteException("El artículo ya existe en el almacén");
    }
  }


  /**
   * Eliminar articulo del Almac�n
   * 
   * @param codigo
   * @throws ArticuloNoExisteException
   */
  void eliminar(int codigo) throws ArticuloNoExisteException {
    Articulo articulo = new Articulo(codigo);
    if (!almacen.contains(articulo)) {
      throw new ArticuloNoExisteException(
          "El artículo no se puede borrar, pues no existe en este almacén");
    } else {
      almacen.remove(articulo);
    }
  }

  /**
   * Decrementar unidades de un artículo
   * 
   * @param codigo
   * @param cantidad
   * @throws ArticuloNoExisteException
   * @throws EsNegativoException
   */
  void decrementar(int codigo, int cantidad) throws ArticuloNoExisteException, EsNegativoException {
    Articulo articulo = new Articulo(codigo);
    if (!almacen.contains(articulo)) {
      throw new ArticuloNoExisteException(
          "No se puede modificar las unidades, pues no se encuentra el artículo en este almacén");
    } else {
      Articulo articuloFin = this.almacen.get(almacen.indexOf(articulo));
      articuloFin.restarUnidades(cantidad);
    }
  }

  /**
   * Sumamos unidades a un artículo
   * 
   * @param codigo
   * @param cantidad
   * @throws ArticuloNoExisteException
   */
  void incrementar(int codigo, int cantidad) throws ArticuloNoExisteException {
    Articulo articulo = new Articulo(codigo);
    if (!almacen.contains(articulo)) {
      throw new ArticuloNoExisteException(
          "No se puede añadir unidades, pues no se encuentra el artículo especificado en este almacén");
    } else {
      Articulo articuloFin = this.almacen.get(almacen.indexOf(articulo));
      articuloFin.aumentarUnidades(cantidad);
    }

  }
  
  /**
   * 
   * @param codigo
   * @return
   * @throws ArticuloNoExisteException
   */
  public String mostrar(int codigo) throws ArticuloNoExisteException {
    Articulo articulo = new Articulo(codigo);
    if (!almacen.contains(articulo)) {
      throw new ArticuloNoExisteException("El artículo a listar no está en este almacen");
    }else {
      return this.almacen.get(this.almacen.indexOf(articulo)).toString();
    }
  }

  @Override
  public String toString() {
    return "Almacen [almacen=" + almacen + "]";
  }



}
