import java.util.*;
class sbuilder{
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Vishvam");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));

        // set character
        sb.setCharAt(0,'S');   // two parameters 1.index 2. New character
        System.out.println(sb);

        // insert a character
        sb.insert(0,'V');  // two parameters 1. index 2.. char to be inserted
        System.out.println(sb);

        // delete a character
        sb.delete(0,1);  // 2 paramters 1. starting index  2. ending index(non inclusive)
        System.out.println(sb);

        // apend character at last
        sb.append("a");
        System.out.println(sb);  // in same string changes are made

        // to calculate length
        System.out.println(sb.length());


        // ques reverse a string
        StringBuilder sb2=new StringBuilder("Sello");
        for(int i=0;i<sb2.length()/2;i++)
        {
            int front=0;
            int end=sb2.length()-1;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(end);

            sb2.setCharAt(front,backchar);
            sb2.setCharAt(end,frontchar);

            
            
        }
        System.out.println(sb2);
        


    }
}