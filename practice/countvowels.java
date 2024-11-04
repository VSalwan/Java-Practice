import java.util.*;
class countvowels{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int v=0;
        int c=0;
        int num=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                v++;
            }
            else if(ch>='1'&& ch<='9')
            {
                num++;
            }
            else{
                c++;
            }
        }
        System.out.println(v);
        System.out.println(c);
        System.out.println(num);
        
    }
}