package gestisimal;

public class TestArticulo {

  public static void main(String[] args) throws EsNegativo {
    Articulo art = new Articulo("Galletas", 5, 10, 50);
    Articulo art2 = new Articulo( "Chanclas", 14, 5, 7);
    
    System.out.println(art);
    System.out.println(art2);
  }

}
