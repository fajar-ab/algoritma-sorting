import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arrayAngka = {5,3,0,4,8,1,6,2,7,9};
		System.out.println("Pengurutan Dengan Selection Sort");
		System.out.println("--------------------------------\n");

		System.out.println("Sebelum di Sorting:\n" + Arrays.toString(arrayAngka));

		selectionSort(arrayAngka);

		System.out.println("\nSesudah di Sorting:\n" + Arrays.toString(arrayAngka));

	}

	private static void selectionSort(int[] angka) {
		for(int i = 0; i < angka.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < angka.length; j++) {
				if(angka[j] < angka[index]) {
					index = j;
				}	
			}
			int temp = angka[index];
			angka[index] = angka[i];
			angka[i] = temp;
		}
	}
}