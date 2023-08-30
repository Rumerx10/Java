import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("number of n: ");
        int n = s.nextInt();
        System.out.print("number of m: ");
        int m = s.nextInt();

        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("The transpose is: ");

        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}