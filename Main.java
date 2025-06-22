
// Edited from sorting-logic branch
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        sortArray(numbers);

        System.out.print("Sorted array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        int secondLowest = findSecondLowest(numbers);
        int secondHighest = findSecondHighest(numbers);

        System.out.println("\nSecond Lowest: " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);
    }

    static void sortArray(int[] arr) {
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int findSecondLowest(int[] arr) {
        for (int i = 1; i < 5; i++) {
            if (arr[i] != arr[0]) {
                return arr[i];
            }
        }
        return arr[0];
    }

    static int findSecondHighest(int[] arr) {
        for (int i = 3; i >= 0; i--) {
            if (arr[i] != arr[4]) {
                return arr[i];
            }
        }
        return arr[4];
    }
}
