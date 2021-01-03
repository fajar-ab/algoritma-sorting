import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arrayAngka = {5,3,0,4,8,1,6,2,7,9};

		System.out.println("Pengurutan Dengan Shell Sort");
		System.out.println("--------------------------------\n");

		System.out.println("Sebelum di Sorting:\n" + Arrays.toString(arrayAngka));

		shellSort(arrayAngka);

		System.out.println("\nSesudah di Sorting:\n" + Arrays.toString(arrayAngka));
	}

	// method pengurutan secara ascending menggunakan shell sort.
	private static void shellSort(int[] angka) {  

		for (int i = angka.length / 2; i > 0; i = i / 2)  {    
			for (int j = i; j < angka.length; j++) {    
				for(int k = j - i; k >= 0; k = k - i) {    
					if (angka[k+i] >= angka[k])    
						break;    
					else  {    
						int temp = angka[k];    
						angka[k] = angka[k+i];    
						angka[k+i] = temp;    
					}    
				}    
			}    
		} 
	}
}