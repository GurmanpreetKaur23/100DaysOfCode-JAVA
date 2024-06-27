import java.util.* ;
public class search_in_matrix {
    // input elements
    public static void input(int m , int n , int mat[][]) {
        Scanner sc = new Scanner(System.in) ;
        // m->rows , n->columns
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                mat[i][j] = sc.nextInt() ;
            }
        } 
    }

    // to search 
    public static void search(int m , int n , int mat[][],int k) {
        Scanner sc= new Scanner(System.in) ;
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(mat[i][j]==k) {
                    System.out.println(k+" found at "+i+" "+j);
                }
                else{
                    System.out.println(k+" not in matrix");
                }
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

        System.out.println("enter element to be searched : ");
        int k = sc.nextInt() ;
        search(m, n, matrix, k);
    }
}
