import java.util.* ;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // string input
        String one = sc.next() ;
        String multi = sc.nextLine() ;

        System.out.println("input using next : "+one);
        System.out.println("input using nextLine : "+multi);

        // string concatenation
        System.out.println(one+multi);

        // charAt
        for(int i=0 ; i<one.length() ; i++) {
            System.out.println(one.charAt(i));
        }
    }    
}
