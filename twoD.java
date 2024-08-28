import java.util.Scanner;
class twoD
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix= new int[rows][columns];
        System.out.print("Enter the number of rows:");
        int rows= sc.nextInt();

        System.out.print("Enter the number of column:");
        int columns= sc.nextInt();

        System.out.print("Enter the matrix value:");
        for(int i =0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
    }
}