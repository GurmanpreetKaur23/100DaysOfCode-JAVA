// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class greater {
    public static int greaterele(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        
        int ans = greaterele(a, b);
        System.out.println("The greater number is: " + ans);
    }
}

