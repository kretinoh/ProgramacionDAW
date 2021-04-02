package gestesimal;

/**
 * 
 * @author Kretinoh
 *
 *         ESTADO codigo, descripcion, stockSeguridad, stockMaximo, precioCompra,
 *         precioVenta,numUnidades (NUNCA NEGATIVAS)
 * 
 *         COMPORTAMIENTO - CODIGO GENERADO AUTOMÁTICAMENTE EN EL CONSTRUCTOR - QUITAR SETTERS DEL HEAD
 *         CÓDIGO - MOSTRAR ARTICULO (toString)
 *         CÓDIGO - MOSTRAR ARTICULO (toString)
>>>>>>> branch 'master' of https://github.com/kretinoh/ProgramacionDAW.git
 */

public class Articulo {
  static private int codigoArticulo = 0;

  int codigo, numUnidades, stockSeguridad, stockMaximo;
  double precioCompra, precioVenta;
  String descripcion;


  /**
   * Constructor full
   * 
   * @param codigo
   * @param descripcion
   * @param numUnidades
   * @param precioCompra
   * @param precioVenta
   * @throws EsNegativoException
   */
  public Articulo(String descripcion, int numUnidades, double precioCompra, double precioVenta)
      throws EsNegativoException {

    // Nuestro 'codigo' va a aumentar cada vez que se cree un art�culo
    this.codigo = codigoArticulo++;
    setDescripcion(descripcion);
    setNumUnidades(numUnidades);
    setPrecioVenta(precioVenta);
    setPrecioCompra(precioCompra);
  }

  // Constructor usado para hacer referencia a el
  public Articulo(int codigo) {
    this.codigo = codigo;
  }

  // GETTER AND SETTERS

  /**
   * 
   * @return
   */
  protected int getNumUnidades() {
    return numUnidades;
  }


  /**
   * 
   * @param numUnidades
   * @throws EsNegativoException
   */
  protected void setNumUnidades(int numUnidades) throws EsNegativoException {
    if (numUnidades > 0) {
      this.numUnidades = numUnidades;
    } else {
      throw new EsNegativoException("El número de unidades no puede ser negativo");
    }
  }

  /**
   * 
   * @param unidades
   * @throws EsNegativoException
   */
  protected void restarUnidades(int unidades) throws EsNegativoException {
    int aux = this.numUnidades - unidades;
    if (aux < 0) {
      throw new EsNegativoException("El número de unidades no puede ser negativo");
    } else {
      this.numUnidades = aux;
    }
  }

  protected void aumentarUnidades(int unidades) {
    int aux = this.numUnidades + unidades;
  }


  /**
   * 
   * @return
   */
  protected int getStockSeguridad() {
    return stockSeguridad;
  }


  /**
   * 
   * @param stockSeguridad
   */
  protected void setStockSeguridad(int stockSeguridad) {
    this.stockSeguridad = stockSeguridad;
  }


  /**
   * 
   * @return
   */
  protected int getStockMaximo() {
    return stockMaximo;
  }


  /**
   * 
   * @param stockMaximo
   */
  protected void setStockMaximo(int stockMaximo) {
    this.stockMaximo = stockMaximo;
  }


  /**
   * 
   * @return
   */
  protected double getPrecioCompra() {
    return precioCompra;
  }


  /**
   * 
   * @param precioCompra
   * @throws EsNegativoException
   */
  protected void setPrecioCompra(double precioCompra) throws EsNegativoException {
    if (precioCompra > 0) {
      this.precioCompra = precioCompra;
    } else {
      throw new EsNegativoException("El precio de compra no puede ser negativo");
    }
  }


  /**
   * 
   * @return
   */
  protected double getPrecioVenta() {
    return precioVenta;
  }


  /**
   * 
   * @param precioVenta
   * @throws EsNegativoException
   */
  protected void setPrecioVenta(double precioVenta) throws EsNegativoException {
    if (precioVenta > 0) {
      this.precioVenta = precioVenta;
    } else {
      throw new EsNegativoException("El precio de venta no puede ser negativo");
    }
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
/**
 * Añadimos un \n para el salto de linea
 */
  @Override
  public String toString() {
    return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", num de unidades="
        + numUnidades + ", precio de compra=" + precioCompra + ", precio de venta=" + precioVenta
        + "] \n";
  }



}
