/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
class countprimedigits{
    public static boolean isprime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int cnt=0;
        while(no>=1)
        {
            int digit=no%10;
          
    
            if(isprime(digit))
            {
               
                cnt++;
            }
            no=no/10;
        }
        System.out.println(cnt);

    }
}
