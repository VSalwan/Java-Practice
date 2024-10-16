import java.util.*;
class patterns{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);


        // Ques 1 print star in all rows and columns
        int rows=5;
        int col=5;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // Ques 2 hollow Rectangle
        for(int i=0;i<rows;i++)
        {
            if(i==0 || i==rows-1)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                for(int j=0;j<col;j++)
                {
                    if(j==0 || j==col-1)
                    {
                        System.out.print("*"); 
                    }
                    else
                    {
                        System.out.print(" ");    
                    }
                }
                System.out.println();
            }
        }

        for(int i=0;i<rows; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        // Inverted half pyramid
        for(int i=0;i<rows; i++)
        {
            for(int j=rows-i;j>0;j--)
            {
                System.out.print("*"); 
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        //  Inverted half pyramid(rotated by 180 degrees)
       for(int i=0;i<rows; i++)
        {
            for(int j=0;j<=rows;j++)
            {
                
                if(j<rows-i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                    
               
            }
            System.out.println();
        }

        // printing next pattern
        System.out.println();
        System.out.println();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println(); 
        }
        System.out.println();
        System.out.println();
         // printing next pattern

         for(int i=0;i<rows;i++)
         {
            for(int j=0;j<rows-i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println(); 
         }
         System.out.println();
         System.out.println();
          // printing next pattern
          int cnt=1;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(cnt); 
                cnt++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
         // printing next pattern
         int cnt2=0;

         for(int i=0;i<rows;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 System.out.print(cnt2); 
                 if(cnt2==0)
                 {
                    cnt2=1;
                 }
                 else
                 {
                    cnt2=0;
                 }
             }
             System.out.println();
         }
         System.out.println();
         System.out.println();
        // printing next pattern
        


    }
}