/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4*/
import java.util.*;
class countword{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        System.out.println(s.length);

    }
}