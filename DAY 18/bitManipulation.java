public class bitManipulation {
    public static void OddorEven(int n) {
        int bitmask = 1 ;
        if((n&bitmask)==0) {
            // even
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }

    public static void getithbit(int n , int i) {
        int bitmask = n<<i ;
        if((n&bitmask)==0) {
            System.out.println("ith bit = 0");
        }
        else {
            System.out.println("ith bit = 1");
        }
    }

    public static int setithbit(int n , int i) {
        int bitmask = 1<<i ;
        return n | bitmask ;
    }

    public static int clearithbit(int n , int i ) {
        int bitmask = ~(1<<i) ;
        return n & bitmask ;
    }

    public static int updateithbit(int newbit , int n , int i) {
        n = clearithbit(n, i) ;
        int bitmask = newbit<<i ;
        return n | bitmask ;
    }

    public static int clearIthLastBits(int n , int i ) {
    int bitmask = (~0)<<i ;
    return n & bitmask ;
    }

    public static int clearRangeOfBits(int n , int i,int j) {
        int a = ((~0)<<j+1) ;
        int b = (i<<i)-1 ;
        int bitmask = a|b ;
        return n&bitmask ;
    }

    // fast exponentiation
    public static int fastexpo(int a , int n) {
        int ans = 1 ;
        while(n>0) {
            if((n&1)!=0) {
                ans = ans * a ;
            }
            a = a * a ;
            n = n>>1 ;
        }
        return ans ;
    } 

    public static void main(String[] args) {
        // bitwise AND
        System.out.println((5&6));

        //bitwise OR
        System.out.println((5|6));

        // bitwise XOR
        System.out.println((5^6));

        // 1's complement 
        System.out.println((~5));
        System.out.println((~0));

        // left shift
        System.out.println((5<<2));

        // right shift
        System.out.println((6>>1));

        // Odd or Even
        OddorEven(10);

        // get ith bit
        getithbit(10, 2);

        // set ith bit
        System.out.println(setithbit(10, 2)) ;

        // clear ith bit
        System.out.println(clearithbit(10, 1));

        // update ith bit
        System.out.println(updateithbit(1, 10, 2));

        // clear last ith bits
        System.out.println(clearIthLastBits(15, 2));

        // clear range of bits
        System.out.println(clearRangeOfBits(15, 2, 7));

        // expo 
        System.out.println(fastexpo(3, 5));

    }    
    
}
