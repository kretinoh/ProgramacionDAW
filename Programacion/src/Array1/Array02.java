package Array1;

public class Array02 {

	public static void main(String[] args) {
		String[] simbolo = new String[9];
		
		simbolo[0] = "a";
		simbolo[1] = "x";
		simbolo[4] = "@";
		simbolo[6] = " ";
		simbolo[7] = "+";
		simbolo[8] = "Q";
		
		for (int i = 0; i < simbolo.length; i++) {
			String string = simbolo[i];
			System.out.println(string);
		}
		
	}

}
