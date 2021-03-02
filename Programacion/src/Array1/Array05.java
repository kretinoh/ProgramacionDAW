package Array1;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] array = new int[10];
		int minimo;
		int maximo;
		
		maximo=minimo=array[0];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce un número > ");
			array[i] = s.nextInt();
			
			if(array[i]>maximo) {
				maximo=array[i];
			}
			if (array[i]<minimo) {
				minimo=array[i];
			}
		}
	
	}

}
