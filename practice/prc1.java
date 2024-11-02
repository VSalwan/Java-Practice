import java.util.*;
public class prc1{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);

    int arr[]=new int[5];
    for(int i=0;i<5;i++)
    {
        arr[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> m=new HashMap<>();
    for(int i=0;i<5;i++)
    {
      if(m.containsKey(arr[i]))
      {
        m.put(arr[i],m.get(arr[i])+1);
      }
      else{
        m.put(arr[i],1);
      }

    }

    for(int key:m.keySet())
    {
        if(m.get(key)>5/2)
        {
            System.out.println(key);
        }
    }



 }
}