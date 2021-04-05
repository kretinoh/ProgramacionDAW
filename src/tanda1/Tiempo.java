package tanda1;

public class Tiempo {
  int horas, minutos, segundos;

  /**
   * 
   * @param horas
   * @param minutos
   * @param segundos
   */
  public Tiempo(int horas, int minutos, int segundos) {
    setHoras(horas);
    setMinutos(minutos);
    setSegundos(segundos);
  }

  // METODOS

  /**
   * Sumamos el tiempo y lo devolvemos
   * @param t
   * @return
   */
  public Tiempo sumarTiempo(Tiempo t) {
    return new Tiempo(this.horas + t.horas, this.minutos + t.minutos, this.segundos + t.segundos);
  }

  /**
   * Restamos el tiempo y lo devolvemos
   * @param t
   * @return
   */
  public Tiempo restarTiempo(Tiempo t) {
    return new Tiempo(this.horas - t.horas, this.minutos - t.minutos, this.segundos - t.segundos);
  }

  /**
   * Cambiamos el objeto actual sumandole segundos
   * 
   * @param segundos
   */
  public void sumarSegundos(int valor) {
    this.segundos += valor;
  }
  
  /**
   * Cambiamos el objeto actual sumandole minutos
   * @param minutos
   */
  public void sumarMinutos(int valor) {
    this.minutos += valor;
  }
  
  /**
   * Cambiamos el objeto actual sumandole horas
   * @param horas
   */
  public void sumarHoras(int valor) {
    this.horas += valor;
  }
  
  /**
   * Cambiamos el objeto actual restandole segundos
   * @param valor
   */
  public void restarSegundos(int valor) {
    this.segundos -= valor;
  }
  
  /**
   * Cambiamos el objeto actual restandole minutos
   * @param valor
   */
  public void restarMinutos(int valor) {
    this.minutos -= valor;
  }
  
  /**
   * Cambiamos el objeto actual restandole horas
   * @param valor
   */
  public void restarHoras(int valor) {
    this.horas -= valor;
  }
  
  
  @Override
  public String toString() {
    return horas + "h " + minutos + "m " + segundos + "s";
  }

  // GETTER AND SETTERS



  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }


}
