import java.util.*;

public class conditionals{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(age> 18)
        {
            System.out.println("Adult");

        }
        else
        {
            System.out.println("Not Adult");
        }
// practice question check if no is even or odd
        int number= sc.nextInt();
        if(number%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }

// if-else
int a= sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
{
    System.out.println("a is greatest number");
}
else if(b>c && b>a)
{
    System.out.println("b is greates number");
}
else{
    System.out.println("c is greates number");
}
    
int button=sc.nextInt();
if(button==1)
{
    System.out.println("Hello");
}
else if (button==2)
{
    System.out.println("Namaste");
}
else if (button==3)
{
    System.out.println("Bonjour");
}
else
{
    System.out.println("Invalid Button");
}
}
}