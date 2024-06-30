import java.util.* ;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;
        System.out.println("Original String : "+str);

        System.out.print("Reversed String : ");
        int n = str.length() ;
        for(int i=n-1 ; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
