import java.util.*;
class countlowercaseletter{

    public static void main(String args[])
    {
        int cnt=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z')
            {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}