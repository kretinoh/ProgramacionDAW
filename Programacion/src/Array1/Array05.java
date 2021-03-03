package Array1;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] array = new int[10];
		int minimo = Integer.MIN_VALUE;
		int maximo = Integer.MAX_VALUE;
		int i;

		
		for (i = 0; i < 10; i++) {
			System.out.println("Introduce un número > ");
			array[i] = s.nextInt();
			
			if(array[i]>maximo) {
				maximo=array[i];
			}
			if (array[i]<minimo) {
				minimo=array[i];
			}
		}
		System.out.println();
		
		for (i = 0; i < 10; i++) {
			System.out.println(array[i]);
			if (array[i] == maximo) {
				System.out.println(" máximo");
			}
			if (array[i] == minimo) {
				System.out.println(" mínimo");
			}
			System.out.println();
		}
	
	}

}
