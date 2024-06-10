// Enter 3 numbers from the user & make a function to print their average.

import java.util.* ;
public class Average {

    public static int avg(int a , int b , int c) {
        return (a+b+c)/3 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt() ;

        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt() ;

        System.out.println("Enter 3rd Number : ");
        int c = sc.nextInt() ;

        int average = avg(a,b,c) ;
        System.out.println("Average : "+average);
    }
}
