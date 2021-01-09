import java.util.Arrays;

public class Main  {

	private static int[] mergeSort(int[] array) {
		if (array.length <= 1) {
			return array;
		}

		int midPoin = array.length / 2;

		int[] left = new int[midPoin];
		int[] right;

		if (array.length % 2 == 0) {
			right = new int[midPoin];
		} else {
			right = new int[midPoin + 1];
		}

		for(int i = 0; i < midPoin; i++) {
			left[i] = array[i];
		}

		for(int j = 0; j < right.length; j++){
			right[j] = array[midPoin + j];
		}

		int[] result = new int[array.length];

		left = mergeSort(left);
		right = mergeSort(right);

		result = merge(left, right);

		return result;
	}

	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];

		int leftPointer, rightPointer, resultPointer;

		leftPointer = rightPointer = resultPointer = 0;

		while(leftPointer < left.length || rightPointer < right.length) {
			if (leftPointer < left.length && rightPointer < right.length) {
				if (left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];

				} else {
					result[resultPointer++] = right[rightPointer++];
				}

			} else if (leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			} else if (rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}
		}

		return result;
	}
	
    public static void main(String[] args) {
    	int[] angka = new int[10];

    	for (int i = 0; i < angka.length; i++) {
    		angka[i] = (int)(Math.random() * 100);
    	}

    	System.out.println("Sebelum\n" + Arrays.toString(angka));

    	angka = mergeSort(angka);

    	System.out.println("Sesudah\n" + Arrays.toString(angka));
	}
}