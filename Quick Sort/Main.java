import java.util.Scanner;

public class Main {

    final static int MAX = 200;
    private static int[] arrAngka = new int[MAX];
    private static int data;

    private static void display() {
        System.out.print("[");
        for (var i = 0; i < data; i++) {
            System.out.printf(" %d ", arrAngka[i]);
        }
        System.out.println("]");
    }

    private static void swap(int num1, int num2) {
        int temp = arrAngka[num1];
        arrAngka[num1] = arrAngka[num2];
        arrAngka[num2] = temp;
    }

    private static int partision(int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;

        while (true) {
            while (arrAngka[++leftPointer] < pivot) {
                // do nothing
            }

            while (rightPointer > 0 && arrAngka[--rightPointer] > pivot) {
                // do nothing
            }

            if (leftPointer >= rightPointer) {
                break;
            } else {
                System.out.printf(" pivot swaped : %d,%d\n", arrAngka[leftPointer], arrAngka[rightPointer]);
                swap(leftPointer, rightPointer);
            }
        }

        System.out.printf(" pivot swaped : %d, %d\n", arrAngka[leftPointer], arrAngka[right]);
        swap(leftPointer, right);

        System.out.print("update array  : ");
        display();

        return leftPointer;
    }

    private static void quickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arrAngka[right];
            int partitionPoin = partision(left, right, pivot);
            quickSort(left, partitionPoin - 1);
            quickSort(partitionPoin + 1, right);
        }
    }

    private static void inputRandom() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyak data : ");
        data = scanner.nextInt();

        for (var i = 0; i < data; i++) {
            arrAngka[i] = (int) (1 + (Math.random() * 100));
        }
    }

    public static void main(String[] args){ 
      
        inputRandom();

        System.out.println("\nInput Arrays : ");
        display();
        System.out.println();

        quickSort(0, data - 1);

        System.out.println("\nOutput Arrays : ");
        display();
    }
}
