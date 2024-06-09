// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
//     2 : - (Subtraction) a - b
//     3 : * (Multiplication) a * b
//     4 : / (Division) a / b
//     5 : % (Modulo or remainder) a % b
//     Calculate the result according to the operation given and display it to the user.
    
import java.util.Scanner ;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter 1st Number : ") ;
        int a = sc.nextInt() ;
        System.out.println("Enter 2nd Number : ") ;
        int b = sc.nextInt() ;

        System.out.println("Write number for operation to be performed\n1->Addition\n2->Subtraction\n3->Multiplication\n4->Division\n5->Modulo or Remainder") ;
        int n = sc.nextInt() ; // for operation to be performed

        switch(n) {
            case 1 :
            System.out.println("Addition : ") ;
            System.out.println(a+b) ;
            break ;

            case 2 :
            System.out.println("Subtraction : ") ;
            System.out.println(a-b) ;
            break ;

            case 3 :
            System.out.println("Multiplication : ") ;
            System.out.println(a*b) ;
            break ;

            case 4 :
            System.out.println("Division : ");
            System.out.println(a/b) ;
            break ;

            case 5 :
            System.out.println("Modulo : ") ;
            System.out.println(a%b) ;
            break ;

            default :
            System.out.println("Invalid Numbers.") ;
        }
    }
}
