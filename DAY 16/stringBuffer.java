import java.util.* ;
import java.io.*;
public class stringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        StringBuffer str = new StringBuffer("hello") ;

        // append function 
        // str.append(" ok") ;
        // System.out.println(str);

        // insert function
        // str.insert(1,"ok") ;
        // System.out.println(str);

        // replace
        // str.replace(1,3,"ok") ;
        // System.out.println(str);

        // delete
        str.delete(1,3) ;
        System.out.println(str) ;
    }
}
