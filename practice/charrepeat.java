// aabbbcc = a2b3c2
// abbccc = a1b2c3

import java.util.*;
class charrepeat{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // int arr[]=new int(26);
        StringBuilder sb=new StringBuilder();
        
        int cnt=1;
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
         if(s.charAt(i)==ch)
         {
            cnt++;
         }
         else{
            sb.append(ch);
            String str=Integer.toString(cnt);
            sb.append(str);
            ch=s.charAt(i);
            cnt=1;
         }

        }
        sb.append(ch);
        String str=Integer.toString(cnt);
        sb.append(str);

        System.out.println(sb);
    }
}