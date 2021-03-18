package gestisimal;

/**
 * 
 * @author Kretinoh
 *
 *         ESTADO codigo, descripcion, stock_seguridad, stock_maximo, precio_compra,
 *         precio_venta,num_unidades (NUNCA NEGATIVAS)
 * 
 *         COMPORTAMIENTO - CODIGO GENERADO AUTOMÁTICAMENTE EN EL CONSTRUCTOR - QUITAR SETTERS DE
 *         CÓDIGO - MOSTRAR ARTICULO (toString)
 */

public class Articulo {
  static private int CODIGO = 1;

  int codigo, num_unidades, stock_seguridad, stock_maximo;
  double precio_compra, precio_venta;
  String descripcion;


  /**
   * Constructor1
   * 
   * @param codigo
   * @param descripcion
   * @param num_unidades
   * @param precio_compra
   * @param precio_venta
   * @throws EsNegativo
   */
  public Articulo(String descripcion, int num_unidades, double precio_compra, double precio_venta)
      throws EsNegativo {

    // Nuestro 'codigo' va a aumentar cada vez que se cree un artículo
    this.codigo = CODIGO++;
    setDescripcion(descripcion);
    // Si los mencionados son negativos no los meteremos
    setNum_unidades(numeroNegativo(num_unidades));
    this.numeroNegativo((int) precio_compra);
    this.numeroNegativo((int) precio_venta);
  }

  // PREGUNTAR PORQUE SE HACE ESTO
  public Articulo(int codigo) {
    codigo = this.codigo;
  }

  // GETTER AND SETTERS

  /**
   * 
   * @return
   */
  protected int getNum_unidades() {
    return num_unidades;
  }


  /**
   * 
   * @param num_unidades
   */
  protected void setNum_unidades(int num_unidades) {
    this.num_unidades = num_unidades;
  }


  /**
   * 
   * @return
   */
  protected int getStock_seguridad() {
    return stock_seguridad;
  }


  /**
   * 
   * @param stock_seguridad
   */
  protected void setStock_seguridad(int stock_seguridad) {
    this.stock_seguridad = stock_seguridad;
  }


  /**
   * 
   * @return
   */
  protected int getStock_maximo() {
    return stock_maximo;
  }


  /**
   * 
   * @param stock_maximo
   */
  protected void setStock_maximo(int stock_maximo) {
    this.stock_maximo = stock_maximo;
  }


  /**
   * 
   * @return
   */
  protected double getPrecio_compra() {
    return precio_compra;
  }


  /**
   * 
   * @param precio_compra
   */
  protected void setPrecio_compra(double precio_compra) {
    this.precio_compra = precio_compra;
  }


  /**
   * 
   * @return
   */
  protected double getPrecio_venta() {
    return precio_venta;
  }


  /**
   * 
   * @param precio_venta
   */
  protected void setPrecio_venta(double precio_venta) {
    this.precio_venta = precio_venta;
  }


  /**
   * 
   * @return
   */
  protected String getDescripcion() {
    return descripcion;
  }


  /**
   * 
   * @param descripcion
   */
  protected void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


  // COMPORTAMIENTO
  /**
   * 
   * @param numero
   * @throws EsNegativo
   */
  public void numeroNegativo(int numero) throws EsNegativo {
    if (numero < 0) {
      throw new EsNegativo("El número introducido es negativo");
    }
  }



  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Articulo other = (Articulo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Articulo [codigo=" + codigo + ", num_unidades=" + num_unidades + ", precio_compra="
        + precio_compra + ", precio_venta=" + precio_venta + ", descripcion=" + descripcion + "]";
  }



}
