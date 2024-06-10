// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.* ;
public class circumference {
    public static int ans(int r) {
        int circum = 2* r;
        return circum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() ;

        int circum = ans(a) ;
        System.out.println(circum);
    }
}
