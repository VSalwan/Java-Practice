import java.util.*;
class strings{
    public static void main(String args[])
    {
        // String fname="Vishvam";      //string creation 
        // String lname="Salwan";
        // String sentence="kidness is best thing you can do";
        // // string input
        // Scanner sc=new Scanner(System.in);
        // Scanner sc2=new Scanner(System.in);
        // String cname=sc.next();   // does not take space input
        
        // System.out.println(cname);
        // String fcname=sc2.nextLine(); // it also take space in input
        // System.out.println(fcname);
         

        // System.out.println(fname);  //printing of string 
        // System.out.println(lname);
        // System.out.println(sentence); 

        // // string methods
        // // 1. concatination
        // String fullname=fname+" "+lname;
        // System.out.println(fullname);

        // //2.charAt -to print each character of string

        // for(int i=0;i<fullname.length();i++)  // in case of string use length()
        // {
        //     System.out.println(fullname.charAt(i));   // fulname[i] dont work
        // }

        //compare 
        //s1>s2 : +ve value
        //s1==s2: 0
        //s1<s2: -ve value
        String s1="hello";
        String s2="cello";
        //s1> s2 as h> c

        if(s1.compareTo(s2)==0)
        {
            System.out.println("string are equal");
        }
        else if (s1.compareTo(s2)>0)
        {
            System.out.println("first string is greater");
        }
        else{
            System.out.println("Second  string is greater");
        }
        String s3="aabcd";
        String s4="aadad";
        if(s3.compareTo(s4)==0)
        {
            System.out.println("string are equal");
        }
        else if (s3.compareTo(s4)>0)
        {
            System.out.println("first string is greater");
        }
        else{
            System.out.println("Second  string is greater");
        }


        // sunstring
        // stringname.substring(start index, end index)
        // if we give one index it is consider as start index and 
        //by default end index is last one
        String sent="My name is vishvam";
        String n=sent.substring(11);
        String m=sent.substring(11,18);
        System .out.println(n);
        System .out.println(m);

        //String are immutable
        // string to int
        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number);
        // int to str
        int no=123;
        String si=Integer.toString(no);
        System.out.println(si);
        System.out.println(si.length());


        

        
    }
}