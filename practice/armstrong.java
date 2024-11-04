import java.util.*;
class armstrong{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sum=0;
        int no2=no;
        while(no2>=1)
        {
            int dig=no2%10;
            sum+=dig*dig*dig;
            
            no2=no2/10;
        }
        if(sum==no)
        {
            System.out.println("The number is Armstrong number");
        }
        else
        {
            System.out.println("Number is not armstrong number");
        }
    }
}