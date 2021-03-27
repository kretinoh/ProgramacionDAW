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
  void annadir(String descripcion, int num_unidades, double precio_compra, double precio_venta)
      throws ArticuloExisteException, EsNegativo {

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
          "El artículo no se puede borrar, pues no esxiste en este almacén");
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
   * @throws EsNegativo
   */
  void decrementar(int codigo, int cantidad) throws ArticuloNoExisteException, EsNegativo {
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
