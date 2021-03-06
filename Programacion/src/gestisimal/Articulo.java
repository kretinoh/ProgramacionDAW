package gestisimal;

/**
 * 
 * @author Kretinoh
 *
 *  ESTADO
 *  codigo, descripcion, stock_seguridad, stock_maximo,
 *  precio_compra, precio_venta,num_unidades (NUNCA NEGATIVAS)
 *  
 *  COMPORTAMIENTO
 *  - CODIGO GENERADO AUTOMÁTICAMENTE EN EL CONSTRUCTOR
 *  - QUITAR SETTERS DE CÓDIGO
 *  - MOSTRAR ARTICULO (toString)
 */

public class Articulo {

  int codigo = 0, num_unidades, stock_seguridad, stock_maximo;
  double precio_compra, precio_venta;
  String descripcion;

  
  /**
   *  CONSTRUCTOR
   *  
   * @param codigo
   * @param descripcion
   * @param num_unidades
   * @param stock_seguridad
   * @param stock_maximo
   * @param precio_compra
   * @param precio_venta
   */
  public Articulo(int codigo,String descripcion, int num_unidades, int stock_seguridad, int stock_maximo,
      double precio_compra, double precio_venta) {
    
    // Nuestro 'codigo' va a aumentar cada vez que se cree un artículo
    this.codigo++;
    this.descripcion = descripcion;

    // Si los mencionados son negativos no los meteremos
    if ((!esNegativo((int) precio_compra) && (!esNegativo((int) precio_venta) && (!esNegativo(num_unidades))))) {

      this.num_unidades = num_unidades;
      this.precio_compra = precio_compra;
      this.precio_venta = precio_venta;
    }
 
    this.stock_seguridad = stock_seguridad;
    this.stock_maximo = stock_maximo;
  }
  
// GETTER AND SETTERS
  
  /**
   * 
   * @return
   */
  public int getNum_unidades() {
    return num_unidades;
  }


  /**
   * 
   * @param num_unidades
   */
  public void setNum_unidades(int num_unidades) {
    this.num_unidades = num_unidades;
  }


  /**
   * 
   * @return
   */
  public int getStock_seguridad() {
    return stock_seguridad;
  }


  /**
   * 
   * @param stock_seguridad
   */
  public void setStock_seguridad(int stock_seguridad) {
    this.stock_seguridad = stock_seguridad;
  }


  /**
   * 
   * @return
   */
  public int getStock_maximo() {
    return stock_maximo;
  }


  /**
   * 
   * @param stock_maximo
   */
  public void setStock_maximo(int stock_maximo) {
    this.stock_maximo = stock_maximo;
  }


  /**
   * 
   * @return
   */
  public double getPrecio_compra() {
    return precio_compra;
  }


  /**
   * 
   * @param precio_compra
   */
  public void setPrecio_compra(double precio_compra) {
    this.precio_compra = precio_compra;
  }


  /**
   * 
   * @return
   */
  public double getPrecio_venta() {
    return precio_venta;
  }


  /**
   * 
   * @param precio_venta
   */
  public void setPrecio_venta(double precio_venta) {
    this.precio_venta = precio_venta;
  }


  /**
   * 
   * @return
   */
  public String getDescripcion() {
    return descripcion;
  }


  /**
   * 
   * @param descripcion
   */
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


  // COMPORTAMIENTO

  /**
   * Miramos si el numero es negativo
   * @param o
   * @return
   */
  public boolean esNegativo(int o) {
    if (o < 0) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Articulo [toString()=" + super.toString() + "]";
  }
  
}
