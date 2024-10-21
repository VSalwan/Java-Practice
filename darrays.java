import java.util.*;
class darrays{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    int rows=sc.nextInt();
    int col=sc.nextInt();

    int numbers[][]=new int[rows][col]; // 1st way declare 2d arrays
    int[][] cas=new int[rows][col]; // 2nd way to declare 2d arrays

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<col;j++)
        {
            numbers[i][j]=sc.nextInt();
        }
    }

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<col;j++)
        {
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }
    }
}