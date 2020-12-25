import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arrayAngka = {5,3,0,4,8,1,6,2,7,9};
		System.out.println("Pengurutan Dengan Bubble Sort");

		System.out.println("Sebelum di Sorting:\n" + Arrays.toString(arrayAngka));

		bubbleSort(arrayAngka);

		System.out.println("\nSesudah di Sorting:\n" + Arrays.toString(arrayAngka));

	}

	private static void bubbleSort(int[] angka) {
		for(int i = 0; i < angka.length; i++) {
			for(int j = 0; j < angka.length - 1; j++) {
				if(angka[j] > angka[j + 1]) {
					int temp = angka[j];
					angka[j] = angka[j + 1];
					angka[j + 1] = temp;
				}	
			}
		}
	}
}