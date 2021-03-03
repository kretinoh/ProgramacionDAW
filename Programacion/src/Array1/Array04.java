package Array1;


public class Array04 {

  public static void main(String[] args) {
    // Defino 3 array de 20 num enteros cada uno

    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    // Cargo el array "numero" con numeros aleatorios entre el 0 y el 100
    for (int i = 0; i < numero.length; i++) {

      // Numero entero entre M y N con M menor que N ambos incluidos
      numero[i] = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);

      // En el array cuadrado se almacena el cuadrado de los valores que hay en el array numero
      cuadrado[i] = numero[i] * numero[i];

      cubo[i] = cuadrado[i] * numero[i];
    }

    System.out.println("Mostramos las columnas");
    System.out.println("   n  │   n²  │    n³\n");

    for (int i = 0; i < 20; i++) {
      System.out.printf("%5d | %5d | %5d\n", numero[i], cuadrado[i], cubo[i]);
    }



  }

}
