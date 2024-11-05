import java.util.*;
class fibonacci{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        System.out.print(f+" ");
        int k;
        int s=1;
        System.out.print(s+" ");
        int cnt=2;

        while(cnt<=n)
        {
            k=f+s;
            System.out.print(k+" ");
            f=s;
            s=k;
            cnt++;
        }

    }
}