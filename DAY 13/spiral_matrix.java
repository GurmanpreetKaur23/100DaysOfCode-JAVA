import java.util.* ;

public class spiral_matrix {
    public static void input(int m , int n , int mat[][]) {
        Scanner sc = new Scanner(System.in) ;
        for(int i = 0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                mat[i][j] = sc.nextInt() ;
            }
        }
    }   

    public static void spiral(int m , int n , int mat[][]) {
        int endRow = m-1 ;
        int endCol = n-1 ;
        int startRow = 0 ;
        int startCol = 0 ;

        while(startRow<=endRow && startCol<=endCol) {
            // top 
            for(int i=startCol ; i<=endCol ; i++) {
                System.out.print(mat[startRow][i]+" ");
            }

            // right 
            for(int i=startRow+1 ; i<=endRow ; i++) {
                System.out.print(mat[i][endCol]+" ");
            }

            // bottom
            for(int j = endCol-1 ; j>=startCol ; j--) {
                System.out.print(mat[endRow][j]+" ");
            }

            // left
            for(int j = endRow-1 ; j>=startRow+1 ; j--) {
                System.out.print(mat[j][startCol]+" ");
            }

            startCol++ ;
            startRow++;
            endCol--;
            endRow-- ;
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

        System.out.println("spiral order : ");
        spiral(m, n, matrix);
    }
}
