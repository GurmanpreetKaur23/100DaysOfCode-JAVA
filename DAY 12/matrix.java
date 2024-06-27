import java.util.* ;
public class matrix {
    // function to take input of matrix 
    public static void input(int m, int n , int mat[][]) {
        // m -> rows , n -> cols
        Scanner sc= new Scanner(System.in) ;
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ;j<n ; j++) {
                mat[i][j] = sc.nextInt() ;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt() ;

        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt() ;

        int[][] matrix = new int[m][n] ;

        input(m, n, matrix);
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    
}
