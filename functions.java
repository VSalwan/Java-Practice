import java.util.*;
class functions{
    public static int factorial(int n)
    {
        int ans=1;
        while(n>=1)
        {
            ans=ans*n;
            n=n-1;
        }
        return ans;
    }
    public static int multiply(int a, int b)
    {
        return a*b;
    }
    public static void  printName(String name){
        System.out.print(name);
        return;
    }
    public static int sum(int a,int b){
        return a+b;
    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int ans=sum(a,b);
    int mans=multiply(a,b);
    int n =sc.nextInt();
    int fans= factorial(n);

    System.out.println(ans);
    System.out.println(mans);
    System.out.println(fans);

    printName(name);
   }
}