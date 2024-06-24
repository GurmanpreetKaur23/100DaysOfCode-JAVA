import java.util.*;

public class array_STL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaration and initialization of array
        int[] arr = {5, 7, 3, 1, 8};

        // Accessing array elements
        int first = arr[0];
        System.out.println("First element of array: " + first);

        // Iterating through the array using a for loop
        System.out.println("Iteration through for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // to move to the next line after printing array elements

        // Iterating through the array using a for-each loop
        System.out.println("Iteration through for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // to move to the next line after printing array elements

        // Array operations

        // Length of the array
        int length = arr.length;
        System.out.println("Length of array: " + length);

        // Copying the array
        int[] copy = Arrays.copyOf(arr, length);
        System.out.println("Copied array: " + Arrays.toString(copy)); // Print copied array using Arrays.toString()

        // Sorting the original array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr)); // Print sorted array using Arrays.toString()

    }
}
