import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int val, int left, int right) {
        int flag = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == val) {
                flag = mid;
                break;
            } else if (arr[mid] > val) {
                return binarySearch(arr, val, left, mid - 1);
            } else {
                return binarySearch(arr, val, mid + 1, right);
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

        int ans = binarySearch(arr, val, 0, len - 1);

        if (ans != -1) {
            System.out.println("The value is found at " + (ans + 1) + " position");
        } else {
            System.out.println("The value is not present in the array");
        }

        scanner.close();
    }
}

