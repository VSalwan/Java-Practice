import java.util.*;
class calculator{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=sc.nextInt();
        System.out.println("Enter the second number:");
        int n2=sc.nextInt();
        System.out.println("Enter the operation to be performed:");
        char ch=sc.next().charAt(0);
        if(ch=='+')
        {
            System.out.println("The result is :"+ (n1+n2));

        }
        else if(ch=='-')
        {
            System.out.println("The result is :"+ (n1-n2));
        }
        else if(ch=='*')
        {
            System.out.println("The result is :"+ (n1*n2));
        }
        else if(ch=='/')
        {
            System.out.println("The result is :"+ (n1/n2));
        }
        else{
            System.out.println("Please enter valid operation");
        }


    }
}