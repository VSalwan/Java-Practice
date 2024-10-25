import java.util.*;
class bitmp{
    public static void main(String args[])
    {
        int a=7;
        int b=8;
        System.out.println(a|b);  // bitwise or
        System.out.println(a&b);  // bitwise and
        System.out.println(a^b);  // bitwise xor
        System.out.println(~a);   // bitwise not

        // diferent processes

        //1. get bit

        int n=5;
        int pos=2;
        int bitmask=1<<pos;

        if((bitmask & n)==0)
        {
            System.out.println("The bit at pos is 0");
        }
        else{
            System.out.println("The bit at pos is 1");
        }

        //2. set bit 
        int n2=5;
        int pos2=1;
        int bitmask2=1<<pos2;
        int nn=bitmask2|n2;
        System.out.println(nn);

        //3. claer bit
        int n3=5;
        int pos3=2;
        int bitmask3= 1<< pos3;
        int mn= ~(bitmask3);
        int nn2=mn & n3;
        System.out.println(nn2);

        //4.update bit 
        // if update is 0to 1 :- same as clear
        // if update is 1 to 0: same as set
        

        
        
        
    }
}