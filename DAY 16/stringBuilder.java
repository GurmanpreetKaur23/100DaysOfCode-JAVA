import java.util.* ;
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello") ;

        // get character
        System.out.println(sb.charAt(0));

        // set character
        sb.setCharAt(0, 'y');
        System.out.println(sb);

        // insert character
        sb.insert(0, 'z');
        System.out.println(sb);

        // delete character
        sb.delete(0, 1) ;
        System.out.println(sb);

        // append character
        sb.append(" world") ;
        System.out.println(sb);

        // length 
        System.out.println(sb.length());

        // reverse a string
        int n = sb.length() ;
        for(int i=n-1 ; i>=0 ; i--) {
            System.out.print(sb.charAt(i));
        }

    }
}
