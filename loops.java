import java.util.*;
class loops{
    public static void main(String args[])
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }

        // while loop
        int i=0;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }

        // do-while loop
        // it run alteast once

        int j=0;
        do{
            System.out.println(j);
            j++;
        }while(j<11);  // put terminator

        // print sum to n natural number

        int sum=0;
        int n=10;
        for(int k=1;k<=n;k++)
        {
            sum+=k;
        }
        System.out.println("Sum of n natural no is-> "+ sum);

        // print table of n 
        int no=8;
        for(int l=1;l<=10;l++)
        {
            System.out.println("8 * "+ l+"="+8*l);
        }

    }
}
