import java.util.Scanner;
public class Multiplication_Of_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        final int N = 50;
        int i,j,k,m,n,p,q,sum;
        int[][] a = new int[N][N];
        int[][] b = new int[N][N];
        int[][] c = new int[N][N];
        System.out.println("Enter Row and Column for First Matrix");
        System.out.print("Enter Row : ");
        m = sc.nextInt();
        System.out.print("Enter Column : ");
        n = sc.nextInt();
        
        System.out.println("Enter First Matrix : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Row and Column of Second Matrix");
        System.out.print("Enter Row : ");
        p = sc.nextInt();
        System.out.print("Enter Column : ");
        q = sc.nextInt();

        System.out.println("Enter Second Matrix : ");
        for(i=0;i<p;i++){
            for(j=0;j<q;j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix is : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix is : ");
        for(i=0;i<p;i++){
            for(j=0;j<q;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        if(n!=p){
            System.out.println("Can not multiply! (Column of 1st Matrix != Row of 2nd Matrix)");
            return;
        }
        else{
            for(i=0;i<m;i++){
                for(j=0;j<q;j++){
                    sum =0;
                    for(k=0;k<n;k++){
                        sum = sum + (a[i][k] * b[k][j]);
                    }
                    c[i][j] = sum;
                }
            }
        }

        System.out.println("Multiplication Of Matrix  Is : ");
        for(i=0;i<m;i++){
            for(j=0;j<q;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
