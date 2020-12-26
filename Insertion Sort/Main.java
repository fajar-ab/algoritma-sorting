import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arrayAngka = {5,3,0,4,8,1,6,2,7,9};
		System.out.println("Pengurutan Dengan Insertion Sort");
		System.out.println("--------------------------------\n");

		System.out.println("Sebelum di Sorting:\n" + Arrays.toString(arrayAngka));

		insertionSort(arrayAngka);

		System.out.println("\nSesudah di Sorting:\n" + Arrays.toString(arrayAngka));

	}

	private static void insertionSort(int[] angka) {
		for(int i = 1; i < angka.length; i++) {
			int temp = angka[i];
			int j = i - 1;
			while((j >= 0) && (angka[j] > temp)) {
			 	angka[j + 1] = angka[j];
			 	j--;
			}
			angka[j + 1] = temp;
		}
	}
}
