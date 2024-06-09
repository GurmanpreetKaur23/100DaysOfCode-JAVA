// Write a function to multiply 2 numbers.

import java.util.* ;
public class multiply {

    public static int multiplyFunc(int a , int b) {
        return a*b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;

        int result = multiplyFunc(a, b) ;
        System.out.println(result);
    }
}
