import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int val, int len) {
        int flag = -1;
        for (int j = 0; j < len; j++) {
            if (arr[j] == val) {
                flag = j;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the arr[" + i + "] element: ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to be searched for: ");
        int val = scanner.nextInt();

        int ans = linearSearch(arr, val, len);

        if (ans != -1) {
            System.out.println("The value is found at " + (ans + 1) + " position");
        } else {
            System.out.println("The value is not present in the array");
        }

        scanner.close();
    }
}
